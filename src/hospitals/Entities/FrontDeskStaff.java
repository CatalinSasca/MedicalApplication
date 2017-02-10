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
public class FrontDeskStaff {
    private AdministrativeStaff administrativeStaff;
    
    public FrontDeskStaff(Integer orderNumber) {
        this.administrativeStaff = new AdministrativeStaff(orderNumber);
    }
    
    public void setAdministrativeStaff(AdministrativeStaff administrativeStaff) {
        this.administrativeStaff = administrativeStaff;
    }
    
    public AdministrativeStaff getAdministrativeStaff() {
        return administrativeStaff;
    }
}
