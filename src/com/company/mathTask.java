package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MathTask {
    int[][] Array = new int[3][3];


    MathTask(String fName) {

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
            for (int i = 0; i < Array.length; i++) {
                for (int j = 0; j < Array.length; j++) {
                    try {
                        if (charArray[status] == ' ' ) {
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
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
    void func1( int[] element){
        int minElem = 0;
        List<Integer> Array2 = new ArrayList<Integer>(element.length);
        for (int i = 0 ; i < element.length; i++) Array2.add(element[i]);
        minElem = Collections.min(Array2);
        int[][] B = new int[Array.length][Array.length];
        int[] midl = new  int[B.length];
        for (int i = 0 ; i < Array.length ; i++){
            for (int j = 0 ; j < Array.length ; j++){
                B[i][j] = Array[i][j] * minElem;
                midl[i] = Array[i][j];
            }
        }
        for(int i = 0 ; i < B.length ; i++){
            for (int j = 0 ; j < B.length ; j++ ){
                if(B[i][j] >= midl[i]) midl[i] = B[i][j];
            }
        }
        for(int i = 0 ; i < midl.length ; i++){
            B[i][i] = midl[i];
        }
        System.out.println("Hi");
    }
}

