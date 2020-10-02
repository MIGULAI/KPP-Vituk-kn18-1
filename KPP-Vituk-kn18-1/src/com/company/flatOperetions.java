package com.company;

import java.util.ArrayList;

public class flatOperetions {
    private static ArrayList<flat> _flats;


    flatOperetions(ArrayList<flat> flats){
        _flats = flats;
    }

    public ArrayList<flat> SortTrueStatusFlats(){
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0 ; i < _flats.size();i++){
            if(_flats.get(i).ReadStatus() == true) sorted.add(_flats.get(i));
        }
        return  sorted;
    }
    public ArrayList<flat> SortFalseStatusFlats(){
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0 ; i < _flats.size();i++){
            if(_flats.get(i).ReadStatus() == false) sorted.add(_flats.get(i));;
        }
        return  sorted;
    }

    public ArrayList<flat> SortNumberRoomsFlat(int number){
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0 ; i < _flats.size();i++){
            if(_flats.get(i).RoomsNumber() == number) sorted.add(_flats.get(i));
        }
        return  sorted;
    }
    public ArrayList<flat> SortOnePrice(int price){
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0 ; i < _flats.size();i++){
            if(_flats.get(i).ReadPrice() == price) sorted.add(_flats.get(i));
        }
        return  sorted;
    }
    public ArrayList<flat> SortBeetwenPrice(int minPrice , int maxPrice){
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0 ; i < _flats.size();i++){
            if(_flats.get(i).ReadPrice() >= minPrice &&_flats.get(i).ReadPrice() <= maxPrice) sorted.add(_flats.get(i));
        }
        return  sorted;
    }
}
