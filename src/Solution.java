package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;

        while (!isExit) {
            if (console.hasNextInt()) {
                int num = console.nextInt();
                sum += num;
            } else if (console.hasNextLine()) {
                String s = console.nextLine();
                isExit = s.equals("ENTER");
            }
        }
        System.out.println(sum);
    }
}
