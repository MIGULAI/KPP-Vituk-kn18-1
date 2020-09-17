package com.company;

import java.util.*;

class Work {
    int[] Array;
    Work(int[] array){
        Array = array;
    }
    void func1(){
        List<Integer> Array2 = new ArrayList<Integer>(Array.length);
        for (int i = 0 ; i < Array.length; i++) Array2.add(Array[i]);
        int[] Min = new int[3];
        int[] Max = new int[3];
        int min = 1;
        int max = 1;
        for(int i = 0 ; i < Min.length ; i++){
            Min[i] = Collections.min(Array2);
            Array2.remove(Collections.min(Array2));
        }
        for(int i = 0 ; i < Max.length ; i++){
            Max[i] = Collections.max(Array2);
            Array2.remove(Collections.max(Array2));
        }
        for(int value: Min) min *= value;
        for (int value: Max) max *= value;

        System.out.println(min +" "+ max);

    }

    void func2(){
        List<Integer> Array2 = new ArrayList<Integer>(Array.length/2);
        List<Integer> Array3 = new ArrayList<Integer>(Array.length/2);
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i < Array.length; i ++){
            if(i%2==0) {
                Array2.add(Array[i]);
            }else {
                Array3.add(Array[i]);
            }
        }
        for(int value: Array2) sum1 += value;
        for (int value: Array3) sum2 += value;
        System.out.println(sum1 +" "+ sum2);
    }

}
