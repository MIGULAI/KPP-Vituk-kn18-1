package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i < array.length ; i++){
            array[i] = random.nextInt(50);
        }
        Work work = new Work(array);
        work.func1();
        work.func2();
    }
}
