package com.example.Education_proj.domain;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Car {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;
  private String brand, model, color, registerNumber;
  private int year, price;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "owner")
  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
  private Owner owner;

  public Car() {

}

//Getter and setter
  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }
  
/*  @ManyToMany(mappedBy = "cars") 
  private Set<Trip> Trips; 

public Set<Trip> getTrips() {
	return Trips;
}

public void setTrips(Set<Trip> trips) {
	Trips = trips;
}*/
public Car(String brand, String model, String color, String registerNumber, int year, int price,Owner owner) {
	super();
	this.brand = brand;
	this.model = model;
	this.color = color;
	this.registerNumber = registerNumber;
	this.year = year;
	this.price = price;
	this.owner = owner;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getRegisterNumber() {
	return registerNumber;
}
public void setRegisterNumber(String registerNumber) {
	this.registerNumber = registerNumber;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
  
}
