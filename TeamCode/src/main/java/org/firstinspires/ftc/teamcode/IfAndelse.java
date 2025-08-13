package org.firstinspires.ftc.teamcode;

public class IfAndelse {

    public static void main(String[] args) {

        // Use if to specify a block of code to be executed, if a specified condition is true
        // Use else to specify a block of code to be executed, if the same condition is false
        // Use else if to specify a new condition to test, if the first condition is false
        // Use switch to specify many alternative blocks of code to be executed



       final int i = 47; // if you don't want others or yourself to overide the code you can use the final key word to make it fixed
        if (i % 2 == 0) { // use double equal as a boolean in if statements
            System.out.println("i is even");
        } else { // in case the first condition doesn't work execute this block of code
            System.out.println("i is odd");
        }

        int j = 57;

        if (j > 90) {
            // if statements branching
            System.out.println("James got a good grade on the test");
        } else if (j > 75 )  { // if the first condition is not met it comes down to if else
            System.out.println("James got an okay grade on the test");
        } else { // conditionals will only come down if the first ones are not met
            System.out.println("James got a low grade on the test");

            int time = 10;
            if (time < 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            } // instead of writing this you can write (go to line 37)

            int hour = 20;
            String result = (hour < 18) ? "Good day." : "Good evening.";
            System.out.println(result); // this replaces lines of code and is very simple, only use on very basic if, else statements
















        }

    }

}
