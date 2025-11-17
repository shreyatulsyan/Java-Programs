package generics;

@FunctionalInterface
public interface TriFunction<A, B, C, D> {
    D chalo(A a, B b, C c);
}

class TriTest implements TriFunction<String, Integer, Float, Fees> {
    @Override
    public Fees chalo(String name, Integer months, Float totalFees) {
        return new Fees(name, months, totalFees);
    }
}

class Main {
    public static void main(String[] args) {
        // basic purana java
        var chaloTest = new TriTest();
        var fees = chaloTest.chalo("shreya", 12, 2500.50f);
        fees.displayData();

        // lambda implementation
        TriFunction<String, Integer, Float, Fees> feesLambda = (a, b, c) -> new Fees(a, b, c);
        var prateekFees = feesLambda.chalo("prateek", 5, 1400.64f);
        prateekFees.displayData();

        // Method reference
        TriFunction<String, Integer, Float, Fees> feesMethodReference = Fees::new;
        var miniFees = feesMethodReference.chalo("mini", 24, 5001.00f);
        miniFees.displayData();
    }
}


class Fees {
    private final String name;

    private final int months;

    private final float totalFees;

    public Fees(String name, int months, float totalFees) {
        this.name = name;
        this.months = months;
        this.totalFees = totalFees;
    }

    public String getName() {
        return name;
    }

    public int getMonths() {
        return months;
    }

    public float getTotalFees() {
        return totalFees;
    }

    public void displayData() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fees{" +
                "name='" + name + '\'' +
                ", months=" + months +
                ", totalFees=" + totalFees +
                '}';
    }
}