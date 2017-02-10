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
public class Receptionist {
    private FrontDeskStaff frontDeskStaff;
    
    public Receptionist(Integer orderNumber) {
        this.frontDeskStaff = new FrontDeskStaff(orderNumber + 9);
    }
    
    public static List<Receptionist> InitializeNursesList()
    {
        List<Receptionist> listOfReceptionists = new ArrayList<>();
        for (int i=0; i < 3; i++) {
            Receptionist newReceptionist = new Receptionist(i);
            listOfReceptionists.add(newReceptionist);
        }
        return listOfReceptionists;
    }
    
    public void setFrontDeskStaff(FrontDeskStaff frontDeskStaff) {
        this.frontDeskStaff = frontDeskStaff;
    }
    
    public FrontDeskStaff getFrontDeskStaff() {
        return frontDeskStaff;
    }
}
