package com.hust.spring.beans.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

//        传统java方式：
//        HelloWorld hello = new HelloWorld();
//        hello.setName("mzyan");
//        hello.hello();

//        1.创建spring的 IOC 容器对象
//        ApplicationContext 代表 IOC 容器
//        ClassPathXmlApplicationContext：是 ApplicationContext 接口的实现类，该实现类从类路径下来加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        2.从 IOC 容器中获取 Bean 实例
//        利用id定位到IOC容器中的bean
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
//        利用类型返回IOC容器中的Bean，但要求IOC容器中只能有一个该类型的bean
        HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);
//        3.调用 hello 方法
        helloWorld.hello();

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        person = (Person) ctx.getBean("person2");
        System.out.println(person);

        person = (Person) ctx.getBean("person3");
        System.out.println(person);
    }
}
