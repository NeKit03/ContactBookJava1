package org.example.ContactBook;


import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Print {
    static Scanner in = new Scanner(System.in);
    public static void printMenu(){
        System.out.println("Выберите пункт меню:");
        System.out.println("1) Вывести все контакты");
        System.out.println("2) Добавить контакт");
        System.out.println("3) Удалить контакт");
        System.out.println("4) Найти контакт");
        System.out.println("0) Завершить работу");
    }
    public static String nextContactName(){
        System.out.println("Введите имя контакта:");
        return (in.next().toLowerCase());

    }
    public static String nextContactNumber(){
        System.out.println("Введите номер контакта:");
        return  in.next().toLowerCase();
    }
    public static void printContact(Contact contact){
        for (String number : contact.getPhoneNumber()) {
            System.out.println(number);
        }
    }
    public static void endContactBook(){
            System.out.println("Программа завершилась!");
            System.out.println("Досвидания!");

    }
    public static void errorKey(Integer key){
        switch (key){
            case 1:
                System.out.println("Введите корректный пункт меню!");
                break;
            case 2:
                System.out.println("Данного контакта не существует!!!");
                break;
            default:
                System.out.println("Неизвестная ошибка. Что то пошло не так!!!");
                break;
        }

    }

}
