/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals.Entities;

/**
 *
 * @author Kiddo
 */
public class History {
    private String sickness;
    private String details;
    
    public History(String sickness, String details) {
        this.sickness = sickness;
        this.details = details;
    }
    
    public void setSickness(String sickness) {
        this.sickness = sickness;
    }
    
    public String getSickness() {
        return sickness;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    
    public String getDetails() {
        return details;
    }
}
