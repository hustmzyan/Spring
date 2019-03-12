package com.hust.spring.beans.relation;

import com.hust.spring.beans.autowire.Address;
import com.hust.spring.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] agrs){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");

//        Address address = (Address) ctx.getBean("address");
//        System.out.println(address);

        Address address = (Address) ctx.getBean("address2");
        System.out.println(address);

        address = (Address) ctx.getBean("address3");
        System.out.println(address);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

    }
}
