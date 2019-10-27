/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Account;
import entity.History;
import entity.Product;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class HistoryProvider {
       
Scanner scanner = new Scanner(System.in);
    public History createHistory(List<Product>listProducts,List<Account>listAccounts){
        History history = new History();
       System.out.println("Список покупок: ");
        int countCurrentProducts = 0;
        for(int i = 0; i < listProducts.size();i++){
            if (listProducts.get(i).getCount() > 0){
                System.out.printf("%d. Название товара: %s, категория: %s, размер: %s, Цкна товара: %s,колличество: %s%n"
                    ,i + 1
                        ,listProducts.get(i).getProduktTitle()
                        ,listProducts.get(i).getCategoria()
                        ,listProducts.get(i).getSize()
                        ,listProducts.get(i).getPrice()
                        ,listProducts.get(i).getCount()
                        );
                countCurrentProducts++;
            }
        }
        if(countCurrentProducts == 0){
            System.out.println("Товар продан, нет в наличии");
            return null;
        }
        System.out.print(" номер выбранного товара");
        int takeProductNum = scanner.nextInt();
        Product product = listProducts.get(takeProductNum-1);
        if(product.getCount()>0){
            product.setCount(product.getCount()-1);
            System.out.println("список покупателей");
            int i=0;
            
            for(Account a : listAccounts){
                System.out.printf("%d. Имя и фамилия покупателя: %s %s, email: %s, количество денег: %s%n"
                        ,i+1
                        ,a.getName()
                        ,a.getLastname()
                        ,a.getEmail()
                        ,a.getMoney()
                );
                i++;
            }
            System.out.print("Выберите номер покупателя");
            int accountNum = scanner.nextInt();
            Account account = listAccounts.get(accountNum-1);
            
            history.setProduct(product);
            history.setAccount(account);
            history.setTakeOn(new Date());
            return history;
        }else{
            System.out.println("Товар \""
                    +product.getProduktTitle()
                    +"\" продан."
            );
            return null;
        
           } 
        
        }
    }
        
        

    
 



