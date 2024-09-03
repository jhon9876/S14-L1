package com.example.S14_L1.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Toppings extends Item {
    private String toppingName;

    public Toppings(int calorie,double prezzo, String toppingName){
        super(calorie,prezzo);
        this.toppingName=toppingName;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "toppingName='" + toppingName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
