package com.epam.homework2;

public class Main {

    public static void main(String[] args)
    {
        // Task 1
        int a = 10;
        int b = 56;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Task 1: replaced numbers a = " + a + "," + " b = " + b);

        //Task 2
        int number = 123;
        System.out.println("Task 2: the difference = " + (number - getReverseNum(number)));

        //Task 3
        double weightFunt = 10.5;
        double funtToGram = 453.6;
        double weight = weightFunt * funtToGram / 1000;
        int kilogram = (int)weight;
        int gram = (int)((weight - kilogram)*1000);
        System.out.println("Task 3: Kilogram " + kilogram + ", gramm " + gram);

        //Task 4
        double deposit = 10000;
        int months = (365 / 2);
        double percent = 12;
        int money = (int)((deposit * (percent / 100)) / 365 * months);
        System.out.println("Task 4: Profit = " + money);

    }

    public static int getFirstNum(int number)
    {
        return number % 10;
    }
    public static int getSecondNum(int number)
    {
        return (number / 10) % 10;
    }
    public static int getThirdNum(int number)
    {
        return (number / 10 - getSecondNum(number)) / 10;
    }
    public static int getReverseNum(int number)
    {
        return (getFirstNum(number)*100 + getSecondNum(number) * 10 + getThirdNum(number));
    }
}
