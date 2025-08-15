package org.firstinspires.ftc.teamcode;

public class Casting {

    public static void main(String[] args) {


        // CASTING ORDER
        // Widening Byte -> short -> char -> int -> long -> float -> double
        // Narrowing Double -> float -> long -> int -> char -> short -> byte

        // manual casting can be achieved by putting the new cast in front of the variable
        // you must use manual casting when narrowing cast, use automatic casting when widening casting
        double d = 9.78;
        int i = (int) d;
        System.out.println(d); // prints 9.78
        System.out.println(i); // prints 9.78 but as an int (9)

        // automated casting
        int Myint;
        Myint = 9;
        double myd = Myint; // casting to double
        System.out.println(Myint); // prints 9
        System.out.println(myd); // prints 9.0


    }


}
