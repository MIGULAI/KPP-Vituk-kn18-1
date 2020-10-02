package com.company;

import java.util.ArrayList;

public class flat {
    /*Предметна область: оренда житла, клас: помешкання, орієнтовний перелік полів:
    адреса, кількість кімнат, вартість оренди, помешкання орендовано (так/ні), дата оренди,
    термін оренди. Вивести окремо список вільних та окремо список орендованих
    помешкань. Реалізувати пошук вільних помешкань з вказаною кількістю кімнат та
    допустимою вартістю оренди.*/

    private static String _address;
    private static int _rooms;
    private int _price;
    private boolean _status;
    private String _dateRented;
    private String _timeRented;
    private ArrayList<String> comments = new ArrayList<String>();

    flat(String address){
        _address = address;
        _status = false;
    }
    flat(String address, int rooms){
        _address = address;
        _rooms = rooms;
        _status = false;
    }
    flat(String address, int rooms, int prise){
        _price = prise;
        _address = address;
        _rooms = rooms;
        _status = false;
    }

    public static void SetRooms(int rooms){
        _rooms = rooms;
    }
    public void SetPrice(int price){
        _price = price;
    }
    public void SetStatus(boolean status){
        _status = status;
    }
    public void SetDateRented(String date){
        _dateRented = date;
    }
    public void SetTimeRented(String time){
        _timeRented = time;
    }
    public void AddComment(String comment){
        comments.add(comment);
    }


    public String ReadAddress(){
        return _address;
    }
    public int RoomsNumber(){
        return _rooms;
    }
    public double ReadPrice(){
        return _price;
    }
    public boolean ReadStatus(){
        return _status;
    }
    public String ReaderDateRentead(){
        return _dateRented;
    }
    public String ReadTimeRented(){
        return _timeRented;
    }
    public ArrayList<String> ReadComments(){
        return comments;
    }
}
