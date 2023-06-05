package com.onectrm.akshare.api.generator;

import net.sourceforge.pinyin4j.PinyinHelper;
import org.apache.commons.lang3.StringUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AkshareJavaApiGeneratorApplication {

    TemplateEngine templateEngine = new TemplateEngine();

//    ServletContextTemplateResolver templateResolver =
//            new ServletContextTemplateResolver(servletContext);
//更多请阅读：https://www.yiibai.com/thymeleaf/thymeleaf-project.html


    public void run(String... args) throws Exception {
        FileTemplateResolver resolver = new FileTemplateResolver();
        resolver.setCharacterEncoding("UTF-8");

        templateEngine.setTemplateResolver(resolver);
        var files = Files.find(
                        Path.of("./docs"),
                        Integer.MAX_VALUE, (filePath, fileAttr) -> fileAttr.isRegularFile() && filePath.toString().endsWith(".md"))
                .collect(Collectors.toList());

        List<AKShareRawAPI> rawAPIS = new LinkedList<>();

        for (var file : files) {
            var lst = parseAKShareRawAPI(file);
            rawAPIS.addAll(lst);
        }

        var apis = rawAPIS.stream().map(api -> generateAPIClass(api)).flatMap(List::stream).collect(Collectors.toList());
        var inputApis = rawAPIS.stream().map(api -> generateAPIClassNoDuplicate(api)).flatMap(List::stream).collect(Collectors.toList());
        var output =  "./generated/src";
        var output1 =  "./boat/src";

        for (AKShareAPIClass api : apis) {
            System.out.println("save class - " + api.getClassName());
            saveAPI(output, api);
        }

        AKShareAPIClasses classes = new AKShareAPIClasses();
        classes.setClasses(inputApis);

        System.out.println("successfully save all classes into " + output);

        var apis1 = rawAPIS.stream().map(api -> generateAPIRespClass(api)).flatMap(List::stream).collect(Collectors.toList());
        var apis2 = rawAPIS.stream().map(api -> generateAPIRespClassNoDuplicate(api)).flatMap(List::stream).collect(Collectors.toList());
        classes.setOutputs(apis2);
        saveAPIClasses(output1, classes);

        for (AKShareAPIClass api : apis1) {
            System.out.println("save class - " + api.getClassName());
            saveAPIResp(output1, api);
        }

        System.out.println("successfully save all classes into " + output);

        return;
    }

    private void saveAPIClasses(String rootFolder, AKShareAPIClasses cls) throws IOException {
        var path = Paths.get(rootFolder, "packages");
        var folder = Files.createDirectories(path);

        Context context = new Context();
        context.setVariable("api", cls);

        var str = templateEngine.process("AKShareAPIClasses.html", context);

        Files.writeString(Paths.get(folder.toString(),  "List.scala"), str, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    private void saveAPIResp(String rootFolder, AKShareAPIClass cls) throws IOException {
        var path = Paths.get(rootFolder, cls.getPackageName().replace(".", "/"));
        var folder = Files.createDirectories(path);

        Context context = new Context();
        context.setVariable("api", cls);

        var str = templateEngine.process("AKShareAPIClassResp.html", context);

        Files.writeString(Paths.get(folder.toString(), cls.getClassName() + ".scala"), str, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    private void saveAPI(String rootFolder, AKShareAPIClass cls) throws IOException {
        var path = Paths.get(rootFolder, cls.getPackageName().replace(".", "/"));
        var folder = Files.createDirectories(path);

        Context context = new Context();
        context.setVariable("api", cls);

        var str = templateEngine.process("AKShareAPIClass.html", context);

        Files.writeString(Paths.get(folder.toString(), cls.getClassName() + ".java"), str, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    private List<AKShareAPIClass> generateAPIClassNoDuplicate(AKShareRawAPI rawAPI) {
        var packageName = "com.onectrm.akshare.api.generated." + rawAPI.getCategory();
        var reqClassName = rawAPI.getInterfaceName() + "Request";
        var respClassName = rawAPI.getInterfaceName() + "Response";

        var reqClass = generateAPIClass(packageName, reqClassName, rawAPI.getInput());
        reqClass.setRawAPI(rawAPI);


        if(rawAPI.getInterfaceName().equals("stock_board_cons_ths")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("macro_usa_nahb_house_market_index")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("stock_zh_index_spot")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("bond_zh_cov_value_analysis")) {
            return  List.of();
        }

        if(rawAPI.getInterfaceName().equals("stock_zh_index_daily")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("stock_zh_index_daily_tx")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("option_cffex_zz1000_spot_sina")) {
            return  List.of();
        }
//        if(rawAPI.getInterfaceName().equals("option_cffex_zz1000_spot_sina")) {
//            return  List.of();
//        }

        return List.of(reqClass);
    }

    private List<AKShareAPIClass> generateAPIRespClassNoDuplicate(AKShareRawAPI rawAPI) {
        var packageName = "com.onectrm.akshare.api.generated." + rawAPI.getCategory();
        var reqClassName = rawAPI.getInterfaceName() + "Request";
        var respClassName = rawAPI.getInterfaceName() + "Response";

        var reqClass = generateAPIClass(packageName, reqClassName, rawAPI.getInput());
        var respClass = generateAPIClass(packageName, respClassName, rawAPI.getOutput());
        reqClass.setRawAPI(rawAPI);
        respClass.setRawAPI(rawAPI);
//        com.onectrm.akshare.api.generated.stock.stock_zh_index_spotRequest

        if(rawAPI.getInterfaceName().equals("stock_board_cons_ths")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("macro_usa_nahb_house_market_index")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("stock_zh_index_spot")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("option_cffex_zz1000_spot_sina")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("bond_zh_cov_value_analysis")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("stock_zh_index_daily")) {
            return  List.of();
        }
        if(rawAPI.getInterfaceName().equals("stock_zh_index_daily_tx")) {
            return  List.of();
        }
//        if(rawAPI.getInterfaceName().equals("stock_zh_index_spot")) {
//            return  List.of();
//        }
        return List.of(respClass);
    }

    private List<AKShareAPIClass> generateAPIRespClass(AKShareRawAPI rawAPI) {
        var packageName = "com.onectrm.akshare.api.generated." + rawAPI.getCategory();
        var reqClassName = rawAPI.getInterfaceName() + "Request";
        var respClassName = rawAPI.getInterfaceName() + "Response";

        var reqClass = generateAPIClass(packageName, reqClassName, rawAPI.getInput());
        var respClass = generateAPIClass(packageName, respClassName, rawAPI.getOutput());
        reqClass.setRawAPI(rawAPI);
        respClass.setRawAPI(rawAPI);
        return List.of(respClass);
    }

    private List<AKShareAPIClass> generateAPIClass(AKShareRawAPI rawAPI) {
        var packageName = "com.onectrm.akshare.api.generated." + rawAPI.getCategory();
        var reqClassName = rawAPI.getInterfaceName() + "Request";
        var respClassName = rawAPI.getInterfaceName() + "Response";

        var reqClass = generateAPIClass(packageName, reqClassName, rawAPI.getInput());
        reqClass.setRawAPI(rawAPI);
        return List.of(reqClass);
    }

    private String toFieldName(String str) {
        System.out.println("str _ before" + str);
        StringBuilder sb = new StringBuilder();

        for (var c : str.toCharArray()) {
            var py = PinyinHelper.toHanyuPinyinStringArray(c);

            if (py == null) {
                sb.append(c);
            } else {
                sb.append(py[0]);
            }
        }

        var d =  "p_" + sb.toString().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("str _ after" + d);
        return d;
    }

    private AKShareAPIClass generateAPIClass(String packageName, String className, List<AKShareRawAPIParameter> rawAPIParameters) {
        AKShareAPIClass cls = new AKShareAPIClass();

        HashMap<AKShareAPIProperty, Integer> count = new LinkedHashMap<>();

        if (rawAPIParameters != null) {
            int i = 0;
            for (var param : rawAPIParameters) {
                AKShareAPIProperty property = new AKShareAPIProperty();
                property.setRawAPIParameter(param);
                property.setType(inferType(param, className));

                var name = StringUtils.trimToNull(param.getName());
                if (StringUtils.isBlank(name)) {
                    name = StringUtils.trimToNull(param.getDescription());
                    if (StringUtils.isBlank(name)) {
                        name = "unknown_param_name_" + i++;
                    }
                }

                property.setName0(name);

                var a = toFieldName(name).replaceAll("p_", "");
                var b = a.equals("") ? "_d": a;

                property.setField(b);
                property.setName(toFieldName(name));

                if (count.containsKey(property)) {
                    count.put(property, count.get(property) + 1);
                } else {
                    count.put(property, 1);
                }

                cls.getImportedPackages().add(property.getType().getName());
            }
        }

        for (Map.Entry<AKShareAPIProperty, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                cls.getProperties().add(entry.getKey());
            }
        }

        cls.setClassName(className);
        cls.setPackageName(packageName);

        return cls;
    }

    private Class inferType(AKShareRawAPIParameter parameter,  String className) {
        System.out.println(className);
        Class cls = String.class;
        var type = StringUtils.trimToNull(parameter.getType());
        if (StringUtils.isBlank(type)) {
            return cls;
        }
//         && (className.startsWith("stock_yjbb_em")) || className.startsWith("stock_financial_analysis_indicator")
        if(isDateType(parameter)) {
            return cls;
        }
        if ("int64".equalsIgnoreCase(type) || "int".equalsIgnoreCase(type)) {
            cls = Integer.class;
        } else if ("float64".equalsIgnoreCase(type) || "float".equalsIgnoreCase(type)) {
            cls = Double.class;
        } else if ("int32".equalsIgnoreCase(type)) {
            cls = Long.class;
        } else if ("datetime64".equalsIgnoreCase(type) || "datetime".equalsIgnoreCase(type)) {
            return cls;
//            if (isDateTimeType(parameter)) {
//                cls = LocalDateTime.class;
//            } else {
//                cls = LocalDate.class;
//            }
        } else if(StringUtils.contains(parameter.getName(), "序号")) {
            cls = Long.class;
        } else {
            return cls;
//            if (isDateTimeType(parameter)) {
//                cls = LocalDateTime.class;
//            } else if (isDateType(parameter)) {
//                cls = LocalDate.class;
//            }
        }

        return cls;
    }

    boolean isDateType(AKShareRawAPIParameter parameter) {
        var name = StringUtils.toRootLowerCase(parameter.getName());
        var desc = StringUtils.toRootLowerCase(parameter.getDescription());

        return StringUtils.contains(name, "日期") ||
                StringUtils.contains(desc, "日期") ||
                StringUtils.contains(name, "date");
    }

    boolean isDateTimeType(AKShareRawAPIParameter parameter) {
        var name = StringUtils.toRootLowerCase(parameter.getName());
        var desc = StringUtils.toRootLowerCase(parameter.getDescription());

        return StringUtils.contains(name, "时间") ||
                StringUtils.contains(desc, "时间") ||
                StringUtils.contains(name, "time");
    }

    private List<AKShareRawAPI> parseAKShareRawAPI(Path filePath) throws IOException {
        var iterator = Files.lines(filePath).iterator();

        var category = StringUtils.removeEnd(filePath.getFileName().toString(), ".md");
        List<AKShareRawAPI> apis = new ArrayList<>();

        while (iterator.hasNext()) {
            var interfaceName = parse(iterator, "接口:");

            if (StringUtils.isBlank(interfaceName)) {
                break;
            }

            var source = parse(iterator, "目标地址:");
            var desc = parse(iterator, "描述:");
            var retDesc = parse(iterator, "限量:");

            var inputs = parseParameters(iterator, "输入参数");
            var output = parseParameters(iterator, "输出参数");

            AKShareRawAPI api = new AKShareRawAPI();
            api.setCategory(category);
            api.setInterfaceName(interfaceName);
            api.setSource(source);
            api.setDescription(desc);
            api.setReturnDescription(retDesc);

            api.setInput(inputs);
            api.setOutput(output);
            apis.add(api);
        }

        return apis;

    }

    private String parse(Iterator<String> iterator, String token) {
        String val = null;
        while (iterator.hasNext()) {
            var str = iterator.next();
            if (StringUtils.startsWith(str, token)) {
                var strs = StringUtils.split(str, ":", 2);
                if (strs.length == 2) {
                    val = StringUtils.trimToNull(strs[1]);
                }

                break;
            }
        }

        return val;
    }

    private List<AKShareRawAPIParameter> parseParameters(Iterator<String> iterator, String token) {
        List<AKShareRawAPIParameter> parameters = null;
        while (iterator.hasNext()) {
            var str = iterator.next();
            if (StringUtils.startsWith(str, token)) {
                parameters = parseParameterTable(iterator);
                break;
            }
        }

        return parameters;
    }

    private List<AKShareRawAPIParameter> parseParameterTable(Iterator<String> iterator) {
        List<AKShareRawAPIParameter> parameters = new ArrayList<>();

        boolean flag = true;
        AKShareRawAPIParameter delate = null;

        while (flag && iterator.hasNext()) {
            var line = iterator.next();
            line = StringUtils.replace(line, " ", "");

            if (StringUtils.startsWith(line, "|--")) {
                while (iterator.hasNext()) {
                    var tableLine = iterator.next();
                    var parameter = parseParameterTableRow(tableLine);
                    if (parameter == null) {
                        flag = false;
                        break;
                    }
//                    if (parameter == null) {
//                        break;
//                    }
//                    var a = parameter.getName();
//                    var b = "所处行业";
//                    if(a!=null && a.equals(b)) {
//                        break;
//                    }
                    if(StringUtils.contains(parameter.getName(), "所处行业")){
                        delate=parameter;
                    }

                    parameters.add(parameter);
                }
            }
        }

        if(delate!=null) {
            parameters.remove(delate);
        }
        return parameters.size() == 0 ? null : parameters;
    }

    private AKShareRawAPIParameter parseParameterTableRow(String str) {

        if (StringUtils.isBlank(str)) {
            return null;
        }

        var strs = StringUtils.split(str, "|");

        if (Arrays.stream(strs).allMatch(s -> StringUtils.isBlank(s))) {
            return null;
        }

        Function<String, String> extract = (val) -> {
            var s = StringUtils.trim(val);
            if (StringUtils.isBlank(s) || s.equalsIgnoreCase("-")) {
                s = null;
            }

            return s;
        };

        AKShareRawAPIParameter parameter = null;

        if (strs.length >= 3) {
            var name = extract.apply(strs[0]);
            var type = extract.apply(strs[1]);
            var desc = strs.length == 3 ? extract.apply(strs[2]) : extract.apply(strs[3]);
            var required = strs.length == 3 ? null : extract.apply(strs[2]);

            if (name != null || type != null || desc != null || required != null) {
                parameter = new AKShareRawAPIParameter();
                parameter.setName(name);
                parameter.setType(type);
                parameter.setRequired(required);
                parameter.setDescription(desc);
            }
        }

        return parameter;
    }


}
