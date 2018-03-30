package cn.school.thoughtworks.section1;

import jdk.nashorn.internal.runtime.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        List<String> result = new ArrayList<>();
        PracticeA practiceA = new PracticeA();
        List<String> elementsB = collection2.get("value");
//        for (List<String> value : collection2.values()) {
//            elementsB.addAll(value);
//        }
        return practiceA.collectSameElements(collection1, elementsB);

    }

}
