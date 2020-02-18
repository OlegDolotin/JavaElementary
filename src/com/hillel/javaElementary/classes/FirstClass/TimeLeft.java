package com.hillel.javaElementary.classes.FirstClass;


public class TimeLeft {

    private String[] sArr = new String[5];
    private int[] arr = new int[5];

    public TimeLeft(int seconds){
        int temp;
        arr[4] = seconds - ((seconds/60)*60);
        temp = seconds/60;

        arr[3] = temp - ((temp/60)*60);
        temp /= 60;

        arr[2] = temp - ((temp/24)*24);
        temp /= 24;

        arr[1] = temp - ((temp/365)*365);
        arr[0] = temp/365;
        setValues();
    }

    private void setValues(){
        sArr[0] = arr[0]+" years";
        sArr[1] = arr[1]+" days";
        sArr[2] = arr[2]+" hours";
        sArr[3] = arr[3]+" minutes";
        sArr[4] = arr[4]+" seconds";
    }


    private int howMuchLeft(int current){
        int count = 0;
        for(int i = current; i < 5; i++){
            if (arr[i] > 0 && i != 4){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] != 0 && howMuchLeft(i) == 1){
                output +=sArr[i]+" ";
            }else if (arr[i] != 0 && howMuchLeft(i) > 1){
                output +=sArr[i]+", ";
            }
        }
        if (arr[4]!= 0){
            output +="and "+ sArr[4];
        }
        return output;
    }
}
