/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals;

import hospitals.Entities.Doctor;
import hospitals.Entities.Hospital;
import hospitals.Entities.Nurse;
import hospitals.Entities.OperationsStaff;
import hospitals.Entities.Patient;
import hospitals.Entities.Receptionist;
import hospitals.Entities.Staff;
import hospitals.Entities.Surgeon;
import hospitals.Entities.SurgicalTechnologist;
import hospitals.Entities.Technician;
import hospitals.Entities.Technologist;
import hospitals.Enums.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Kiddo
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    private static List<Patient> patients;
    private static List<Doctor> doctors;
    private static List<Surgeon> surgeons;
    private static List<Nurse> nurses;
    private static List<Receptionist> receptionists;
    private static List<Technician> technicians;
    private static List<Technologist> technologists;
    private static List<SurgicalTechnologist> surgicalTechnologists;
    public static void main(String[] args) {
        // TODO code application logic here
        Integer option;
        Scanner s = new Scanner(System.in);
        patients = Patient.InitializePatientsList();
        doctors = Doctor.InitializeDoctorsList();
        surgeons = Surgeon.InitializeSurgeonsList();
        nurses = Nurse.InitializeNursesList();
        receptionists = Receptionist.InitializeNursesList();
        technicians = Technician.InitializeTechniciansList();
        technologists = Technologist.InitializeTechnologistsList();
        surgicalTechnologists = SurgicalTechnologist.InitializeSurgicalTechnologistList();
        do {
            System.out.println("\nSelect your option:"
                + "\n1. Which patients do they have for each hospital?"
                + "\n2. What are the patient's details?"
                + "\n3. What are the most common allergies for each patient?"
                + "\n4. What languages does each staff member speak?"
                + "\n5. What are the phone numbers for each hospital?"
                + "\n6. How old are each of the patients and what is their prescription?"
                + "\n7. What is the surgeon's schedule for each patient (the items should be sorted by the earlies surgery and should show the surgeon's name, calcifications, age and patient's name and age)?"
                + "\n8. The patients sorted by their date, when they entered the hospital, descending by date."
                + "\n9. The employees should be shown sorted by their certification. (each employee might have multiple or no certification)"
                + "\n10. Technical employees should be shown and sorted by the date when they were employed by each hospital."
                + "\n11. There should be a report to show how much is the percentage of male patients vs female patients."
                + "\n12. What are the special requirements for each patient grouped by the doctor taking care of him/her for each hospital."
                + "\n13. What therapies are prescribed to each patient?"
                + "\n15. Show the rating for each doctor and nurse order by the best to the lowest for each hospital."
            );

            String input = s.next();
            option = input.matches("[0-9]+") ? Integer.parseInt(input) : 0;

            switch (option) {
                case 0:
                    System.out.println("\nThe program has closed!");
                    break;
                case 1:
                    ShowCase1();
                    break;
                case 2:
                    ShowCase2();
                    break;
                case 3:
                    ShowCase3();
                    break;
                case 4:
                    ShowCase4();
                    break;
                case 5:
                    ShowCase5();
                    break;
                case 6:
                    ShowCase6();
                    break;
                case 7:
                    ShowCase7();
                    break;
                case 8:
                    ShowCase8();
                    break;
                case 9:
                    ShowCase9();
                    break;
                case 10:
                    ShowCase10();
                    break;
                case 11:
                    ShowCase11();
                    break;
                case 12:
                    ShowCase12();
                    break;
                case 13:
                    ShowCase13();
                    break;
                case 15:
                    ShowCase15();
                    break;
                default:
                    System.out.println("\nThere is no such option. Please select another one!\n");
                    break;
            }
        } while (option != 0);
    }
    
    private static void ShowCase1()
    {
        List<Patient> filteredPatients = new ArrayList<>();
        Integer option;
        Scanner s = new Scanner(System.in);
        String input;
        do {
            System.out.println("Select hospital pacients:"
                    + "\n1. Alameda Hospital's pacients."
                    + "\n2. Highland Hospital's pacients."
                    + "\n Any other character to go back.");
            
            input = s.next();
            option = input.matches("[0-9]+") ? Integer.parseInt(input) : 0;
            
            switch (option) {
                case 1:
                    filteredPatients = patients.stream()
                    .filter(u -> u.getPersonDetails().getHospital().getName().contains("Alameda Hospital"))
                    .collect(Collectors.toList());
                    break;
                case 2:
                    filteredPatients = patients.stream()
                    .filter(u -> u.getPersonDetails().getHospital().getName().contains("Highland Hospital"))
                    .collect(Collectors.toList());
                    break;
                default:
                    break;
            }
            for (Patient p : filteredPatients) { 
                System.out.println(p.getPersonDetails().getFullName() +
                        " ------> " + p.getPersonDetails().getHospital().getName());
            }
        } while (option != 0);
    }
    
    private static void ShowCase2()
    {
        patients.forEach((p) -> {
            System.out.println(p.getPersonDetails().GetFullDetails());
        });
    }
    
    private static void ShowCase3()
    {
        List<String> commonAllergies = new ArrayList<>();
        patients.forEach((p) -> {
            commonAllergies.addAll(Arrays.asList(p.getAllergies()));
        });
        Map<String, Long> occurrences = commonAllergies.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        
        Object[] occurrencesArray = occurrences.entrySet().toArray();
        
        Arrays.sort(occurrencesArray, (Object o1, Object o2) -> ((Map.Entry<String, Long>) o2).getValue()
                .compareTo(((Map.Entry<String, Long>) o1).getValue()));
        
        for (Object ob : occurrencesArray) {
            System.out.println("Allergy: " + ((Map.Entry<String, Integer>) ob).getKey() + " -> "
            + ((Map.Entry<String, Integer>) ob).getValue() + " pacients");
        }
    }
    
    private static void ShowCase4()
    {
        doctors.forEach((d) -> {
            System.out.println("Name: " + d.getOperationsStaff().getStaff().getPersonDetails().getGivenName() + ", Languages: " + Arrays.toString(d.getOperationsStaff().getStaff().getLanguages()));
        });
        surgeons.forEach((s) -> {
            System.out.println("Name: " + s.getDoctor().getOperationsStaff().getStaff().getPersonDetails().getGivenName() + ", Languages: " + Arrays.toString(s.getDoctor().getOperationsStaff().getStaff().getLanguages()));
        });
        nurses.forEach((n) -> {
            System.out.println("Name: " + n.getOperationsStaff().getStaff().getPersonDetails().getGivenName() + ", Languages: " + Arrays.toString(n.getOperationsStaff().getStaff().getLanguages()));
        });
        receptionists.forEach((r) -> {
            System.out.println("Name: " + r.getFrontDeskStaff().getAdministrativeStaff().getStaff().getPersonDetails().getGivenName() + ", Languages: " + Arrays.toString(r.getFrontDeskStaff().getAdministrativeStaff().getStaff().getLanguages()));
        });
        technicians.forEach((t) -> {
            System.out.println("Name: " + t.getTechnicalStaff().getStaff().getPersonDetails().getGivenName() + ", Languages: " + Arrays.toString(t.getTechnicalStaff().getStaff().getLanguages()));
        });
        technologists.forEach((t) -> {
            System.out.println("Name: " + t.getTechnicalStaff().getStaff().getPersonDetails().getGivenName() + ", Languages: " + Arrays.toString(t.getTechnicalStaff().getStaff().getLanguages()));
        });
        surgicalTechnologists.forEach((s) -> {
            System.out.println("Name: " + s.getTechnologist().getTechnicalStaff().getStaff().getPersonDetails().getGivenName() + ", Languages: " + Arrays.toString(s.getTechnologist().getTechnicalStaff().getStaff().getLanguages()));
        });
    }
    
    private static void ShowCase5()
    {
        List<Hospital> hospitals;
        hospitals = patients.stream().map(p -> p.getPersonDetails().getHospital()).filter(distinctByKey(p -> p.getName())).collect(Collectors.toList());
        hospitals.forEach((h) -> {
            System.out.println("Hospital: " + h.getName() + ", Phone number: " + h.getPhone().getNumber());
        });
    }
    
    private static void ShowCase6()
    {
        patients.forEach((p) -> {
            System.out.println(p.getPersonDetails().getFullName() + " - " + p.getPersonDetails().getAge().toString() + " - " + p.getPacientPrescription().getPrescriptionDescription());
        });
    }
    
    private static void ShowCase7()
    {
        Collections.sort(surgeons, (Surgeon s1, Surgeon s2) -> s1.getDoctor().getOperationsStaff().getPatient().getPacientSurgery().getSurgeryDate()
                .compareTo(s2.getDoctor().getOperationsStaff().getPatient().getPacientSurgery().getSurgeryDate()));
        surgeons.forEach((s) -> {
            System.out.println(s.getDoctor().getOperationsStaff().getPatient().getPacientSurgery().getSurgeryDate().toString()
                    + " - " + s.getDoctor().getOperationsStaff().getStaff().getPersonDetails().getFullName() 
                    + " - " + Arrays.toString(s.getDoctor().getOperationsStaff().getStaff().getCertification()) 
                    + " - " + s.getDoctor().getOperationsStaff().getStaff().getPersonDetails().getAge().toString()
                    + " - " + s.getDoctor().getOperationsStaff().getPatient().getPersonDetails().getFullName()
                    + " - " + s.getDoctor().getOperationsStaff().getPatient().getPersonDetails().getAge().toString());
        });
    }
    
    private static void ShowCase8()
    {
        Collections.sort(patients, (Patient o1, Patient o2) -> o2.getAccepted().compareTo(o1.getAccepted()));
        
        patients.forEach((p) -> {
            System.out.println(p.getPersonDetails().getFullName() + " - " + p.getAccepted().toString());
        });
    }
    
    private static void ShowCase9()
    {   
        Map<String, String[]> staffMembers = new HashMap<>();
        staffMembers.putAll(doctors.stream().collect(Collectors.toMap(d -> d.getOperationsStaff().getStaff().getPersonDetails().getGivenName(), d -> d.getOperationsStaff().getStaff().getCertification())));
        staffMembers.putAll(surgeons.stream().collect(Collectors.toMap(s -> s.getDoctor().getOperationsStaff().getStaff().getPersonDetails().getGivenName(), s -> s.getDoctor().getOperationsStaff().getStaff().getCertification())));
        staffMembers.putAll(nurses.stream().collect(Collectors.toMap(n -> n.getOperationsStaff().getStaff().getPersonDetails().getGivenName(), n -> n.getOperationsStaff().getStaff().getCertification())));
        staffMembers.putAll(receptionists.stream().collect(Collectors.toMap(r -> r.getFrontDeskStaff().getAdministrativeStaff().getStaff().getPersonDetails().getGivenName(), r -> r.getFrontDeskStaff().getAdministrativeStaff().getStaff().getCertification())));
        staffMembers.putAll(technicians.stream().collect(Collectors.toMap(t -> t.getTechnicalStaff().getStaff().getPersonDetails().getGivenName(), t -> t.getTechnicalStaff().getStaff().getCertification())));
        staffMembers.putAll(technologists.stream().collect(Collectors.toMap(t -> t.getTechnicalStaff().getStaff().getPersonDetails().getGivenName(), t -> t.getTechnicalStaff().getStaff().getCertification())));
        staffMembers.putAll(surgicalTechnologists.stream().collect(Collectors.toMap(s -> s.getTechnologist().getTechnicalStaff().getStaff().getPersonDetails().getGivenName(), s -> s.getTechnologist().getTechnicalStaff().getStaff().getCertification())));
  
        Object[] staffArray = staffMembers.entrySet().toArray();
        
        Arrays.sort(staffArray, (Object o1, Object o2) -> ((Map.Entry<String, String[]>) o2).getValue().length - 
                (((Map.Entry<String, String[]>) o1).getValue().length));
        
        for (Object ob : staffArray) {
            System.out.println("Name: " + ((Map.Entry<String, String[]>) ob).getKey() + " -> "
            + Arrays.toString(((Map.Entry<String, String[]>) ob).getValue()));
        }        
    }
    
    private static void ShowCase10()
    {
        List<Staff> staffMembers = new ArrayList<>();
        staffMembers.addAll(technicians.stream().map(s -> s.getTechnicalStaff().getStaff()).collect(Collectors.toList()));
        staffMembers.addAll(technologists.stream().map(s -> s.getTechnicalStaff().getStaff()).collect(Collectors.toList()));
        staffMembers.addAll(surgicalTechnologists.stream().map(s -> s.getTechnologist().getTechnicalStaff().getStaff()).collect(Collectors.toList()));
        Collections.sort(staffMembers, (Staff o1, Staff o2) -> o1.getJoined().compareTo(o2.getJoined()));
        
        System.out.println("\nAlameda Hospital's technical employees:");
        staffMembers.forEach((p) -> {
            if ("Alameda Hospital".equals(p.getPersonDetails().getHospital().getName())) {
                System.out.println(p.getPersonDetails().getFullName() + " - " + p.getJoined().toString());
            }
        });
        System.out.println("\nHighland Hospital's technical employees:");
        staffMembers.forEach((p) -> {
            if ("Highland Hospital".equals(p.getPersonDetails().getHospital().getName())) {
                System.out.println(p.getPersonDetails().getFullName() + " - " + p.getJoined().toString());
            }
        });
    }
    
    private static void ShowCase11()
    {
        List<Patient> malePatients = patients.stream().filter(u -> u.getPersonDetails().getGender().equals(Gender.Male))
                    .collect(Collectors.toList());
        List<Patient> femalePatients = patients.stream().filter(u -> u.getPersonDetails().getGender().equals(Gender.Female))
                    .collect(Collectors.toList());
        Double malePercentage = (Double.valueOf(malePatients.size()) / patients.size()) * 100;
        Double femalePercentage = (Double.valueOf(femalePatients.size()) / patients.size()) * 100;
        System.out.println("Male percentage: " + malePercentage + "% of " + patients.size() + " patients.");
        System.out.println("Female percentage: " + femalePercentage + "% of " + patients.size() + " patients.");
    }
    
    private static void ShowCase12()
    {
        List<OperationsStaff> operationsStaffMembers = new ArrayList<>();
        operationsStaffMembers.addAll(doctors.stream().map(s -> s.getOperationsStaff()).collect(Collectors.toList()));
        operationsStaffMembers.addAll(surgeons.stream().map(s -> s.getDoctor().getOperationsStaff()).collect(Collectors.toList()));
        Map<OperationsStaff, Patient> groupedPacients = operationsStaffMembers.stream().collect(Collectors.toMap(o -> o, p -> p.getPatient()));
        System.out.println("\nAlameda Hospital's technical employees:");
        groupedPacients.forEach((o, p) -> {
            if ("Alameda Hospital".equals(p.getPersonDetails().getHospital().getName())) {
                System.out.println("Doctor: " + o.getStaff().getPersonDetails().getFullName() + "; Pacient: " + p.getPersonDetails().getFullName() + "; Special requirements: " + Arrays.toString(p.getSpecialReqs()));
            }
        });
        
        System.out.println("\nHighland Hospital's technical employees:");
        groupedPacients.forEach((o, p) -> {
            if ("Highland Hospital".equals(p.getPersonDetails().getHospital().getName())) {
                System.out.println("Doctor: " + o.getStaff().getPersonDetails().getFullName() + "; Pacient: " + p.getPersonDetails().getFullName() + "; Special requirements: " + Arrays.toString(p.getSpecialReqs()));
            }
        });
    }
    
    private static void ShowCase13()
    {
        patients.forEach((p) -> {
            System.out.println(p.getPersonDetails().getFullName() + " - " + p.getPacientTherapy().getTherapyDescription());
        });
    }
    
    private static void ShowCase15()
    {
        List<OperationsStaff> operationsStaffMembers = new ArrayList<>();
        operationsStaffMembers.addAll(doctors.stream().map(s -> s.getOperationsStaff()).collect(Collectors.toList()));
        operationsStaffMembers.addAll(surgeons.stream().map(s -> s.getDoctor().getOperationsStaff()).collect(Collectors.toList()));
        operationsStaffMembers.addAll(nurses.stream().map(s -> s.getOperationsStaff()).collect(Collectors.toList()));
        Collections.sort(operationsStaffMembers, (OperationsStaff o1, OperationsStaff o2) -> o2.getRating().compareTo(o1.getRating()));
        
        System.out.println("\nAlameda Hospital's operations staff:");
        operationsStaffMembers.forEach((p) -> {
            if ("Alameda Hospital".equals(p.getStaff().getPersonDetails().getHospital().getName())) {
                System.out.println(p.getStaff().getPersonDetails().getFullName() + " - " + p.getRating());
            }
        });
        System.out.println("\nHighland Hospital's operations staff:");
        operationsStaffMembers.forEach((p) -> {
            if ("Highland Hospital".equals(p.getStaff().getPersonDetails().getHospital().getName())) {
                System.out.println(p.getStaff().getPersonDetails().getFullName() + " - " + p.getRating());
            }
        });
    }
    
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
