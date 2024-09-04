package com.example.S14_L1.Entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationFile {
@Bean(name = "bacon")
    public Toppings toppingBacon(){
    Toppings t= new Toppings(500,2.5,"Bacon");

    return t;
}
@Bean(name = "mozzarella")
    public Toppings toppingMozzarella(){
    Toppings t= new Toppings(300,4,"Mozzarella");

    return t;
}
@Bean(name = "funghi")
    public Toppings toppingFunghi(){
    Toppings t= new Toppings(500,2.5,"Bacon");

    return t;
}

@Bean(name="pizzaDoppiaMozzarella")
    public Pizze pizzaDoppiaMozzarella(){
        List <Toppings> t= new ArrayList<>();
        t.add(toppingMozzarella());
        Pizze p= new Pizze("PizzaDoppiaMozzarella",t);
        return p;
}
    @Bean(name="pizzaCarbonara")
    public Pizze pizzaCarbonara(){
        List <Toppings> t= new ArrayList<>();
        t.add(toppingBacon());
        t.add(toppingFunghi());
        t.add(toppingMozzarella());
        Pizze p= new Pizze("PizzaCarbonara",t);
        return p;
    }

@Bean(name = "mojito")
    public Drinks mojito(){
        Drinks d= new Drinks(200,50,"mojito");
        return d;
}
@Bean(name = "coca")
    public Drinks coca(){
        Drinks d= new Drinks(200,20,"coca");
        return d;
}

@Bean(name="primo_menu")
    public Menu menu(){
    List<Toppings> t=new ArrayList<>();
    t.add(toppingMozzarella());
    t.add(toppingFunghi());
    t.add(toppingBacon());

    List<Pizze> p=new ArrayList<>();
    p.add(pizzaCarbonara());
    p.add(pizzaDoppiaMozzarella());

    List <Drinks> d = new ArrayList<>();
    d.add(mojito());
    d.add(coca());

    Menu m=new Menu(t,d,p);

    return m;
}
}
