package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        while (status){
            String adress = scanner.nextLine();
            status = false;
            if(Files.isDirectory(Path.of(adress))){
                System.out.println(adress+THIS_IS_DIR);
                status = true;
            }
            if (Files.isRegularFile(Path.of(adress))){
                System.out.println(adress+THIS_IS_FILE);
                status = true;
            }
        }
    }
}

