package com.nt.management;

//Product.java
public class Product {
  private String productName;
  private double price;

 // Setters
  public void setProductName(String productName) {
     this.productName = productName;
  }
  public void setPrice(double price) {
     this.price = price;
  }

  // toString
  @Override
  public String toString() {
     return "Product [productName=" + productName + ", price=" + price + "]";
  }
}
