package com.company;

import java.util.ArrayList;

public class Main {

    /*Завдання до лабораторної роботи 4
    Завдання 1.
    Необхідно вдосконалити об’єктну модель створену в реалізації завдання лабораторній роботі 3, додавши до неї наступну функціональність: методи для запису об’єктів з масиву з даними у файл і навпаки. Ці методи доцільно представити як методи інтерфейсу:
    public void saveToFile(String fileName);
    public void loadFromFile(String fileName);

    Завдання 2.
    Вдосконалити об’єктну модель завдання 1 лабораторної роботи 4, додавши до неї наступну функціональність:
    a) Реалізувати в класі з даними метод compareTo() для порівняння двох примірників класу, за допомогою якого виконати сортування масиву об’єктів в головному класі. Правила порівняння двох об’єктів розробити самостійно, відповідно до предметної області.
    b) Замінити масив об’єктів, що використовується для тимчасового зберігання даних на динамічний клас. Протестувати роботу програми прочитавши дані з файлу, додати 2-3 нових об’єкти (або довільну кількість за бажанням користувача), виконати декілька запитів для аналізу вмісту об’єктів і зберегти(оновити) інформацію у файл.
    */
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
        flatOperetions ops = new flatOperetions(flats);
        ArrayList<flat> result = ops.SortTrueStatusFlats();
        result = ops.SortFalseStatusFlats();
        result = ops.SortNumberRoomsFlat(2);
        result = ops.SortOnePrice(4300);
        result = ops.SortBeetwenPrice(1000,5000);
        ops.saveToFile("haha.txt");
        ops.loadFromFile("haha.txt");
        System.out.println("fdsdffd");
    }
}
