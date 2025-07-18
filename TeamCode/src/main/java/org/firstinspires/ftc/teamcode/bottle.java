package org.firstinspires.ftc.teamcode;

public class bottle {
    public static String volrectprism(double l, double w, double h) {
        return (l*w*h + "u^3");
    }

    public static void main(String[] args) {
        System.out.print(volrectprism(4,3,7));
    }
}
