package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList<String>();
        PracticeA praticeA = new PracticeA();
        for (int i = 0; i < collection2.size(); ++i) {
            List<String> elementB = collection2.get(i);
            List<String> subResult = praticeA.collectSameElements(collection1, elementB);
            List<String> sameElements = praticeA.collectSameElements(result, subResult);
            if (sameElements.isEmpty() == false)
                result.removeAll(sameElements);
            result.addAll(subResult);
        }
        return result;
    }
}
