package org.firstinspires.ftc.teamcode;

public class HetrogeneusCollections {
    public static void main(String[] args) {

        double[] a;

        a= new double[10];


        double[] b = new double [10];


        // defining a collection of type student
        class student {
            String name;
            int age;
            String grades;
        }

    //creating an object of type student
        student mystudent = new student();

        student mystudent2 = new student();

        mystudent.name = "Bob";
        mystudent.age = 2;
        mystudent.grades = "F-";

        System.out.println(mystudent.name);
        System.out.println(mystudent.age);
        System.out.println(mystudent.grades);












    }
}