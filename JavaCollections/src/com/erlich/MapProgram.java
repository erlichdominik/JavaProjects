package com.erlich;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-orientated language");
        languages.put("python", "an interpreted, object-orientated language");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
