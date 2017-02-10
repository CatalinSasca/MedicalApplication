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
public class OperationsStaff {
    private Integer rating;
    private Patient patient;
    private Staff staff;
    
    public OperationsStaff(Integer orderNumber)
    {
        this.rating = ratingsList.get(orderNumber);
        this.staff = new Staff(orderNumber);
        this.patient = orderNumber < 6 ? Patient.InitializePatientsList().get(orderNumber) : null;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    public Staff getStaff() {
        return staff;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    
    public Integer getRating() {
        return rating;
    }
    
    private final List<Integer> ratingsList = new ArrayList<Integer>() {{
        add(3);
        add(2);
        add(5);
        add(6);
        add(4);
        add(9);
        add(7);
        add(8);
        add(10);
    }};
}
