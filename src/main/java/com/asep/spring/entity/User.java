package com.asep.spring.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@SuppressWarnings("serial")
@Document(collection = "user")
public class User extends BaseEntity {

    private String country;
    private String city;
    private List<Location> locations;
    private String name;
    private Device device;

    public User() {

    }

    public User(String country, String city, List<Location> locations, String name, Device device) {
        this.country = country;
        this.city = city;
        this.locations = locations;
        this.name = name;
        this.device = device;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}