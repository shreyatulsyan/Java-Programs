package javaStreamsExtended;

import java.util.function.Consumer;
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


/**
 * Function: to transform the data.
 */