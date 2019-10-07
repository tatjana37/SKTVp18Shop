/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lenovo
 */
public class History implements Serializable{
    private Account account;
    private Product product;
    private Date takeOn;
   
   
    
    public History() {
}

    public History(Account account, Product product, Date takeOn) {
        this.account = account;
        this.product = product;
        this.takeOn = takeOn;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Date getTakeOn() {
        return takeOn;
    }
    public void setTakeOn(Date takeOn) {
        this.takeOn = takeOn;
    }

    @Override
    public String toString() {
        return "History{" + "account=" + account + ", product=" + product + ", takeOn=" + takeOn + '}';
    }

    public Object getReturnDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

