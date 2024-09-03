package com.example.S14_L1.Entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    protected int calorie;
    protected double prezzo;

    public Item(int calorie, double prezzo){
        this.calorie=calorie;
        this.prezzo=prezzo;
    }
}
