package com.stackroute.pe5;

import java.util.Map;

public class ElementSwap {
    public String swapValue(Map<String,String> map) {
        if (map == null) {
            return "should not be null";
        }
        String string = map.get("input1");
        map.replace("input2",string);
        map.replace("input1", " ");
        return map.toString();
    }
}
