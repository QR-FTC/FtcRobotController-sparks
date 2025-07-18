package org.firstinspires.ftc.teamcode;

public class interimClass {
    public static int square(int x, int y){
        return x*y;
    }

    public static int multiply(){
        return square(5,6) *2;
    }

    public static void main(String[] args) {
        System.out.println(square(2,4));
        System.out.print(multiply());
    }

}
