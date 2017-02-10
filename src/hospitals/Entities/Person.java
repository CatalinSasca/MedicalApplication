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
public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName fullName;
    private Integer age;
    private Date birthDate;
    private Address address;
    private Gender gender;
    private Phone phone;
    private Hospital hospital;
    
    /**
     *
     * @param orderNumber
     * @param indGender
     * @param hospital
     */
    public Person(Integer orderNumber, Integer indGender, Hospital hospital) {
        this.title = titles.get(indGender);
        this.givenName = givenNames.get(orderNumber);
        this.middleName = middleNames.get(orderNumber);
        this.familyName = familyNames.get(orderNumber);
        this.fullName = new FullName(givenName, middleName, familyName);
        this.age = ages.get(orderNumber);
        this.birthDate = birthDates.get(orderNumber);
        this.address = addresses.get(orderNumber);
        this.gender = Gender.valueOf(indGender);
        this.phone = phones.get(orderNumber);
        this.hospital = hospital;
        
    }
    
    private final List<String> titles = new ArrayList<String>() {{
        add("Mr.");
        add("Mrs.");
    }};
    
    private final List<String> givenNames = new ArrayList<String>() {{
        add("Neil");
        add("Andrea");
        add("Amanda");
        add("Rose");
        add("David");
        add("Kimberly");
        add("Jane");
        add("Jack");
        add("Jill");
        add("Sally");
        add("Sam");
        add("Scarlet");
        add("Neo");
        add("Nate");
        add("Nick");
        add("Ryan");
        add("Rose");
        add("Rihanna");
        add("Tom");
        add("Thor");
        add("Tim");
        add("Greg");
        add("Grace");
        add("Helena");
        add("Heather");
        add("Harvey");
    }};
    
    private final List<String> middleNames = new ArrayList<String>() {{
        add("A.");
        add("B.");
        add("C.");
        add("D.");
        add("E.");
        add("F.");
        add("J.");
        add("J.");
        add("J.");
        add("S.");
        add("S.");
        add("S.");
        add("N.");
        add("N.");
        add("N.");
        add("R.");
        add("R.");
        add("R.");
        add("T.");
        add("T.");
        add("T.");
        add("G.");
        add("G.");
        add("H.");
        add("H.");
        add("H.");
    }};
    
    private final List<Date> birthDates = new ArrayList<Date>() {{
            try {
                add(CreateBirthDate("01/21/81"));
                add(CreateBirthDate("04/22/82"));
                add(CreateBirthDate("03/23/83"));
                add(CreateBirthDate("10/24/84"));
                add(CreateBirthDate("12/25/83"));
                add(CreateBirthDate("05/26/82"));
                add(CreateBirthDate("01/21/81"));
                add(CreateBirthDate("04/22/82"));
                add(CreateBirthDate("03/23/83"));
                add(CreateBirthDate("10/24/84"));
                add(CreateBirthDate("12/25/83"));
                add(CreateBirthDate("05/26/82"));
                add(CreateBirthDate("01/21/81"));
                add(CreateBirthDate("04/22/82"));
                add(CreateBirthDate("03/23/83"));
                add(CreateBirthDate("10/24/84"));
                add(CreateBirthDate("12/25/83"));
                add(CreateBirthDate("05/26/82"));
                add(CreateBirthDate("01/21/81"));
                add(CreateBirthDate("04/22/82"));
                add(CreateBirthDate("03/23/83"));
                add(CreateBirthDate("10/24/84"));
                add(CreateBirthDate("12/25/83"));
                add(CreateBirthDate("05/26/82"));
                add(CreateBirthDate("01/21/81"));
                add(CreateBirthDate("04/22/82"));
            } catch (ParseException ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
    }};
    
    private Date CreateBirthDate(String value) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        Date date = formatter.parse(value);
        return date;
    }
    
    private final List<String> familyNames = new ArrayList<String>() {{
        add("Piper");
        add("Lewis");
        add("Walsh");
        add("Johnston");
        add("Rutherford");
        add("James");
        add("Piper");
        add("Lewis");
        add("Walsh");
        add("Johnston");
        add("Rutherford");
        add("James");
        add("Piper");
        add("Lewis");
        add("Walsh");
        add("Johnston");
        add("Rutherford");
        add("James");
        add("Piper");
        add("Lewis");
        add("Walsh");
        add("Johnston");
        add("Rutherford");
        add("James");
        add("Piper");
        add("Lewis");
    }};
    
    private final List<Address> addresses = new ArrayList<Address>() {{
        add(new Address("country1", "city1", "street1", 1, "details1"));
        add(new Address("country2", "city2", "street2", 2, "details2"));
        add(new Address("country3", "city3", "street3", 3, "details3"));
        add(new Address("country4", "city4", "street4", 4, "details4"));
        add(new Address("country5", "city5", "street5", 5, "details5"));
        add(new Address("country6", "city6", "street6", 6, "details6"));
        add(new Address("country1", "city1", "street1", 1, "details1"));
        add(new Address("country2", "city2", "street2", 2, "details2"));
        add(new Address("country3", "city3", "street3", 3, "details3"));
        add(new Address("country4", "city4", "street4", 4, "details4"));
        add(new Address("country5", "city5", "street5", 5, "details5"));
        add(new Address("country6", "city6", "street6", 6, "details6"));
        add(new Address("country1", "city1", "street1", 1, "details1"));
        add(new Address("country2", "city2", "street2", 2, "details2"));
        add(new Address("country3", "city3", "street3", 3, "details3"));
        add(new Address("country4", "city4", "street4", 4, "details4"));
        add(new Address("country5", "city5", "street5", 5, "details5"));
        add(new Address("country6", "city6", "street6", 6, "details6"));
        add(new Address("country1", "city1", "street1", 1, "details1"));
        add(new Address("country2", "city2", "street2", 2, "details2"));
        add(new Address("country3", "city3", "street3", 3, "details3"));
        add(new Address("country4", "city4", "street4", 4, "details4"));
        add(new Address("country5", "city5", "street5", 5, "details5"));
        add(new Address("country6", "city6", "street6", 6, "details6"));
        add(new Address("country1", "city1", "street1", 1, "details1"));
        add(new Address("country2", "city2", "street2", 2, "details2"));
    }};
    
    private final List<Phone> phones = new ArrayList<Phone>() {{
        add(new Phone("0741123450"));
        add(new Phone("0741123451"));
        add(new Phone("0741123452"));
        add(new Phone("0741123453"));
        add(new Phone("0741123454"));
        add(new Phone("0741123455"));
        add(new Phone("0741123450"));
        add(new Phone("0741123451"));
        add(new Phone("0741123452"));
        add(new Phone("0741123453"));
        add(new Phone("0741123454"));
        add(new Phone("0741123455"));
        add(new Phone("0741123450"));
        add(new Phone("0741123451"));
        add(new Phone("0741123452"));
        add(new Phone("0741123453"));
        add(new Phone("0741123454"));
        add(new Phone("0741123455"));
        add(new Phone("0741123450"));
        add(new Phone("0741123451"));
        add(new Phone("0741123452"));
        add(new Phone("0741123453"));
        add(new Phone("0741123454"));
        add(new Phone("0741123455"));
        add(new Phone("0741123450"));
        add(new Phone("0741123451"));
    }};
    
    private final List<Integer> ages = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        add(8);
        add(9);
        add(10);
        add(11);
        add(12);
        add(13);
        add(14);
        add(15);
        add(16);
        add(17);
        add(18);
        add(19);
        add(20);
        add(21);
        add(22);
        add(23);
        add(24);
        add(25);
        add(26);
    }};

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    
    public String getGivenName() {
        return givenName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    
    public String getFamilyName() {
        return familyName;
    }
    
    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
    
    public String getFullName() {
        return fullName.getFullName();
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    
    public Phone getPhone() {
        return phone;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public Hospital getHospital() {
        return hospital;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public String GetFullDetails() {
        StringBuilder str = new StringBuilder();
        str.append("Title: ").append(this.title).append(";");
        str.append(" Gender: ").append(this.gender.toString()).append(";");
        str.append(" Given Name: ").append(this.givenName).append(";");
        str.append(" Middle Name: ").append(this.middleName).append(";");
        str.append(" Family Name: ").append(this.familyName).append(";");
        str.append(" Birth Date: ").append(this.birthDate.toString()).append(";");
        str.append(this.address.GetFullAddress()).append(";");
        str.append(" Phone: ").append(this.phone.getNumber()).append(";");
        str.append(" Hospital: ").append(this.hospital.getName()).append(";");
        return str.toString();
    }
}