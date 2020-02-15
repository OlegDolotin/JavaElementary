package com.hillel.javaElementary;

import com.hillel.javaElementary.classes.FirstClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 ///////////////////////////////////////////");
        System.out.println();
        System.out.println(FirstClass.max(1,2));
        System.out.println(FirstClass.max(2,1));
        System.out.println(FirstClass.max(-1,-4));
        System.out.println(FirstClass.max(5,5));
        System.out.println();
        System.out.println("Task 2 ///////////////////////////////////////////");
        System.out.println();
        System.out.println(FirstClass.century(2019));
        System.out.println(FirstClass.century(2000));
        System.out.println(FirstClass.century(201));
        System.out.println(FirstClass.century(199));
        System.out.println(FirstClass.century(99));
        System.out.println();
        System.out.println("Task 3 ///////////////////////////////////////////");
        System.out.println();
        System.out.println(FirstClass.isLeap(1600));
        System.out.println(FirstClass.isLeap(1604));
        System.out.println(FirstClass.isLeap(1964));
        System.out.println(FirstClass.isLeap(1700));
        System.out.println(FirstClass.isLeap(1965));
        System.out.println();
        System.out.println("Task 4 ///////////////////////////////////////////");
        System.out.println();
        int arr[] = FirstClass.fillArr();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Task 5 ///////////////////////////////////////////");
        System.out.println();
        double[] dArr = new double[]{3.1423424, 2.72234124, 6.7223423, -2.343421241, 1.20433424, 1235.004353342};
        FirstClass.print(dArr);
        System.out.println();
        dArr = new double[]{};
        FirstClass.print(dArr);
        System.out.println();
        System.out.println();
        System.out.println("Task 6 ///////////////////////////////////////////");
        System.out.println();
        System.out.println(FirstClass.sumNumbers(123));
        System.out.println(FirstClass.sumNumbers(231410023));
        System.out.println();
        System.out.println("Task 7 ///////////////////////////////////////////");
        System.out.println();
        System.out.println(FirstClass.divisibleByThree("123"));
        System.out.println(FirstClass.divisibleByThree("8409"));
        System.out.println(FirstClass.divisibleByThree("100853"));
        System.out.println(FirstClass.divisibleByThree("33333333"));
        System.out.println(FirstClass.divisibleByThree("7"));
        System.out.println(FirstClass.divisibleByThree(""));
        System.out.println();
        System.out.println("Task 8 ///////////////////////////////////////////");
        System.out.println();
        System.out.println(FirstClass.formatDuration(-2));
        System.out.println(FirstClass.formatDuration(0));
        System.out.println(FirstClass.formatDuration(53));
        System.out.println(FirstClass.formatDuration(62));
        System.out.println(FirstClass.formatDuration(3662));
        System.out.println(FirstClass.formatDuration(365642));
        System.out.println(FirstClass.formatDuration(31839005));

    }
}
