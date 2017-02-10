/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals.Entities;

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
public class Staff {
    private Date joined;
    private String[] education;
    private String[] certification;
    private String[] languages;
    private Person personDetails;
    private Hospital hospital;

    public Staff(Integer orderNumber) 
    {
        this.joined = joinedList.get(orderNumber);
        this.education = educationList[orderNumber];
        this.certification = certificationList[orderNumber];
        this.languages = languagesList[orderNumber];
        this.personDetails = new Person(orderNumber + 6, 
                                staffIndGender.get(orderNumber), 
                                staffHospital.get(orderNumber));
    }
    
    private final List<Date> joinedList = new ArrayList<Date>() {{
            try {
                add(CreateBirthDate("01/21/11"));
                add(CreateBirthDate("04/22/12"));
                add(CreateBirthDate("03/23/11"));
                add(CreateBirthDate("10/24/12"));
                add(CreateBirthDate("12/25/11"));
                add(CreateBirthDate("05/26/12"));
                add(CreateBirthDate("05/26/13"));
                add(CreateBirthDate("01/12/09"));
                add(CreateBirthDate("01/13/10"));
                add(CreateBirthDate("05/12/11"));
                add(CreateBirthDate("03/26/15"));
                add(CreateBirthDate("01/16/17"));
                add(CreateBirthDate("07/14/14"));
                add(CreateBirthDate("01/13/05"));
                add(CreateBirthDate("09/29/13"));
                add(CreateBirthDate("08/01/11"));
                add(CreateBirthDate("07/04/10"));
                add(CreateBirthDate("11/09/15"));
                add(CreateBirthDate("12/12/16"));
                add(CreateBirthDate("04/30/17"));
            } catch (ParseException ex) {
                Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
    }};
    
    private Date CreateBirthDate(String value) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        Date date = formatter.parse(value);
        return date;
    }
    
    private final String[][] educationList = new String[][] {
        new String[] { "ed1", "ed2", "ed3" },
        new String[] { "ed4", "ed5", "ed6" },
        new String[] { "ed7", "ed8", "ed9" },
        new String[] { "ed1", "ed2", "ed3" },
        new String[] { "ed4", "ed5", "ed6" },
        new String[] { "ed7", "ed8", "ed9" },
        new String[] { "ed1", "ed2", "ed3" },
        new String[] { "ed4", "ed5", "ed6" },
        new String[] { "ed7", "ed8", "ed9" },
        new String[] { "ed1", "ed2", "ed3" },
        new String[] { "ed4", "ed5", "ed6" },
        new String[] { "ed7", "ed8", "ed9" },
        new String[] { "ed1", "ed2", "ed3" },
        new String[] { "ed4", "ed5", "ed6" },
        new String[] { "ed7", "ed8", "ed9" },
        new String[] { "ed1", "ed2", "ed3" },
        new String[] { "ed4", "ed5", "ed6" },
        new String[] { "ed7", "ed8", "ed9" },
        new String[] { "ed1", "ed2", "ed3" },
        new String[] { "ed4", "ed5", "ed6" }
    };
    
    private final String[][] certificationList = new String[][] {
        new String[] { "cert1", "cert2", "cert3" },
        new String[] { "cert4", "cert5", "cert6" },
        new String[] { "cert7", "cert8", "cert9" },
        new String[] { "cert1", "cert2", "cert3" },
        new String[] { "cert4", "cert5", "cert6" },
        new String[] { "cert7", "cert8", "cert9" },
        new String[] { "cert1", "cert2", "cert3" },
        new String[] { "cert4", "cert5", "cert6" },
        new String[] { "cert7", "cert8", "cert9" },
        new String[] { "cert1", "cert2", "cert3" },
        new String[] { "cert4", "cert5", "cert6" },
        new String[] { "cert7", "cert8", "cert9" },
        new String[] { "cert1", "cert2", "cert3" },
        new String[] { "cert4", "cert5", "cert6" },
        new String[] { "cert7", "cert8", "cert9" },
        new String[] { "cert1", "cert2", "cert3" },
        new String[] { "cert4", "cert5", "cert6" },
        new String[] { "cert7", "cert8", "cert9" },
        new String[] { "cert1", "cert2", "cert3" },
        new String[] { "cert4", "cert5", "cert6" }
    };
    
    private final String[][] languagesList = new String[][] {
        new String[] { "lang1", "lang2", "lang3" },
        new String[] { "lang4", "lang5", "lang6" },
        new String[] { "lang7", "lang8", "lang9" },
        new String[] { "lang1", "lang2", "lang3" },
        new String[] { "lang4", "lang5", "lang6" },
        new String[] { "lang7", "lang8", "lang9" },
        new String[] { "lang1", "lang2", "lang3" },
        new String[] { "lang4", "lang5", "lang6" },
        new String[] { "lang7", "lang8", "lang9" },
        new String[] { "lang1", "lang2", "lang3" },
        new String[] { "lang4", "lang5", "lang6" },
        new String[] { "lang7", "lang8", "lang9" },
        new String[] { "lang1", "lang2", "lang3" },
        new String[] { "lang4", "lang5", "lang6" },
        new String[] { "lang7", "lang8", "lang9" },
        new String[] { "lang1", "lang2", "lang3" },
        new String[] { "lang4", "lang5", "lang6" },
        new String[] { "lang7", "lang8", "lang9" },
        new String[] { "lang1", "lang2", "lang3" },
        new String[] { "lang4", "lang5", "lang6" }
    };
    
    private final List<Integer> staffIndGender = new ArrayList<Integer>() {{
        add(1);
        add(0);
        add(1);
        add(1);
        add(0);
        add(1);
        add(0);
        add(0);
        add(0);
        add(0);
        add(1);
        add(1);
        add(0);
        add(0);
        add(0);
        add(0);
        add(1);
        add(1);
        add(1);
        add(0);
    }};
    
    private final List<Hospital> staffHospital = new ArrayList<Hospital>() {{
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
        add(new Hospital(0));
        add(new Hospital(1));
    }};
    
    public void setJoined(Date joined) {
        this.joined = joined;
    }
    
    public Date getJoined() {
        return joined;
    }
    
    public void setEducation(String[] education) {
        this.education = education;
    }
    
    public String[] getEducation() {
        return education;
    }
    
    public void setCertification(String[] certification) {
        this.certification = certification;
    }
    
    public String[] getCertification() {
        return certification;
    }
    
    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
    
    public String[] getLanguages() {
        return languages;
    }
    
    public void setPersonDetails(Person personDetails) {
        this.personDetails = personDetails;
    }
    
    public Person getPersonDetails() {
        return personDetails;
    }
}