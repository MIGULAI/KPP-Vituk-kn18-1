package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<flat> flats = new ArrayList<flat>();
        flat first = new flat("Nourvukaike",2 , 4300);
        first.SetStatus(true);
        flats.add(first);
        flat second = new flat("Tama");
        second.SetStatus(false);
        flats.add(second);
        flat third = new flat("Amarr");
        third.SetStatus(true);
        flats.add(third);
        flatOperetions ops = new flatOperetions();

        
        ArrayList<flat> result = ops.SortTrueStatusFlats();
        result = ops.SortFalseStatusFlats();
        result = ops.SortNumberRoomsFlat(2);
        result = ops.SortOnePrice(4300);
        result = ops.SortBeetwenPrice(1000,5000);
        System.out.println("fdsdffd");
    }
}
