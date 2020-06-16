package kor.ruzun88.java.srt.constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TRAIN_NAME {
    public static final Map<String, String> TRAIN_NAME = createTrainNameMap();

    public static String getTrainName(String krName){
        return TRAIN_NAME.getOrDefault(krName, null);
    }

    private static Map<String, String> createTrainNameMap() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("00", "KTX");
        result.put("02", "무궁화");
        result.put("03", "통근열차");
        result.put("04", "누리로");
        result.put("05", "전체");
        result.put("07", "KTX-산천");
        result.put("08", "ITX-새마을");
        result.put("09", "ITX-청춘");
        result.put("17", "SRT");
        return Collections.unmodifiableMap(result);
    }
}
