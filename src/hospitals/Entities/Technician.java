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
public class Technician {
    private TechnicalStaff technicalStaff;
    
    public Technician(Integer orderNumber) {
        this.technicalStaff = new TechnicalStaff(orderNumber + 12);
    }
    
    public static List<Technician> InitializeTechniciansList()
    {
        List<Technician> listOfTechnicians = new ArrayList<>();
        for (int i=0; i < 3; i++) {
            Technician newTechnician = new Technician(i);
            listOfTechnicians.add(newTechnician);
        }
        return listOfTechnicians;
    }
    
    public void setTechnicalStaff(TechnicalStaff technicalStaff) {
        this.technicalStaff = technicalStaff;
    }
    
    public TechnicalStaff getTechnicalStaff() {
        return technicalStaff;
    }
}
