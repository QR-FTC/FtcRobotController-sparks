package org.firstinspires.ftc.teamcode;

import java.util.Scanner; // use import to make import file to use data from other classes unless it is in the same folder

public class Input {

    public static void main(String[] args) {


        // for input use this code version (check line 3)
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);


    }

}
