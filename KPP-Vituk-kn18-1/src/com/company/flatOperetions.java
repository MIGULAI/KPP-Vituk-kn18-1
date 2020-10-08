package com.company;

import java.io.*;
import java.util.ArrayList;

public class flatOperetions {
    private static ArrayList<flat> _flats;


    flatOperetions(ArrayList<flat> flats) {
        _flats = flats;
    }

    public ArrayList<flat> SortTrueStatusFlats() {
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0; i < _flats.size(); i++) {
            if (_flats.get(i).ReadStatus() == true) sorted.add(_flats.get(i));
        }
        return sorted;
    }

    public ArrayList<flat> SortFalseStatusFlats() {
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0; i < _flats.size(); i++) {
            if (_flats.get(i).ReadStatus() == false) sorted.add(_flats.get(i));
            ;
        }
        return sorted;
    }

    public ArrayList<flat> SortNumberRoomsFlat(int number) {
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0; i < _flats.size(); i++) {
            if (_flats.get(i).RoomsNumber() == number) sorted.add(_flats.get(i));
        }
        return sorted;
    }

    public ArrayList<flat> SortOnePrice(int price) {
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0; i < _flats.size(); i++) {
            if (_flats.get(i).ReadPrice() == price) sorted.add(_flats.get(i));
        }
        return sorted;
    }

    public ArrayList<flat> SortBeetwenPrice(int minPrice, int maxPrice) {
        ArrayList<flat> sorted = new ArrayList<flat>();
        for (int i = 0; i < _flats.size(); i++) {
            if (_flats.get(i).ReadPrice() >= minPrice && _flats.get(i).ReadPrice() <= maxPrice)
                sorted.add(_flats.get(i));
        }
        return sorted;
    }

    public void saveToFile(String fileName) {
        File file = new File(fileName);

        try {
            FileOutputStream fs = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            for (flat _flat : _flats) {
                os.writeObject(_flat);
            }
            os.close();
        } catch (FileNotFoundException e) {
            try {
                file.createNewFile();
                saveToFile(fileName);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String fileName) {
        File file = new File(fileName);

        ObjectInputStream is = null;
        ArrayList<flat> flatsFromFile = new ArrayList<flat>();
        flat newFlat = null;

        try {
            FileInputStream fi = new FileInputStream(file);
            is = new ObjectInputStream(fi);
            if (is != null) {
                while (true) {
                    newFlat = (flat) is.readObject();
                    if (newFlat != null)
                        flatsFromFile.add(newFlat);
                }
            }
            is.close();
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
