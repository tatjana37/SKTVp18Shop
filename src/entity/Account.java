/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class Account implements Serializable {
    private String name;
    private String lastname;
    private String email;
    private int money;
    
    public Account(){
    }
    public Account(String name, String lastname, String email, int money) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.money = money;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", lastname=" + lastname + ", email=" + email + ", money=" + money + '}';
    }
    
    
    
    
    
}

