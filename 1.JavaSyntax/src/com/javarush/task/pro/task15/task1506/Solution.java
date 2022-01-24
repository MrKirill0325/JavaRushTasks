package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        StringBuilder stringBuilder = new StringBuilder();
        String a = "";

        try(Scanner scanner = new Scanner(System.in)) {
            List <String> list = Files.readAllLines(Paths.get(scanner.nextLine()));

            for (String strings : list){
                a = stringBuilder.append(strings).toString();
            }

            String[] strings = a.split("");

            for (String temp : strings){
                if (!temp.equals(" ") && !temp.equals(",") && !temp.equals(".")){
                    System.out.print(temp);
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

