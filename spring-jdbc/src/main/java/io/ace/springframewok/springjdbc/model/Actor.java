package io.ace.springframewok.springjdbc.model;

import java.util.Date;

public class Actor {
    private int id;
    private String name;
    private int age, moviePlayed;
    private double payPerMovie;
    private Date dob;

    public Actor() {
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Actor(String name, int age, int moviePlayed) {
        this.name = name;
        this.age = age;
        this.moviePlayed = moviePlayed;
    }

    public Actor(String name, int age, int moviePlayed, double amountPerMovie) {
        this.name = name;
        this.age = age;
        this.moviePlayed = moviePlayed;
        this.payPerMovie = amountPerMovie;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoviePlayed() {
        return moviePlayed;
    }

    public void setMoviePlayed(int moviePlayed) {
        this.moviePlayed = moviePlayed;
    }

    public double getPayPerMovie() {
        return payPerMovie;
    }

    public void setPayPerMovie(double payPerMovie) {
        this.payPerMovie = payPerMovie;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", moviePlayed=" + moviePlayed +
                ", payPerMovie=" + payPerMovie +
                ", dob=" + dob +
                '}';
    }
}
