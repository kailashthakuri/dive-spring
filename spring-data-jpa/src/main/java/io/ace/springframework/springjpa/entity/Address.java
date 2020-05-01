package io.ace.springframework.springjpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_address")
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String country, district, city;

    public Address() {
    }

    public Address(String country, String district, String city) {
        this.country = country;
        this.district = district;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
