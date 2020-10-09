package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        flatOperetions ops = new flatOperetions();
        flat first = new flat("Nourvukaike",2 , 4300);
        first.SetStatus(true);
        ops.add(first);
        flat second = new flat("Tama");
        second.SetStatus(false);
        ops.add(second);
        flat third = new flat("Amarr");
        third.SetStatus(true);
        ops.add(third);

        ArrayList<flat> result = ops.SortTrueStatusFlats();
        result = ops.SortFalseStatusFlats();
        result = ops.SortNumberRoomsFlat(2);
        result = ops.SortOnePrice(4300);
        result = ops.SortBeetwenPrice(1000,5000);
        Object[] all = ops.toArray();
        System.out.println(((flat)all[0]).ReadAddress());

    }
}
