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
public class Nurse {
    private OperationsStaff operationsStaff;
    
    public Nurse(Integer orderNumber) {
        this.operationsStaff = new OperationsStaff(orderNumber + 6);
    }
    
    public static List<Nurse> InitializeNursesList()
    {
        List<Nurse> listOfNurses = new ArrayList<>();
        for (int i=0; i < 3; i++) {
            Nurse newNurse = new Nurse(i);
            listOfNurses.add(newNurse);
        }
        return listOfNurses;
    }
    
    public void setOperationsStaff(OperationsStaff operationsStaff) {
        this.operationsStaff = operationsStaff;
    }
    
    public OperationsStaff getOperationsStaff() {
        return operationsStaff;
    }
}
