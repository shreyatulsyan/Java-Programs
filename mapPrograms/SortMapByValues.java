package mapPrograms;

import java.util.*;

public class SortMapByValues {

    public static void main(String args[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 65000);
        map.put("HP", 20000);
        map.put("Dell", 32000);
        map.put("Asus", 21478);
        map.put("Samsung", 36546);
        map.put("Lenovo", 19990);
        System.out.println("Before sorting: ");
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() +"\t"+entry.getValue());
        }
        System.out.println("\n");
        sortByValue(map);
    }
    public static void sortByValue(Map<String, Integer> m){

        List<Map.Entry<String, Integer>> li = new LinkedList<Map.Entry<String, Integer>>(m.entrySet());

        Collections.sort(li, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String,Integer> e : li){
            sortedMap.put(e.getKey(),e.getValue());
        }

        //Print Sorted Map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet())
        {
            System.out.println(entry.getKey() +"\t"+entry.getValue());
        }
        System.out.println("\n");
    }

}
