/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neil
 */
public class Champs {
    private String name;
    private int age;
    private String role;
    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRole(String role){
        this.role = role;
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getRole(){
        return this.role;
    }
}
