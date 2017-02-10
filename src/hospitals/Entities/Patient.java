/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals.Entities;

import hospitals.Enums.Gender;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kiddo
 */
public class Patient {
    private String id;
    private Date accepted;
    private History sickness;
    //private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;
    private Person personDetails;
    private Prescription pacientPrescription;
    private Therapy pacientTherapy;
    private Surgery pacientSurgery;
    
    public Patient(Integer orderNumber, Integer indGender, Hospital hospital) {
        this.id = ids.get(orderNumber);
        this.accepted = acceptances.get(orderNumber);
        this.sickness = sicknesses.get(orderNumber);
        //this.prescriptions = prescriptionsList[orderNumber];
        this.allergies = allergiesList[orderNumber];
        this.specialReqs = specialReqsList[orderNumber];
        this.personDetails = new Person(orderNumber, indGender, hospital);
        this.pacientPrescription = new Prescription(orderNumber);
        this.pacientTherapy = new Therapy(orderNumber);
        this.pacientSurgery = new Surgery(orderNumber);
    }
    
    public static List<Patient> InitializePatientsList()
    {
        List<Patient> listOfPacients = new ArrayList<>();
        for (int i=0; i < 6; i++) {
            Patient newPatient = new Patient(i, pacientGendersIds.get(i), Hospital.patientsHospitals.get(i));
            listOfPacients.add(newPatient);
        }
        return listOfPacients;
    }
    
    private static final List<Integer> pacientGendersIds = new ArrayList<Integer>() {{
        add(0); //male
        add(1); //female
        add(1);
        add(1);
        add(0);
        add(1);
    }};
    
    private final List<String> ids = new ArrayList<String>() {{
        add("001");
        add("002");
        add("003");
        add("004");
        add("005");
        add("006");
    }};
    
    private final List<Date> acceptances = new ArrayList<Date>() {{
            try {
                add(CreateDate("01/21/11"));
                add(CreateDate("04/22/12"));
                add(CreateDate("03/23/11"));
                add(CreateDate("10/24/12"));
                add(CreateDate("12/25/11"));
                add(CreateDate("05/26/12"));
            } catch (ParseException ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
    }};
    
    private final List<History> sicknesses = new ArrayList<History>() {{
        add(new History("sickness1", "details1"));
        add(new History("sickness2", "details2"));
        add(new History("sickness3", "details3"));
        add(new History("sickness4", "details4"));
        add(new History("sickness5", "details5"));
        add(new History("sickness6", "details6"));
    }};
    
    private final String[][] prescriptionsList = new String[][] {
        new String[] { "", "", "" },
        new String[] { "", "", "" },
        new String[] { "", "", "" },
        new String[] { "", "", "" },
        new String[] { "", "", "" },
        new String[] { "", "", "" }
    };
    
    private final String[][] allergiesList = new String[][] {
        new String[] { "allergy1", "allergy2", "allergy3" },
        new String[] { "allergy1", "allergy3", "allergy4" },
        new String[] { "allergy1", "allergy3", "allergy5" },
        new String[] { "allergy1", "allergy4", "allergy7" },
        new String[] { "allergy1", "allergy5", "allergy6" },
        new String[] { "allergy1", "allergy2", "allergy7" }
    };
    
    private final String[][] specialReqsList = new String[][] {
        new String[] { "specialReqs1", "specialReqs1", "specialReqs1" },
        new String[] { "specialReqs2", "specialReqs2", "specialReqs2" },
        new String[] { "specialReqs3", "specialReqs3", "specialReqs3" },
        new String[] { "specialReqs4", "specialReqs4", "specialReqs4" },
        new String[] { "specialReqs5", "specialReqs5", "specialReqs5" },
        new String[] { "specialReqs6", "specialReqs6", "specialReqs6" }
    };
    
    private Date CreateDate(String value) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        Date date = formatter.parse(value);
        return date;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }
    
    public Date getAccepted() {
        return accepted;
    }
    
    public void setSickness(History sickness) {
        this.sickness = sickness;
    }
    
    public History getSickness() {
        return sickness;
    }
    
    /*public void setPrescriptions(String[] prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    public String[] getPrescriptions() {
        return prescriptions;
    }*/
    
    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }
    
    public String[] getAllergies() {
        return allergies;
    }
    
    public void setSpecialReqs(String[] specialReqs) {
        this.specialReqs = specialReqs;
    }
    
    public String[] getSpecialReqs() {
        return specialReqs;
    }
    
    public void setPersonDetails(Person personDetails) {
        this.personDetails = personDetails;
    }
    
    public Person getPersonDetails() {
        return personDetails;
    }
    
    public void setPacientPrescription(Prescription pacientPrescription) {
        this.pacientPrescription = pacientPrescription;
    }
    
    public Prescription getPacientPrescription() {
        return pacientPrescription;
    }
    
    public void setPacientTherapy(Therapy pacientTherapy) {
        this.pacientTherapy = pacientTherapy;
    }
    
    public Therapy getPacientTherapy() {
        return pacientTherapy;
    }
    
    public void setPacientSurgery(Surgery pacientSurgery) {
        this.pacientSurgery = pacientSurgery;
    }
    
    public Surgery getPacientSurgery() {
        return pacientSurgery;
    }
}
