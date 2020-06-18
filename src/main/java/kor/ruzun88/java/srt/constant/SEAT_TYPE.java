package kor.ruzun88.java.srt.constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SEAT_TYPE {
    public static final Map<String, String> SEAT_TYPE = createSeatTypeMap();

    public static String getName(String code){
        return SEAT_TYPE.getOrDefault(code, null);
    }

    private static Map<String, String> createSeatTypeMap() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("1", "일반실");
        result.put("2", "특실");
        return Collections.unmodifiableMap(result);
    }
}
