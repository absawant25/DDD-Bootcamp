package com.ddd.bootcamp.application;

import com.ddd.bootcamp.domain.Cart;
import com.ddd.bootcamp.domain.Product;
import java.util.List;

public class Problem1 {

  /***
   * Add a “Apple Pencil” to a Cart
   * @param args
   */

  public static void main(String[] args) {
    Cart cart = new Cart();
    Product product = new Product("Apple Pencil");
    cart.add(product);

    System.out.println("Cart = " + cart);
    List<Product> products = cart.getProducts();

    System.out.println("----------------------------------------");
    System.out.println("products = " + products);
    System.out.println("----------------------------------------");
  }

}
