package spring02;

/**
 * 人
 */
public abstract class Person {
    /**姓名*/
    public String name;
    /**地址*/
    public Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
