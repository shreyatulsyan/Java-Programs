package javaStreamsExtended;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class JavaStreams {
    public static void main(String[] args) {
        var stringList = List.of("ABC", "QA", "SDFG", "as", "ertt", "AA", "zx");

        // classic java for each loop
//        var finalList = new ArrayList<String>();
        System.out.println("purana java");
        for (var str: stringList) {
            if (str.toLowerCase().startsWith("a")) {
                System.out.println(str);
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // streams
        System.out.println("naya streams");
        Predicate<String> strPred = new StringPredicate();
        stringList.stream()
                // whole implementation with dirty logic
//                .filter(str -> {
//                    if (str.toLowerCase().startsWith("a")) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                })

                // using implemented predicate
//                .filter(new StringPredicate())

                // using object of implemented predicate
//                .filter(strPred)

                // using anonymous implementation of predicate
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String str) {
//                        return str.toLowerCase().startsWith("a");
//                    }
//                })

                // using simple lambda
//                .filter(str -> str.toLowerCase().startsWith("a"))

                // lambda calling some method (which could be replaced with method reference (::))
//                .filter(str -> JavaStreams.check(str))

                // method reference
                .filter(JavaStreams::check)
                .forEach(System.out::println);
    }

    public static boolean check(String str) {
        return str.toLowerCase().startsWith("a");
    }

//    public static void filter() {
//        var stringList = List.of("ABC", "QA", "SDFG", "as", "ertt", "AA", "zx");
//        for (var str: stringList) {
//            if (str.toLowerCase().startsWith("a")) {
//                System.out.println(str);
//            }
//        }
//    }
}

class StringPredicate implements Predicate<String> {

    @Override
    public boolean test(String str) {
        return str.toLowerCase().startsWith("a");
    }
}