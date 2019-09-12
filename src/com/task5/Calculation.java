package com.task5;

import java.math.BigDecimal;

public class Calculation {
    int val1;
    int val2;

    Calculation(int x, int y) {
        val1 = x;
        val2 = y;
        System.out.println("Аргументы класса: " + val1 + " " + val2);
    }

    double calc(double q, double z) {
        return q * z;
    }

    int calc(int q, int z) {
        return q + z;
    }
    BigDecimal calc (BigDecimal q, BigDecimal z){
        return q=q.multiply(z);
    }
    public static void main(String[] args){
        Calculation c=new Calculation(45,83);
        System.out.println(c.calc(45.68,57.896));
        System.out.println(c.calc(45,55));
        System.out.println(c.calc(BigDecimal.valueOf(4562286.226), BigDecimal.valueOf(456262.626262)));

    }
}
