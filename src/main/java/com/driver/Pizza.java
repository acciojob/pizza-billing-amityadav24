package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean takeawayAdded;

    private int basePrice;
    private int cheesePrice = 80;
    private int toppingPrice;
    private int paperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if (isVeg) {
            basePrice = 300;
            toppingPrice = 70;
        } else {
            basePrice = 400;
            toppingPrice = 120;
        }
        this.price = basePrice;
        this.bill = "Base Price Of The Pizza: " + basePrice + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!cheeseAdded) {
            this.price += cheesePrice;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!toppingsAdded) {
            this.price += toppingPrice;
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if (!takeawayAdded) {
            this.price += paperBagPrice;
            takeawayAdded = true;
        }
    }

    public String getBill(){
        if (cheeseAdded) {
            bill += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if (toppingsAdded) {
            bill += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        if (takeawayAdded) {
            bill += "Paperbag Added: " + paperBagPrice + "\n";
        }
        bill += "Total Price: " + price + "\n";
        return bill;
    }
}
