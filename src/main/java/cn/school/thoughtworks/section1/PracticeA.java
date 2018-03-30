package cn.school.thoughtworks.section1;

import javax.print.DocFlavor;
import java.util.*;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<>(collection1);
        result.retainAll(collection2);
        Set<String> set=new HashSet<>();
        List<String> finalRes=new ArrayList<>();
        for(int i=0;i<result.size();++i) {
            if (set.add(result.get(i)))
                finalRes.add(result.get(i));
        }
        if (finalRes.size() > 0)
            return finalRes;
        else
            return null;
    }
}
