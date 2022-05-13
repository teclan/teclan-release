package com.teclan.utils;

import java.util.Map;

public class MapUtils {

    public static String getString(Map map, Object key) {
        if (map != null) {
            Object answer = map.get(key);
            if (answer != null) {
                return answer.toString();
            }
        }

        return null;
    }
}
