/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals.Entities;

/**
 *
 * @author Kiddo
 */
public class Address {
    private String country;
    private String city; 
    private String street;
    private Integer number;
    private String otherDetails;
    
    public Address(String country, String city, String street, Integer number,
                   String otherDetails) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
        this.otherDetails = otherDetails;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public Integer getNumber() {
        return number;
    }
    
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    
    public String getOtherDetails() {
        return otherDetails;
    }
    
    public String GetFullAddress() {
        StringBuilder str = new StringBuilder();
        str.append(" Country: ").append(this.country).append(";");
        str.append(" City: ").append(this.city).append(";");
        str.append(" Street: ").append(this.street).append(";");
        str.append(" Number: ").append(this.number.toString()).append(";");
        str.append(" Other details: ").append(this.otherDetails);
        return str.toString();
    }
}
