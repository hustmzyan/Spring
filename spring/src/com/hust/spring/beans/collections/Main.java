package com.hust.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person4 = (Person) ctx.getBean("person4");
        System.out.println(person4);

        NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
        System.out.println(newPerson);

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());

        Person person5 = (Person) ctx.getBean("person5");
        System.out.println(person5);

        Person person6 = (Person) ctx.getBean("person6");
        System.out.println(person6);
    }
}
