package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class flatOperetions implements Collection {
    private final ArrayList<flat> _flats;
    flatOperetions(){
        _flats = new ArrayList<flat>();
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
    public flat byIndex(int i){
        return _flats.get(i);
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

    @Override
    public int size() {
        return _flats.size();
    }

    @Override
    public boolean isEmpty() {
        return _flats.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return _flats.contains(o);
    }

    @Override
    public Iterator iterator() {
        return _flats.iterator();
    }

    @Override
    public Object[] toArray() {
        return _flats.toArray();
    }

    @Override
    public boolean add(Object o) {
        _flats.add((flat) o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        _flats.remove((flat) o);
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        _flats.addAll(c);
        return true;
    }

    @Override
    public void clear() {
        _flats.clear();
    }

    @Override
    public boolean equals(Object o) {
        _flats.equals(o);
        return true;
    }

    @Override
    public int hashCode() {
        return _flats.hashCode();
    }

    @Override
    public boolean retainAll(Collection c) {
        _flats.retainAll(c);
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        _flats.retainAll(c);
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        _flats.containsAll(c);
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return _flats.toArray(a);
    }
}