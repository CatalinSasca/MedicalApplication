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
public class Surgery {
    private String surgeryDescription;
    private Date surgeryDate;
    
    public Surgery(Integer orderNumber) {
        this.surgeryDescription = surgeriesList.get(orderNumber);
        this.surgeryDate = surgeryDateList.get(orderNumber);
    }
    
    private final List<String> surgeriesList = new ArrayList<String>() {{
        add("Surgery1");
        add("Surgery2");
        add("Surgery3");
        add("Surgery4");
        add("Surgery5");
        add("Surgery6");
    }};
    
    private final List<Date> surgeryDateList = new ArrayList<Date>() {{
            try {
                add(CreateDate("01/21/15"));
                add(CreateDate("04/22/16"));
                add(CreateDate("03/23/15"));
                add(CreateDate("10/24/16"));
                add(CreateDate("12/25/15"));
                add(CreateDate("05/26/16"));
            } catch (ParseException ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
    }};
    
    private Date CreateDate(String value) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
        Date date = formatter.parse(value);
        return date;
    }
    
    public void setSurgeryDescription(String surgeryDescription) {
        this.surgeryDescription = surgeryDescription;
    }
    
    public String getSurgeryDescription() {
        return surgeryDescription;
    }
    
    public void setSurgeryDate(Date surgeryDate) {
        this.surgeryDate = surgeryDate;
    }
    
    public Date getSurgeryDate() {
        return surgeryDate;
    }
    
}
