package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notiServ;

    public UserService(NotificationService notiServ){
        System.out.println("ejecutando el constructor de user service");
        this.notiServ = notiServ;
    }
}
