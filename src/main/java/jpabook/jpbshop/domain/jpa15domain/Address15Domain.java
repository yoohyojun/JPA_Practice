package jpabook.jpbshop.domain.jpa15domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address15Domain {

    private String city;
    private String street;
    private String zipCode;

    public Address15Domain(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address15Domain() {
    }
}
