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
public class Therapy {
    
    private String therapyDescription;
    
    public Therapy(int orderNumber) {
        this.therapyDescription = therapiesList.get(orderNumber);
    }
    
    private final List<String> therapiesList = new ArrayList<String>() {{
        add("Therapy1");
        add("Therapy2");
        add("Therapy3");
        add("Therapy4");
        add("Therapy5");
        add("Therapy6");
    }};
    
    public void setTherapyDescription(String therapyDescription) {
        this.therapyDescription = therapyDescription;
    }
    
    public String getTherapyDescription() {
        return therapyDescription;
    }
}
