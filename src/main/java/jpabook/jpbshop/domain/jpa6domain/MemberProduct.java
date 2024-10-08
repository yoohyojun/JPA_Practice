package jpabook.jpbshop.domain.jpa6domain;


import javax.persistence.*;

@Entity
public class MemberProduct {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="MEMBER_ID")
    private Member6Domain member;

    @ManyToOne
    @JoinColumn(name="PRODUCT_ID")
    private Product product;

}
