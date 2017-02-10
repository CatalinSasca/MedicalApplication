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
public class Surgeon {
    private Doctor doctor;
    
    public Surgeon(Integer orderNumber) {
        this.doctor = new Doctor(orderNumber + 3);
    }
    
    public static List<Surgeon> InitializeSurgeonsList()
    {
        List<Surgeon> listOfSurgeons = new ArrayList<>();
        for (int i=0; i < 3; i++) {
            Surgeon newSurgeon = new Surgeon(i);
            listOfSurgeons.add(newSurgeon);
        }
        return listOfSurgeons;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }
}
