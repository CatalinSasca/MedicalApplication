/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kiddo
 */
public class Hospital {
    private String name;
    private Address addressHospital;
    private Phone phoneHospital;
    
    public Hospital(Integer orderNumber) {
        this.name = hospitalNames.get(orderNumber);
        this.addressHospital = hospitalAddresses.get(orderNumber);
        this.phoneHospital = hospitalPhones.get(orderNumber);
    }
    
    public static final List<Hospital> patientsHospitals = new ArrayList<Hospital>() {{
        add(new Hospital(0)); //first hospital
        add(new Hospital(1)); //second hospital
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
    }};
    
    private final List<String> hospitalNames = new ArrayList<String>() {{
        add("Alameda Hospital");
        add("Highland Hospital");
    }};
    
    private final List<Address> hospitalAddresses = new ArrayList<Address>() {{
        add(new Address("country7", "city7", "street7", 7, "details7"));
        add(new Address("country8", "city8", "street8", 8, "details8"));
    }};
    
    private final List<Phone> hospitalPhones = new ArrayList<Phone>() {{
        add(new Phone("0741123460"));
        add(new Phone("0741123461"));
    }};
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAddress(Address addressHospital) {
        this.addressHospital = addressHospital;
    }
    
    public Address getAddress() {
        return addressHospital;
    }
    
    public void setPhone(Phone phoneHospital) {
        this.phoneHospital = phoneHospital;
    }
    
    public Phone getPhone() {
        return phoneHospital;
    }
}
