package org.firstinspires.ftc.teamcode;

public class VariableAndPrinting { // you have to have a class for your code

    public static void main(String[] args) { // you have to use psvm as a method for code to be in

        double myNumb;

        // int for numbers
        // double for large decimals (use float where possible, it takes up less space)
        // if you give an int a variable def as float or double, it will add a decimal no matter what
        // String for words
        // char for single letters, letters have to be encased in single quotes
        // Boolean, stores true or false, you do not have to assign the variable, you can type it into a piece of code and it returns

        String name;

        name = "Jack"; // reserved words can not be used as variable names

        myNumb = 14.5*2; // you can use opperators in variables or print statements

        myNumb = 45; //you can change your number later in the code

        int x = 10 , y = 60 , z = 5; // you can define multiple of the same type of variables with the use of a list with commas

        int a , b , c;

        a = b = c = 40; // you can assign the same value to multiple variables

        String text;

        text = "ABCDEFGHIJKLMNOPQRSTUVQXYZ";

        String HW;
        HW = "Hello World";


        System.out.println("The length of the text is " + text.length()); //you can see how long your text is by using this command

        System.out.println(myNumb); // you can use System.out.print() for two print statements to be on one line

        System.out.println(name); // otherwise you will get seperate lines for print statements if you use println

        System.out.println(name + " is " + myNumb + " years old."); // you can add values and strings like this
        // you can use opperators while printing

        System.out.println(HW.toUpperCase()); //prints HELLO WORLD

        System.out.println(HW.toLowerCase()); // prints hello world

        System.out.println(10>9); // this works as a boolean and returns true

        System.out.println(10==4); // provides false because 10 is not equal to 4

        System.out.println(10 >= 3); // True, 10 is greater than or equal to 3



    }
}
