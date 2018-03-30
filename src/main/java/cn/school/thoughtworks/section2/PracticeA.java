package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        for (String key : collection1) {
            if (result.containsKey(key))
                result.put(key, result.get(key).intValue() + 1);
            else
                result.put(key, 1);
        }
        return result;
    }
}
