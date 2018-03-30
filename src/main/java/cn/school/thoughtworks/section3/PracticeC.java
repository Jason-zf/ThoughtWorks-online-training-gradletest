package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        PracticeA practiceA=new PracticeA();
        Map<String,Integer> collection3=practiceA.countSameElements(collectionA);
        PracticeB practiceB=new PracticeB();
        return practiceB.createUpdatedCollection(collection3,object);
    }
}
