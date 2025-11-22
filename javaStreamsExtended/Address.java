package javaStreamsExtended;

public class Address {
    private String add;
    private String zip;

    public Address(String add, String zip) {
        this.add = add;
        this.zip = zip;
    }

    public String getAdd() {
        return add;
    }

    public String getZip() {
        return this.zip;
    }
}
