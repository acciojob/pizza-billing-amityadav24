package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private StringBuilder bill;

    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean takeawayAdded;
    private boolean billGenerated;

    private final int basePrice;
    private final int cheesePrice = 80;
    private final int toppingPrice;
    private final int paperBagPrice = 20;

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
        this.bill = new StringBuilder();
        this.billGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!cheeseAdded) {
            price += cheesePrice;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!toppingsAdded) {
            price += toppingPrice;
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if (!takeawayAdded) {
            price += paperBagPrice;
            takeawayAdded = true;
        }
    }

    public String getBill(){
        if (!billGenerated) {
            bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
            if (cheeseAdded) {
                bill.append("Extra Cheese Added: ").append(cheesePrice).append("\n");
            }
            if (toppingsAdded) {
                bill.append("Extra Toppings Added: ").append(toppingPrice).append("\n");
            }
            if (takeawayAdded) {
                bill.append("Paperbag Added: ").append(paperBagPrice).append("\n");
            }
            bill.append("Total Price: ").append(price).append("\n");
            billGenerated = true;
        }
        return bill.toString();
    }
}
