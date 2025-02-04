/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lenovo
 */
@Entity
public class Product  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String produktTitle;
    private String categoria;
    private int quantity;
    private int count;
    private int size;
    private int price;
    
    
   
    
    public Product(){
    }

    public Product(Long id, String produktTitle, String categoria, int quantity, int count, int size, int price) {
        this.id = id;
        this.produktTitle = produktTitle;
        this.categoria = categoria;
        this.quantity = quantity;
        this.count = quantity;
        this.size = size;
        this.price = price;
    }

    public String getProduktTitle() {
        return produktTitle;
    }
    public void setProduktTitle(String produktTitle) {
        this.produktTitle = produktTitle;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Product{" + "produkt_title=" + produktTitle + ", categoria=" + categoria + ", quantity=" + quantity + ", count=" + count + ", size=" + size + ", price=" + price + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
   
    
    
    }
