package com.mpsc.base.context.util;

import java.util.HashMap;
import java.util.Map;

public class MapToHashMap {

    public static HashMap<String, String> mapToHashMap(Map<String, String> data) {
        return new HashMap<>(data);
    }


}
