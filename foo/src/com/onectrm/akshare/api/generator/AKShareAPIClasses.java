package com.onectrm.akshare.api.generator;

import java.util.ArrayList;
import java.util.List;

public class AKShareAPIClasses {
    List<AKShareAPIClass> classes = new ArrayList<>();

    public List<AKShareAPIClass>  getClasses() {
        return classes;
    }

    List<AKShareAPIClass> outputs = new ArrayList<>();

    public List<AKShareAPIClass>  getOutputs() {
        return outputs;
    }


    public void setClasses(List<AKShareAPIClass> classes) {
        this.classes = classes;
    }

    public void setOutputs(List<AKShareAPIClass> classes) {
        this.outputs = classes;
    }
}
