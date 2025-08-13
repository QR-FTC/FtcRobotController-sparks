package org.firstinspires.ftc.teamcode;

public class BasicJava {

    static String robotName = "AlphaBot";
   static int motorPowerLevel = 80;
   static double servoPosition = 0.5;

   public static boolean isMotorOverheated(int temperature) {

       if (temperature > 70){
           return true;
       } else {
           return false;
       }



   }

    public static void main(String[] args) {
        System.out.println(robotName);
        System.out.println(motorPowerLevel);
        System.out.println(servoPosition);
        System.out.println(isMotorOverheated(65));
        System.out.println(isMotorOverheated(75));
    }
}
