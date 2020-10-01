package com.company;

import java.util.ArrayList;

public class flatOperetions {
    private static ArrayList<flat> _flats;


    flatOperetions(ArrayList<flat> flats){
        _flats = flats;
    }

    public ArrayList<ArrayList<flat>> SortStatusFlats(){
        ArrayList<ArrayList<flat>> sorted = new ArrayList<>(2);
        for (int i = 0 ; i <= _flats.size();i++){
                if(_flats.get(i).ReadStatus() == true) sorted.get(0).add(_flats.get(i));
                else sorted.get(1).add(_flats.get(i));
        }
        return  sorted;
    }
}
