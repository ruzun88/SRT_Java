package kor.ruzun88.java.srt.constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PASSENGER_TYPE {
    public static final Map<String, String> PASSENGER_TYPE = createPassengerTypeMap();

    public static String getName(String code){
        return PASSENGER_TYPE.getOrDefault(code, null);
    }

    private static Map<String, String> createPassengerTypeMap() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("1", "어른/청소년");
        result.put("2", "장애 1~3급");
        result.put("3", "장애 4~6급");
        result.put("4", "경로");
        result.put("5", "어린이");
        return Collections.unmodifiableMap(result);
    }
}
