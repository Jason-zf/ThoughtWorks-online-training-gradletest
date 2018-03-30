package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> value = object.get("value");
        Set<String> keys=collectionA.keySet();
        for (String key : keys) {
            if(value.contains(key))
                collectionA.put(key,collectionA.get(key)-collectionA.get(key)/3);
        }
        return collectionA;
    }
}
