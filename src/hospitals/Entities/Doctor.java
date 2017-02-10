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
public class Doctor {
    private String[] specialty;
    private String[] locations;
    private OperationsStaff operationsStaff;
    
    public Doctor(Integer orderNumber) {
        this.specialty = specialtiesList[orderNumber];
        this.locations = locationsList[orderNumber];
        this.operationsStaff = new OperationsStaff(orderNumber);
    }
    
    public static List<Doctor> InitializeDoctorsList()
    {
        List<Doctor> listOfDoctors = new ArrayList<>();
        for (int i=0; i < 3; i++) {
            Doctor newDoctor = new Doctor(i);
            listOfDoctors.add(newDoctor);
        }
        return listOfDoctors;
    }
    
    private final String[][] specialtiesList = new String[][] {
        new String[] { "specialty1", "specialty2", "specialty3" },
        new String[] { "specialty4", "specialty5", "specialty6" },
        new String[] { "specialty7", "specialty8", "specialty9" },
        new String[] { "specialty1", "specialty2", "specialty3" },
        new String[] { "specialty4", "specialty5", "specialty6" },
        new String[] { "specialty7", "specialty8", "specialty9" }
    };
    
    private final String[][] locationsList = new String[][] {
        new String[] { "location1", "location2", "location3" },
        new String[] { "location4", "location5", "location6" },
        new String[] { "location7", "location8", "location9" },
        new String[] { "location1", "location2", "location3" },
        new String[] { "location4", "location5", "location6" },
        new String[] { "location7", "location8", "location9" }
    };
    
    public void setPatient(String[] specialty) {
        this.specialty = specialty;
    }
    
    public String[] getPatient() {
        return specialty;
    }
    
    public void setLocations(String[] locations) {
        this.locations = locations;
    }
    
    public String[] getLocations() {
        return locations;
    }
    
    public void setOperationsStaff(OperationsStaff operationsStaff) {
        this.operationsStaff = operationsStaff;
    }
    
    public OperationsStaff getOperationsStaff() {
        return operationsStaff;
    }
}
