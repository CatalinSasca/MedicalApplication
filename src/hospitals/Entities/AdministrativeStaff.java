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
public class AdministrativeStaff {
    private Staff staff;
    
    public AdministrativeStaff(Integer orderNumber) {
        this.staff = new Staff(orderNumber);
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    
    public Staff getStaff() {
        return staff;
    }
}
