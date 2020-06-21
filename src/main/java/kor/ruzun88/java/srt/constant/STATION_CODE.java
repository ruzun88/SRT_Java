package kor.ruzun88.java.srt.constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class STATION_CODE {
    public static final Map<String, String> STATION_CODE = createStationMap();

    public static String getCode(String krName){
        return STATION_CODE.getOrDefault(krName, null);
    }
    public static String getName(String code){
        for (Map.Entry<String, String> entry : STATION_CODE.entrySet()) {
            if (entry.getValue().equals(code)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static Map<String, String> createStationMap() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("수서", "0551");
        result.put("동탄", "0552");
        result.put("지제", "0553");
        result.put("천안아산", "0502");
        result.put("오송", "0297");
        result.put("대전", "0010");
        result.put("공주", "0514");
        result.put("익산", "0030");
        result.put("정읍", "0033");
        result.put("광주송정", "0036");
        result.put("나주", "0037");
        result.put("목포", "0041");
        result.put("김천구미", "0507");
        result.put("동대구", "0015");
        result.put("신경주", "0508");
        result.put("울산(통도사)", "0509");
        result.put("울산", "0509");
        result.put("통도사", "0509");
        result.put("부산", "0020");
        return Collections.unmodifiableMap(result);
    }
}
