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
public class Prescription {
    
    private String prescriptionDescription;
    
    public Prescription(int orderNumber) {
        this.prescriptionDescription = prescriptionsList.get(orderNumber);
    }
    
    private final List<String> prescriptionsList = new ArrayList<String>() {{
        add("Prescription1");
        add("Prescription2");
        add("Prescription3");
        add("Prescription4");
        add("Prescription5");
        add("Prescription6");
    }};
    
    public void setPrescriptionDescription(String id) {
        this.prescriptionDescription = prescriptionDescription;
    }
    
    public String getPrescriptionDescription() {
        return prescriptionDescription;
    }
}
