/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Account;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class AccountProvider {
    public Account createAccount(){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Имя покупателя: ");
        account.setName(scanner.nextLine());
        System.out.println("Фамилия покупателя:  ");
        account.setLastname(scanner.nextLine());
        System.out.println("Электронная почта ");
        account.setEmail((scanner.nextLine()));
        System.out.println("Сумма денег");
        account.setMoney(new Integer(scanner.nextLine()));
        return account;
    }
}