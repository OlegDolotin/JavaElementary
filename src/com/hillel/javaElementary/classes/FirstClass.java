package com.hillel.javaElementary.classes;

public class FirstClass {

    public static int max(int a, int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }

    public static int century(int year){
        if (year % 100 > 0){
            return year/100+1;
        }else {
            return year/100;
        }
    }


    public static boolean isLeap(int year){
        if(year % 4 !=0){
            return false;
        }else if (year % 100 !=0 || year % 400 ==0){
            return true;
        }else {
            return false;
        }
    }

    public static int[] fillArr(){
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = i+2;
        }
        return arr;
    }

    public static void print(double[] arr){
        System.out.print("(");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%.2f",arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }

    public static int sumNumbers(int number){
        String num = number+"";   //еще можно использовать десятичный логорифм если не ошибаюсь, чтобы найти количество цифр в числе
        int sum = 0;
        int d = 10;
        sum += number % 10;
        for (int i = 0; i < num.length(); i++){
            sum += number/d % 10;
            d*=10;
        }
        return sum;
    }

    public static boolean divisibleByThree(String input){
        int sum = 1;

        try {
             sum = sumNumbers(Integer.parseInt(input));
        }catch (NumberFormatException exception){
            exception.printStackTrace();
        }

        if(sum % 3 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static String formatDuration(int seconds){
        if (seconds < 0){
            return "Error, negative time does not exist!";
        }
        if (seconds < 60 && seconds > 0){
            return seconds+" seconds";
        }
        if (seconds == 0){
            return "now";
        }


        int temp;
        int sec = seconds - ((seconds/60)*60);
        temp = seconds/60;

        int minutes  = temp - ((temp/60)*60);
        temp /= 60;

        int hours = temp - ((temp/24)*24);
        if (hours <= 0){
            return minutes+" minutes and "+sec+" seconds";
        }
        temp /= 24;


        int days = temp - ((temp/365)*365);
        if (days <= 0){
            return hours+" hours, "+minutes+" minutes and "+sec+" seconds";
        }
        int years = temp/365;


        if (years <=0){
            return days+" days, "+hours+" hours, "+minutes+" minutes and "+sec+" seconds";
        }else {
            return years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes and "+sec+" seconds";
        }
    }
}
