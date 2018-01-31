/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neil
 */
public class LoL {
    public static void main(String[] args){
        Champs annie = new Champs();
        annie.setName("Annie");
        annie.setAge(12);
        annie.setRole("Caster Mage");
        
        System.out.println(annie.getName());
        System.out.println(annie.getAge());
        System.out.println(annie.getRole());
        
    }
    
}
