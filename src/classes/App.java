/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Account;
import entity.History;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class App {

    List<Product> listProducts = new ArrayList<>();
    List<Account> listAccounts = new ArrayList<>();
    List<History> listHistorys = new ArrayList<>();
    public App(){
        SaveToFile saveToFile = new SaveToFile();
        listProducts = saveToFile.loadProducts();
        listAccounts = saveToFile.loadAccounts();
        listHistorys = saveToFile.loadHistorys();
    }
    
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
       
        HistoryProvider historyProvider = new HistoryProvider();
        SaveToFile saveToFile = new SaveToFile();
        boolean flagExit = true;
        do{
            System.out.println("Список задач:");
            System.out.println("0. Закрыть программу");
            System.out.println("1. Новый товар");
            System.out.println("2. Новый покупатель");
            System.out.println("3. Список товаров");
            System.out.println("4. Список покупателей");
            System.out.println("5. Оформить покупку");
            System.out.println(" Введите номер задачи:");
            
            String numberTask = scanner.nextLine();
            if(null != numberTask)
                switch (numberTask) {
            case "0":
                        flagExit = false;
                        System.out.println("Заканчиваем работу программы");
                        break;
            case "1":
                        System.out.println("Новый товар.");
                        ProductProvider productProvider = new ProductProvider();
                        Product product = productProvider.createProduct();
                        listProducts.add(product); 
                        saveToFile.saveProducts(listProducts);
                        for(Product p : listProducts) {
                            System.out.println(p.toString()); 
                        }
                        break;
            case "2":
                        System.out.println("Новый покупатель");
                        AccountProvider accountProvider = new AccountProvider();
                        Account account = accountProvider.createAccount();
                        listAccounts.add(account); 
                        saveToFile.saveAccounts(listAccounts);
                        for(Account a : listAccounts) {
                            System.out.println(a.toString()); 
                        }
                        break;
            case "3":
                        System.out.println("Список товаров в магазине");
                        int i = 1;
                for(Product p : listProducts){
                        System.out.println(i+" . "+p.toString());
                        i++;
                       }
                        break;
            case "4":
                       System.out.println("Список покупателей");
                for(int j=0;j<listAccounts.size();j++){
                       System.out.println(j+1+". "+listAccounts.get(j).toString());
                       }  
                       break;
            case "5": 
                       System.out.println(" Оформить покупку");
                       History history = historyProvider.createHistory(listProducts,listAccounts);
                if(history !=null){
                       listHistorys.add(history);
                       saveToFile.saveHistorys(listHistorys);
                }else{
                }
                break;  
            }
        } while(flagExit);
    }
}


    

