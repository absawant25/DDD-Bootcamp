package com.ddd.bootcamp.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
  private List<Product> products = new ArrayList<>();

  private int quantity = 0;

  private HashMap<Product, Long> productQuantity = new HashMap<Product, Long>();

  private ArrayList<Product> removedProductList = new ArrayList<>();

  public void add(Product product) {
    productQuantity.put(product, 1L);
  }

  public void add(Product product, int quantity) {
    productQuantity.put(product, Long.valueOf(quantity));
  }

  public Map<Product, Long> getProducts() {
    return productQuantity;
  }

  public void removeProduct(Product product) {

    for (Map.Entry<Product, Long> entry : productQuantity.entrySet()) {
      if(entry.getKey().getName() == product.getName()) {
        removedProductList.add(product);
        productQuantity.remove(product);
      }
    }
  }

  public List<Product> getRemovedProductList() {
    return removedProductList;
  }



  @Override
  public String toString() {
    String cartProducts = null;
    for (Map.Entry<Product, Long> entry : productQuantity.entrySet()) {

      cartProducts += "Cart{" + "products=" + entry.getKey() + "quantity=" + entry.getValue() + '}';
    }

    return cartProducts;
  }
}
