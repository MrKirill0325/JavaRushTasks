package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(92,7,6);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код

        String result = "";
        int day = date.getDay();

        switch (day){
            case 0 :
                result = "воскресенье";
                break;
            case 1 :
                result = "понедельник";
                break;
            case 2 :
                result = "вторник";
                break;
            case 3 :
                result = "среда";
                break;
            case 4 :
                result = "четверг";
                break;
            case 5 :
                result = "пятница";
                break;
            case 6 :
                result = "суббота";
        }

        return result;
    }
}
