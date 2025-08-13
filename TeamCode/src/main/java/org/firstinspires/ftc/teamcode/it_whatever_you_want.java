package org.firstinspires.ftc.teamcode;

public class it_whatever_you_want {

    public static double findVolume (double a, double b, double c){
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println("The volume of the rectangular prism is " + findVolume(4,5,6));
        System.out.println("The volume of the rectangular prism multiplied by four is " + multiplyVolume());
    }
    public static double multiplyVolume (){
        return findVolume(4, 5, 6)*4;
    }
}