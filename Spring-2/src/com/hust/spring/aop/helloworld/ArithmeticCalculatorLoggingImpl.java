package com.hust.spring.aop.helloworld;

public class ArithmeticCalculatorLoggingImpl implements ArithmeticCalculator {

    @Override
    public int add(int i, int j) {
        System.out.println("The method add begins with [" + i + "," + j + "]");
        int result = i + j;
        System.out.println("The method end with " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("The method sub begins with [" + i + "," + j + "]");
        int result = i - j;
        System.out.println("The method sub with " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("The method mul begins with [" + i + "," + j + "]");
        int result = i * j;
        System.out.println("The method mul with " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("The method div begins with [" + i + "," + j + "]");
        int result = i / j;
        System.out.println("The method div with " + result);
        return result;
    }
}
