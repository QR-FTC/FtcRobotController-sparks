package org.firstinspires.ftc.teamcode;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        // Declaring
        int[] a;
        // Creation
        a = new int[10];
        a[0]=11;
        a[1]=3;
        a[2]=14;
        a[3]=25;
        a[4]=8;
        a[5]=19;
        a[6]=1;
        a[7]=12;
        a[8]=15;
        a[9]=30;

        int sum = 0;
        int m = a[0];

        List evenList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenList.add(a[i]);
            }
            if (a[i] < m ) {
                m = a[i];
            }
        }
        System.out.println("The even numbers are ...." + evenList);
        System.out.println(m + ", is the smallest number.");


        int height = 5;  // You can change this value to make the pyramid taller or shorter

        // Outer loop for each row
        for (int i = 1; i <= height; i++) {
            // Loop to print spaces before the asterisks
            for (int j = i; j < height; j++) {
                System.out.print(" ");  // Print space
            }

            // Loop to print the asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");  // Print asterisk
            }

            // Move to the next line after printing each row
            System.out.println();
        }


    }
}

