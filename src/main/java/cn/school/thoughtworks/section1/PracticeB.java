package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        PracticeA praticeA = new PracticeA();
        List<String> elementsB=new ArrayList<>();
        for (int i = 0; i < collection2.size(); ++i) {
            elementsB.addAll(collection2.get(i));
        }
        return praticeA.collectSameElements(collection1,elementsB);
    }
}
