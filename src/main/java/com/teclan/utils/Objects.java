package com.teclan.utils;

import java.math.BigDecimal;
import java.util.Map;

public class Objects {

    public static String getOrDefault(Map<String, Object> map, String key, String def) {
        if (map == null || !map.containsKey(key) || map.get(key) == null||"".equals(map.get(key))) {
            return def;
        }
        String value = map.get(key).toString();
        return value;
    }

    public static String getOrDefault(Map map, String key) {
        return getOrDefault(map, key, "");
    }

    public static BigDecimal getBigDecimal(Map<String,Object> map, String key){
        return getBigDecimal(map,key,"0");
    }
    public static BigDecimal getBigDecimal(Map<String,Object> map, String key,String def) {
        String v = getOrDefault(map,key,def);
        return new BigDecimal(v);
    }
}
