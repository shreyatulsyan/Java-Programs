package mapPrograms;

import java.util.*;

public class SortMap {

    public static void main(String args[]){
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 65000);
        map.put("HP", 20000);
        map.put("Dell", 32000);
        map.put("Asus", 21478);
        map.put("Samsung", 36546);
        map.put("Lenovo", 19990);

//        for(Map.Entry<String, Integer> m : map.entrySet()){
//            System.out.println(m.getKey());
//            System.out.println(m.getValue());
//        }

        List<Map.Entry<String, Integer>> li = new LinkedList<>(map.entrySet());

        Collections.sort(li, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o1.getValue()-o2.getValue();
            }
        });

        Map<String, Integer> mapp = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> e: li){
            mapp.put(e.getKey(),e.getValue());
        }
        for(Map.Entry<String, Integer> m : mapp.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }
}
