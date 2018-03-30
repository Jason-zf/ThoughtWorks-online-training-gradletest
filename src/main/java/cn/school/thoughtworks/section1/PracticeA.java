package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result=new ArrayList();
        for (int i = 0; i < collection1.size(); ++i) {
            String elementA = collection1.get(i);
            if (collection2.indexOf(elementA) != -1&&result.indexOf(elementA)==-1) {
                result.add(elementA);
            }
        }
        return result;
    }
}
