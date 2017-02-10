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
public class SurgicalTechnologist {
    private Technologist technologist;
    
    public SurgicalTechnologist(Integer orderNumber) {
        this.technologist = new Technologist(orderNumber + 2);
    }
    
    public static List<SurgicalTechnologist> InitializeSurgicalTechnologistList()
    {
        List<SurgicalTechnologist> listOfSurgicalTechnologists = new ArrayList<>();
        for (int i=0; i < 3; i++) {
            SurgicalTechnologist newSurgicalTechnologist = new SurgicalTechnologist(i);
            listOfSurgicalTechnologists.add(newSurgicalTechnologist);
        }
        return listOfSurgicalTechnologists;
    }
    
    public void setTechnologist(Technologist technologist) {
        this.technologist = technologist;
    }
    
    public Technologist getTechnologist() {
        return technologist;
    }
}
