package com.example.SpringIntro;

import com.example.SpringIntro.Domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        Car car = context.getBean(Car.class);

        car.setModelo("ASX");
        car.setAno(2015);
        car.getMarca().setName("Mitsubishi");
        System.out.println(car);
    }
}
