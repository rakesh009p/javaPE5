package com.stackroute.pe5;

import java.util.Map;
import java.util.HashMap;

public class ArayCounter {
    public Map<String, Boolean> keyCountChecker(String[] inputString) {

        Map<String, Boolean> resultMap = new HashMap<String, Boolean>();

        if (inputString == null) {
            return null;
        }

        else {
            for (int i = 0; i < inputString.length; i++) {
                String word = inputString[i];
                if (resultMap.containsKey(word))
                    resultMap.put(word, true);
                else
                    resultMap.put(word, false);
            }
            return resultMap;
        }
    }

}
