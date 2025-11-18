package javaStreamsExtended;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaBasicFunctionalInterfaces {
    public static void main(String[] args) {
        // Supplier
        System.out.println("=-=-=-=-=-=-=-=-=-=-Supplier=-=-=-=-=-=-=-=-=-=-");
        Supplier<String> supplier = new SupplierImpl();
        System.out.println(supplier.get());

        // Supplier using lambda
        Supplier<String> supplierLambda = () -> "String bhej di gayi hai";
        System.out.println(supplierLambda.get());

        // Employee using supplier
        Supplier<Employee> employeeSupplier = () -> new Employee(2, "Shreya");
        System.out.println(employeeSupplier.get().getName());

        // Consumer
        System.out.println("=-=-=-=-=-=-=-=-=-=-Consumer=-=-=-=-=-=-=-=-=-=-");
        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("shreyaaaa");

        // Consumer using lambda and method reference
        Consumer<String> consumerLambda = s -> System.out.println("String mil gayi hai: " + s);
        Consumer<String> consumerMethodReference = System.out::println;
        consumerLambda.accept("shreyaaa");
        consumerMethodReference.accept("shreyaaa method reference");

        // Employee consumer
        Consumer<Employee> employeeConsumer = emp -> System.out.println(emp);
        Consumer<Employee> employeeConsumer1 = System.out::println;
        employeeConsumer.accept(new Employee(2, "Shreya"));
        employeeConsumer1.accept(new Employee(1, "Prateek"));

        // TODO: Implement predicate using "implements" keyword, lambda and method reference.

        // Predicate
        System.out.println("=-=-=-=-=-=-=-=-=-=-Predicate=-=-=-=-=-=-=-=-=-=-");
        Predicate<String> predicate = new PredicateImpl();
        predicate.test("orange");

        //Predicate using lambda
        Predicate<String> predicateLamda1 = s -> {
            if (s.equals("blue")) {
                return true;
            } else {
                return false;
            }
        };
        Predicate<String> predicateLamda2 = s -> {
            if (s.equals("blue")) return true;
            else return false;
        };
        Predicate<String> predicateLamda3 = s -> (s.equals("blue")) ? true : false;
        System.out.println("Predicate result: " + predicateLamda3.test("orange"));

        Predicate<Employee> predicateEmployee = s -> (s.getName().equals("shreya")) ? true : false;
        System.out.println("Predicate employee result: " + predicateEmployee.test(new Employee(2,"shreya")));

    }
}

        /**
         * Supplier: job is to supply some data.
         */
        class SupplierImpl implements Supplier<String> {
            @Override
            public String get() {
                return "String bhej di gai hai";
            }
        }


        /**
         * Consumer: consume some data.
         */
        class ConsumerImpl implements Consumer<String> {
            @Override
            public void accept(String s) {
                System.out.println("String mil gayi hai: " + s);
            }
        }


        /**
         * Predicate: To test a condition.
         */
        class PredicateImpl implements Predicate<String> {
            @Override
            public boolean test(String color) {
                if (color.equals("blue"))
                    return true;
                return false;
            }
        }


/**
 * Function: to transform the data.
 */