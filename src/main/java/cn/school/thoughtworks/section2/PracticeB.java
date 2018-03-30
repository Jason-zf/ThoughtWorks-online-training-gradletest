package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        int num = 1;
        for (String key : collection1) {
            if (key.contains("-")) {
                num = Integer.valueOf(key.split("-")[1]);
                key = key.split("-")[0];

            }
            if (result.containsKey(key))
                result.put(key, result.get(key).intValue() + 1);
            else
                result.put(key, num);
        }
        return result;
    }
}
