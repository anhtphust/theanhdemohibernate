package com.example.demohibernate.controller;

import com.example.demohibernate.model.User;
import com.example.demohibernate.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
   Session session = HibernateUtil.getSessionFactory().openSession();
   @GetMapping("/apigetall")
    List<User> getallUser (){
       session.beginTransaction();
       List users = session.createQuery("FROM User",User.class).list();
       session.close();
       return users;
   }
}
