package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arrayToLoopThrough = { 4, 23, 9, 4, 33 };

        int counter = 0;

        //     Start;       Keep going while         Increment by one;
        for (int i = 0; i < arrayToLoopThrough.length; i++) {
            counter = counter + 1;
            System.out.println(counter);
        }
    }
}
