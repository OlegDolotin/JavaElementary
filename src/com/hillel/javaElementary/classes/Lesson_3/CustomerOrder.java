package com.hillel.javaElementary.classes.Lesson_3;

import java.math.BigDecimal;

public class CustomerOrder {
    private String[] name = new String[0];
    private BigDecimal[] productCost = new BigDecimal[0];
    private BigDecimal[] costWithDelivery = new BigDecimal[0];


    public void put(String name, BigDecimal productCost, BigDecimal costWithDelivery){
        boolean isFounded = false;
        if (this.name.length < 1){
            addOneElement(name, productCost, costWithDelivery);
        }else {
            for (int i = 0; i < this.name.length; i++){
                if (this.name[i].equals(name)){
                    this.productCost[i] = this.productCost[i].add(productCost);
                    this.costWithDelivery[i] = this.costWithDelivery[i].add(costWithDelivery);
                    isFounded = true;
                }
            }
            if (!isFounded){
                addOneElement(name, productCost, costWithDelivery);
            }
        }

    }

    private void addOneElement(String name, BigDecimal productCost, BigDecimal costWithDelivery){
        String[] tempName = new String[this.name.length+1];
        BigDecimal[] tempProductCost = new BigDecimal[this.name.length+1];
        BigDecimal[] tempCostWithDelivery = new BigDecimal[this.name.length+1];
        for (int i = 0; i < this.name.length; i++){
            tempName[i] = this.name[i];
            tempProductCost[i] = this.productCost[i];
            tempCostWithDelivery[i] = this.costWithDelivery[i];
        }
        tempName[this.name.length] = name;
        tempProductCost[this.productCost.length] = productCost;
        tempCostWithDelivery[this.costWithDelivery.length] = costWithDelivery;
        this.name = tempName;
        this.productCost = tempProductCost;
        this.costWithDelivery = tempCostWithDelivery;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < name.length; i++){
            output += "Name: "+name[i]+" Product cost: "+productCost[i]+" Total cost: "+costWithDelivery[i]+"\n";
        }
        return output;
    }
}
