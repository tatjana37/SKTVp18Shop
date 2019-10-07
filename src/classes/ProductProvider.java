/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ProductProvider {
    public Product createProduct(){
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Название товара: ");
        product.setProduktTitle(scanner.nextLine());
        System.out.println("Категория: ");
        product.setCategoria(scanner.nextLine());
        System.out.println("размер: ");
        product.setSize(new Integer(scanner.nextLine()));
        System.out.println("Цена товара: ");
        product.setPrice(new Integer(scanner.nextLine()));
        System.out.println("Колличество ");
        product.setQuantity(Integer.parseInt(scanner.nextLine()));
        return product;
}
}
