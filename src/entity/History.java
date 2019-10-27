/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lenovo
 */
public class History implements Serializable{
    private Long id;
    private Account account;
    private Product product;
    private Date takeOn;
    private Date ReturnDate;
    private int quantity;
    private int count;

    public History() {
    }

    public History(Long id, Account account, Product product, Date takeOn, Date ReturnDate, int quantity, int count) {
        this.id = id;
        this.account = account;
        this.product = product;
        this.takeOn = takeOn;
        this.ReturnDate = ReturnDate;
        this.quantity = quantity;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(Date ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.account);
        hash = 53 * hash + Objects.hashCode(this.product);
        hash = 53 * hash + Objects.hashCode(this.takeOn);
        hash = 53 * hash + Objects.hashCode(this.ReturnDate);
        hash = 53 * hash + this.quantity;
        hash = 53 * hash + this.count;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.count != other.count) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.account, other.account)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.takeOn, other.takeOn)) {
            return false;
        }
        if (!Objects.equals(this.ReturnDate, other.ReturnDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "History{" + "id=" + id + ", account=" + account + ", product=" + product + ", takeOn=" + takeOn + ", ReturnDate=" + ReturnDate + ", quantity=" + quantity + ", count=" + count + '}';
    }

}
   
        
    



   
   

   
