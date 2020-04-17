package io.ace.springframework.core.spel.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Inventor {

    private String name;
    private String nationality;
    private String[] inventions;
    private Date birthDate;
    private PlaceOfBirth placeOfBirth;

    public Inventor() {
    }

    public Inventor(String name, String nationality) {
        Calendar calendar = new GregorianCalendar();
        this.name = name;
        this.nationality = nationality;
        this.birthDate = calendar.getTime();
    }

    public Inventor(String name, String nationality, Date birthDate) {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String[] getInventions() {
        return inventions;
    }

    public void setInventions(String[] inventions) {
        this.inventions = inventions;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public PlaceOfBirth getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(PlaceOfBirth placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
