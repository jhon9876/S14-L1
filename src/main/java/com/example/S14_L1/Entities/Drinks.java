package com.example.S14_L1.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Drinks extends Item {
    private String drinkName;
    public Drinks(int calorie,double prezzo, String drinkName){
        super(calorie,prezzo);
        this.drinkName=drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
