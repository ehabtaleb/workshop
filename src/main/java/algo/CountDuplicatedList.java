package algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class CountDuplicatedList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("a");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String string : list) {
            Integer count = map.get(string);
            if (count == null)
                count = Integer.valueOf(1);
            map.put(string, (count + 1));
        }

        print(map);

        SortedMap<String, Integer> sorted = new TreeMap<String, Integer>(map);
        System.out.println("================================================");
        print(sorted);
    }

    private static void print(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + "-" + map.get(key));

        }

    }

}
