package com.hillel.javaElementary.classes.FirstLesson;

public class FirstLesson {

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
        int sum = 0;
        sum += number % 10;
        for (int i = 0; number > 0; i++){
            sum += number/10 % 10;
            number /=10;
        }
        return sum;
    }

    public static boolean divisibleByThree(String input){
        int sum = 0;

        for (int i = 0; i < input.length(); i++){
            sum += (int)input.charAt(i)-48;
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

        TimeLeft left = new TimeLeft(seconds);

        return left.toString();
    }




}
