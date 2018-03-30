package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> collection3=new HashMap<>();
        for(String key:collectionA) {
            if(collection3.containsKey(key))
                collection3.put(key,collection3.get(key).intValue()+1);
            else
                collection3.put(key,1);
        }
        PracticeB practiceB=new PracticeB();
        collection3=practiceB.createUpdatedCollection(collection3,object);
        return collection3;
    }
}
