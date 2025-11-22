package javaStreamsExtended;

import java.util.Optional;

public class WhatIsOptional {
    public static void main(String[] args) {
        // not null element
        var nonNull = new Fruits("Apple");
        System.out.println(nonNull.getFruit().toUpperCase());

        // null
        var nullFruit = new Fruits(null);
//        System.out.println(nullFruit.getFruit().toUpperCase());

        // handling null
        if (nullFruit.getFruit() != null) {
            System.out.println(nonNull.getFruit().toUpperCase());
        } else {
            System.out.println("Fruit is null");
        }

        // Using optional
        System.out.println("=-=-=-=-=-=-=-=-=-=-Optional Demo below-=-=-=-=-=-=-=-=-=-=-=\n");
        var optionalFruit = new OptionalFruits("Apple");
        var fruit = optionalFruit.getFruit();
        if (fruit.isPresent()) {
            System.out.println(fruit.get().toUpperCase());
        } else  {
            System.out.println("Fruit is null in optional");
        }

        var optionalFruit2 = new OptionalFruits(null);
        var fruit2 = optionalFruit2.getFruit();
        if (fruit2.isPresent()) {
            System.out.println(fruit2.get().toUpperCase());
        } else  {
            System.out.println("Fruit is null in optional");
        }

        // using optional in functional way
        System.out.println("=-=-=-=-=-=-=-=-=-=-Optional Demo below using functional-=-=-=-=-=-=-=-=-=-=-=\n");
        var optionalFruitFunctional = new OptionalFruits("Apple");
        var fruitFunctional = optionalFruitFunctional.getFruit();

        // if present
        fruitFunctional.ifPresent(s -> System.out.println(s.toUpperCase()));

        // if present or else
        fruitFunctional.ifPresentOrElse(s -> System.out.println(s.toUpperCase()), () -> System.out.println("Fruit is null in optional"));

        // get, orElse and orElseGet
        var bananaFruit = new OptionalFruits("Banana");
        var bananaOpt = bananaFruit.getFruit();

        // orElse
        var banana = bananaOpt.orElse("Default Fruit");
        System.out.println(banana);

        // orElseGet
        var guavaFruit = new OptionalFruits("Guava");
        var guavaOpt = guavaFruit.getFruit();
        var guava = guavaOpt.orElseGet(() -> "Default Fruit");
        System.out.println(guava);

        // why orElseGet over orElse
        var grapeFruit = new OptionalFruits("Grape");
        var grapeOpt = grapeFruit.getFruit();
        // var grape = grapeOpt.orElse(toUpperCase(null)); --> throws exception
        var grape = grapeOpt.orElseGet(() -> toUpperCase(null));
        System.out.println(grape);

        // convert banana to banana shake
        var bananaShakeFruit = new OptionalFruits("Banana");
        Optional<String> bananaShakeOpt = bananaShakeFruit.getFruit();
        var shake = bananaShakeOpt.map(b -> "riped banana")
                .map(rb -> "banana shake")
                .orElse("no shake for you");
        System.out.println(shake);

        // Optional.of() kyu hi chahie?
        var employee1 = new Employee(75489451, "Ron");
        var employee2 = new Employee(75489452, "Harry", new Address("hogwarts", "208011"));
        System.out.println(getAddressFromEmployee(employee1));
        System.out.println(getAddressFromEmployee(employee2));

    }

    static String getAddressFromEmployee(Employee employee) {
        return Optional.of(employee)
            .map(Employee::getAddress)
            .map(Address::getZip)
            .orElse("No address found");
    }

    static String toUpperCase(String s) {
        return s.toUpperCase();
    }
}

class Fruits {
    private final String fruit;

    public Fruits(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void map() {}
}

class OptionalFruits {
    private final String fruit;

    public OptionalFruits(String fruit) {
        this.fruit = fruit;
    }

    public Optional<String> getFruit() {
        return Optional.ofNullable(fruit);
    }
}