package org.firstinspires.ftc.teamcode;

public class ArrayMethods {

    static int[] numbers = new int[10];

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+ array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
    // create a ten random integer array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1);
        }
printArray(numbers);
    }
}
