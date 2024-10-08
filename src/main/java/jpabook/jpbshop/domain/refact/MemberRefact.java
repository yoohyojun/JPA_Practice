package jpabook.jpbshop.domain.refact;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MemberRefact {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) // 생략 시 오토임
    @Column(name = "MEMBER_ID")
    private Long id;
    @OneToMany(mappedBy = "memberRefact")
    private List<OrderRefact> orders = new ArrayList<>();
    // 관계상 new ArrayList (JPA, 하이버네이트)

    private String name;
    private String city;
    private String street;
    private String zipCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
