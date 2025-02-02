package com.example.RestAPIJavaBootCamp.model;

public class Student {
  private int rollNumber;
  private String name;
  private String city;

  public Student(int rollNumber, String name, String city) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.city = city;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

}
