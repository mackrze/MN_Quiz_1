package com.company;

import java.math.BigInteger;

public class Quiz_1 {
    public static void main(String[] args) {
        BigInteger bigInteger1= new BigInteger("35");
        BigInteger bigInteger2= new BigInteger("2058");
        System.out.println(bigInteger1.toString());
        System.out.println(bigInteger2.toString());
        System.out.println("bigInteger1 + bigInteger2 = "+bigInteger1.add(bigInteger2).toString());
        System.out.println("bigInteger1 - bigInteger2 = "+bigInteger1.subtract(bigInteger2).toString());
        System.out.println("bigInteger1 * bigInteger2 = "+bigInteger1.multiply(bigInteger2).toString());
        System.out.println("bigInteger1 / bigInteger2 = "+bigInteger1.divide(bigInteger2).toString());
        System.out.println(bigInteger2.ONE.toString());
        for (int i=0;i<31;i++) {
            System.out.println(factorial(i));
            System.out.println(factorialBig(i));
        }


    }
    public static float factorial(int n) {   //silnia N
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact *= i;
        }
        return fact;
    }

    public static BigInteger factorialBig(int n) {
        BigInteger fact= new BigInteger("1");
        for (int i = 1; i < n + 1; i++) {
            Integer integer=i;
            BigInteger multi =BigInteger.valueOf(i);

           fact= fact.multiply(multi) ;
        }
return fact;
    }

    }




