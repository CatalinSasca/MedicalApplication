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
public class Technologist {
    private TechnicalStaff technicalStaff;
    
    public Technologist(Integer orderNumber) {
        this.technicalStaff = new TechnicalStaff(orderNumber + 15);
    }
    
    public static List<Technologist> InitializeTechnologistsList()
    {
        List<Technologist> listOfTechnologists = new ArrayList<>();
        for (int i=0; i < 2; i++) {
            Technologist newTechnologist = new Technologist(i);
            listOfTechnologists.add(newTechnologist);
        }
        return listOfTechnologists;
    }
    
    public void setTechnicalStaff(TechnicalStaff technicalStaff) {
        this.technicalStaff = technicalStaff;
    }
    
    public TechnicalStaff getTechnicalStaff() {
        return technicalStaff;
    }
}
