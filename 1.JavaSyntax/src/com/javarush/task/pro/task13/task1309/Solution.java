package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("B", 5.0);
        grades.put("E", 4.0);
        grades.put("A", 5.0);
        grades.put("C", 5.0);
        grades.put("Q", 2.0);
    }
}
