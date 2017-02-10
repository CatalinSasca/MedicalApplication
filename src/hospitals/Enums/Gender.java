/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitals.Enums;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kiddo
 */
public enum Gender {
    Male(0),
    Female(1);
    
    private int genderId;
    
    private static Map<Integer, Gender> map = new HashMap<Integer, Gender>();
    
    static {
        for (Gender genderEnum : Gender.values()) {
            map.put(genderEnum.genderId, genderEnum);
        }
    }
    
    private Gender(final int gender) { genderId = gender; }

    public static Gender valueOf(int gender) {
        return map.get(gender);
    }
}