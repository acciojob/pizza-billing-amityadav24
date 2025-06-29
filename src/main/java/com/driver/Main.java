package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    // System.out.println(dp.getPrice()); // ← Remove this if you only want the bill
    dp.addTakeaway();
    dp.addExtraCheese(); // won't add again
    dp.addTakeaway();    // won't add again
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}
