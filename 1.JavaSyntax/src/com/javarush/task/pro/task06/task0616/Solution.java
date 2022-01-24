package com.javarush.task.pro.task06.task0616;

/* 
Учет работников
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;
//Ставим перед переменной класса position --> this, т.к. переменная и метод не статические
    public void setPosition(String position) {
        this.position = position;
    }
//Ставим перед переменной класса salary --> this, т.к. переменная и метод не статические
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
