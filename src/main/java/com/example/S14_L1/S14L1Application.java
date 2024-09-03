package com.example.S14_L1;

import com.example.S14_L1.Entities.Drinks;
import com.example.S14_L1.Entities.Menu;
import com.example.S14_L1.Entities.Pizze;
import com.example.S14_L1.Entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class S14L1Application {

	public static void main(String[] args) {
		SpringApplication.run(S14L1Application.class, args);
AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(S14L1Application.class);

Menu m= (Menu) ctx.getBean("menu");
m.stampaMenu();


	}

}
