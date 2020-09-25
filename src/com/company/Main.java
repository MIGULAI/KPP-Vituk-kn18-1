package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        boolean status = myGUID("c35f06d9-2d88-44da-84c8-02af38fe93c9");
        System.out.println("Status code is :\t" +status);

        func("24 41 -50 89 46 12 -56 -21 68 -99 54");
    }

    public static boolean myGUID(String code){
        Pattern p =  Pattern.compile("^\\{?\\p{XDigit}{8}-(?:\\p{XDigit}{4}-){3}\\p{XDigit}{12}}?$");
        Matcher m = p.matcher(code);
        if(m.matches()){
            return true;
        }else{
            return false;
        }
    }

    public static void func(String numbers){
        String[] _split = numbers.split(" ");
        int[] _array = new int[_split.length];
        int pair = 0;
        int nPair = 0;
        for(int i = 0; i< _array.length; i++){
                _array[i] = Integer.parseInt(_split[i]);
                if(_array[i]%2 == 0){
                    pair+=1;
                }else{
                    nPair+=1;
                }
        }
        System.out.println(pair + "   " + nPair);
    }
}
