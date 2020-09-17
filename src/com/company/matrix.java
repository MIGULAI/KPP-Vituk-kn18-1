package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;


class Matrix {
    int[][] Array = new int[10][10];
    Matrix(String fName){
        String Data = null;
        int status = 4;
        try {
            File myObj = new File(fName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                Data += myReader.nextLine();
            }
            myReader.close();
            char[] charArray = Data.toCharArray();
            for (int i= 0 ; i < 10 ; i++) {
                for (int j = 0; j < 10; j++) {
                    try {
                    if (charArray[status] == ' ') {
                        status += 1;
                    }
                    if (charArray[status] == '-') {
                        String num = "-";
                        status += 1;
                        for (int g = 0; g < 5; g++) {
                            if (charArray[status] >= 48 && charArray[status] <= 57) {
                                num += charArray[status];
                                status += 1;
                                continue;
                            }
                        }
                        Array[i][j] = Integer.parseInt(num);
                    } else {
                        String num = "";

                            for (int g = 0; g < 5; g++) {
                                if (charArray[status] >= 48 && charArray[status] <= 57) {
                                    num += charArray[status];
                                    status += 1;
                                    continue;
                                }
                            }

                        Array[i][j] = Integer.parseInt(num);
                    } }
                    catch (ArrayIndexOutOfBoundsException e){
                        e.printStackTrace();
                    }

                }
            }
    } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        System.out.println(Array);

    }

    void func2(){
        int plusSum = 0;
        int minusSum = 0;
        int plusCounter = 0;
        int minusCounter = 0;
        int a = Array.length;
        int[][] A = new int[Array.length][Array.length];
        for(int i = 0; i < Array.length; i++){
            for (int j = 0 ; j < Array.length; j++){
                if(Array[i][j] >= 0){
                    plusSum += Array[i][j];
                    plusCounter += 1;
                }
                if(Array[i][j] < 0){
                    minusSum += Array[i][j];
                    minusCounter += 1;
                }
            }
        }
        for(int i = 0; i < Array.length; i++){
            for (int j = 0 ; j < Array.length; j++){
                if(Array[i][j] == -5){
                    A[i][j] = 5;
                } else {
                    A[i][j] = Array[i][j];
                }
            }
        }
        System.out.println(plusSum + "\t" + (plusSum/plusCounter) + "\n" + minusSum + "\t" + (minusSum/minusCounter));
    }

}
