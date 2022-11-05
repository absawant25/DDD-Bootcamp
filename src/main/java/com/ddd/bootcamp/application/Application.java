package com.ddd.bootcamp.application;

import com.ddd.bootcamp.domain.Cart;
import com.ddd.bootcamp.domain.Product;
import java.util.List;
import java.util.Map;

public class Application {

  /***
   *Problem 1 Add a “Apple Pencil” to a Cart
   * Problem 2 Add Wireless Sony Headphone
   * Problem 3 Add 2 quanitity of apple pencil
   * Problem 4 remove item
   * Problem 5 List of removed items.
   * @param args
   */

  public static void main(String[] args) {
    Cart cart = new Cart();
    Product product = new Product("Apple Pencil");
    cart.add(product, 2);

    Product sony = new Product("Sony wireless headphone");

    cart.add(sony, 3);

    System.out.println("Cart");
    Map<Product, Long> products = cart.getProducts();
    System.out.println("----------------------------------------");
    System.out.println("products = " + products);
    System.out.println("----------------------------------------");

    cart.removeProduct(product);
    System.out.println("Removed product from Cart");
    List<Product> removedProducts = cart.getRemovedProductList();
    System.out.println("products = " + removedProducts);


    System.out.println("Remaing Cart");
    Map<Product, Long> remaingProducts = cart.getProducts();
    System.out.println("----------------------------------------");
    System.out.println("products = " + remaingProducts);
    System.out.println("----------------------------------------");

  }

}
