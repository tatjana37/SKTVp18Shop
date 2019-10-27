/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Account;
import entity.History;
import entity.Product;
import java.util.List;

/**
 *
 * @author lenovo
 */
public interface Saveble {
public void saveProducts(List<Product> listProducts);
public List<Product> loadProducts();
public void saveAccounts(List<Account> listAccounts);
public List<Account> loadAccounts();
public void saveHistorys(List<History> listHistorys);
public List<History> loadHistorys();
} 

