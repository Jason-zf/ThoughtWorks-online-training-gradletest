package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        PracticeB practiceB = new PracticeB();
        Map<String, Integer> collection3 = practiceB.countSameElements(collectionA);
        cn.school.thoughtworks.section3.PracticeB practiceB1 = new cn.school.thoughtworks.section3.PracticeB();
        return practiceB1.createUpdatedCollection(collection3,object);
    }
}
