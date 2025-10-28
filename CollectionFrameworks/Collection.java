package CollectionFrameworks;

import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Collection {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(0);
        arr.add(9);

        //Collections.sort(arr);
        System.out.println(arr.get(2));
        arr.add(98);

        Iterator i = arr.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }



    }
}
