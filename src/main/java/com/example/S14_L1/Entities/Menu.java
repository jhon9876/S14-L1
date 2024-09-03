package com.example.S14_L1.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Menu {
private List <Toppings> toppingList;
private List <Drinks> drinkList;
private List <Pizze> pizzaList;

public Menu( List <Toppings> toppingList, List <Drinks> drinkList, List <Pizze> pizzaList){
    this.toppingList=toppingList;
    this.drinkList=drinkList;
    this.pizzaList=pizzaList;
}

public void stampaMenu(){
    System.out.println("MENU");
    System.out.println("PIZZE");
    pizzaList.forEach(System.out::println);
    System.out.println();
    System.out.println("TOPPING");
    toppingList.forEach(System.out::println);
    System.out.println();
    System.out.println("DRINK");
    drinkList.forEach(System.out::println);
    System.out.println();
}
}
