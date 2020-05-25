package spring02;

/**
 * 地址
 */
public class Address {
    /**国家*/
    private String country;
    /**城市*/
    private String city;

    public String getCountry() {
        return country;
    }
    public Address(){

    }
    public Address(String country,String city){
        this.country = country;
        this.city = city;

    }
    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
