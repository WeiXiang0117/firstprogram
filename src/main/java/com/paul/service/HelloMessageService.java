package com.paul.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service

public class HelloMessageService {

   @Value("${name:unkonwn}")
    private String name;

   public String getMessage(){
       return getMessage(name);
   }

   public String getMessage(String name){
       return "Hello" + name;
   }
}
