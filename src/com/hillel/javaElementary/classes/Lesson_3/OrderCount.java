package com.hillel.javaElementary.classes.Lesson_3;

public class OrderCount {
    private long[] id = new long[0];
    private int[] count = new int[0];

    public void put(long id){
        boolean isFounded = false;
        if (this.id.length < 1){
            addOneElement(id);
        }else {
            for (int i = 0; i < this.id.length; i++){
                if (this.id[i] == id){
                    addOne(i);
                    isFounded = true;
                }
            }
            if (!isFounded){
                addOneElement(id);
            }
        }
    }

    private void addOneElement(long id){
        long [] tempLong = new long[this.id.length+1];
        int [] tempInt = new int[this.count.length+1];
        for (int i = 0; i < this.id.length; i++){
             tempLong[i] = this.id[i];
             tempInt[i] = this.count[i];
        }
        tempLong[this.id.length] = id;
        tempInt[this.id.length] = 1;
        this.id = tempLong;
        this.count = tempInt;
    }

    private void addOne(int index){
        count[index] += 1;
    }

    public int[] getCount() {
        return count;
    }

    public long[] getId() {
        return id;
    }

    public int get(long id){
        for (int i = 0; i < this.id.length; i++){
            if(this.id[i] == id){
                return count[i];
            }
        }
        return -1;
    }

    public void sortByCount(){
        long tempId;
        int tempCount;

        for (int i = 0; i < id.length-1; i++){
            for (int j = i+1; j < id.length; j++){
                if (count[i] < count[j]){
                   tempId = id[j];
                   tempCount = count[j];

                   id[j] = id[i];
                   count[j] = count[i];

                   id[i] = tempId;
                   count[i] = tempCount;
                }
            }
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < id.length; i++){
            output += "id: "+id[i]+" count: "+count[i]+"\n";
        }
        return output;
    }
}
