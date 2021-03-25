package com.company.less1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!!!");

        int min = -10;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        System.out.println(i);

    }
}
