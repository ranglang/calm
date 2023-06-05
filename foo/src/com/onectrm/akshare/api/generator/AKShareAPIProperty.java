package com.onectrm.akshare.api.generator;

public class AKShareAPIProperty {
    private Class type;
    private String name;

    private String name0;
    private String field;
    private AKShareRawAPIParameter rawAPIParameter;

    private String typeAlias;

    public Class getType() {
        return type;
    }

    public String getTypeAlias() {
        String a = typeAlias;
        if(a.equals("String")) {
            return  a;
        }else if(a.equals("Long")) {
            return a;
        }
       else if(a.equals("Integer")) {
        return "Int";
        }else if(a.equals("Double")) {
            return "DoubleOrNull";
        }
        return "String";
    }

    public void setType(Class type) {
        this.type = type;
        this.typeAlias=type.getSimpleName();
    }

    public void setField(String type) {
        this.field = type;
    }

    public void setName0(String type) {
        this.name0 = type;
    }

    public String getName0() {
        return name0;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }


    public void setName(String name) {
        this.name = name;
    }

    public AKShareRawAPIParameter getRawAPIParameter() {
        return rawAPIParameter;
    }

    public void setRawAPIParameter(AKShareRawAPIParameter rawAPIParameter) {
        this.rawAPIParameter = rawAPIParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AKShareAPIProperty property = (AKShareAPIProperty) o;

        return name.equals(property.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
