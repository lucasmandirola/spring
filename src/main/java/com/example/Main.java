package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo) context.getBean("saludo");
        String saludar = saludo.imprimirSaludo();
        System.out.println(saludar);
        UserService userServ = (UserService) context.getBean("userService");
        System.out.println(userServ.notiServ.imprimirSaludo());
    }
}
