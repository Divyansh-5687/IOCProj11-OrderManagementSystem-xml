package com.nt.management;

//Order.java
public class Order {
  private String orderId;
  private int quantity;
  private Product product;
  private Customer customer;

  // Setters
  public void setOrderId(String orderId) {
     this.orderId = orderId;
  }
  public void setQuantity(int quantity) {
     this.quantity = quantity;
  }
  public void setProduct(Product product) {
     this.product = product;
  }
  public void setCustomer(Customer customer) {
     this.customer = customer;
  }

  @Override
  public String toString() {
     return "Order [orderId=" + orderId + ", quantity=" + quantity + ", product=" + product + ", customer=" + customer + "]";
  }
}
