import java.util.*;

public class Home {

    public static void main(String args[]){
//        VegeList: Onion, carrot, beans, Flower, Cabbage
//        Price: 20, 50, 60, 30, 25
        ArrayList<String> vegList = new ArrayList<>();
        ArrayList<Integer> priceList = new ArrayList<>();
        vegList.add("Onion");
        vegList.add("carrot");
        vegList.add("beans");
        vegList.add("Flower");
        vegList.add("Cabbage");

        priceList.add(20);
        priceList.add(50);
        priceList.add(60);
        priceList.add(30);
        priceList.add(25);

        Map<String, Integer> vegPriceMap = new HashMap<>();
        for(int i=0;i<vegList.size();i++){
            vegPriceMap.put(vegList.get(i),priceList.get(i));
        }

        System.out.println(vegPriceMap);




    }




//    public static void main(String args[]){
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        arr.add(10);
//        arr.add(20);
//        arr.add(1);
//        arr.add(4);
//        arr.add(9);
//        arr.add(23);
//        arr.add(17);
//        arr.add(0);
//        arr.add(3);
//
////        Collections.sort(arr, Collections.reverseOrder());
////
////        System.out.println(arr.get(1));
//
//        int firstMax=Integer.MIN_VALUE;
//        int secondMax=Integer.MIN_VALUE;
//        for(int each : arr){
//            if(each>firstMax){
//                secondMax=firstMax;
//                firstMax=each;
//            }
//        }
//        System.out.println(secondMax);
//
//    }
//    public static void main(String args[]){
//        String given = "HoMePaGe";
//
//        String result="";
//        char[] arr = given.toCharArray();
//
//
//        for(int i=1;i<arr.length;){
//            result= result+ Character.toUpperCase(arr[i]);
//            i=i+2;
//        }
//
//        System.out.println(result);
//    }
}
