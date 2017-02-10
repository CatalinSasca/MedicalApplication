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
public class FullName {
    private String fullName;
    
    public FullName(String givenName, String middleName, String familyName) {
        fullName = givenName + " " + middleName + " " + familyName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getFullName() {
        return fullName;
    }
    
}
