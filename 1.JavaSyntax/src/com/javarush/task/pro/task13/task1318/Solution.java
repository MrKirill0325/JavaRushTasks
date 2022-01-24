package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        Month[] temp = Month.values();
        Month nextMonth = month;
        int index = nextMonth.ordinal();

        if (index == temp.length-1){
            return nextMonth = Month.values()[0];
        }else {
            return nextMonth = Month.values()[index+1];
        }

    }
}
