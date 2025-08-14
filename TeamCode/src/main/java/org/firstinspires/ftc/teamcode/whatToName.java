package org.firstinspires.ftc.teamcode;

public class whatToName {
    public static void main(String[] args) {
        String robotName = "AlphaBot";
        int motorPowerLevel = 80;
        double servoPosition = 0.5;
        System.out.println(robotName +  motorPowerLevel +  servoPosition);
        System.out.println(isMotorOverheated(65));
        System.out.println(isMotorOverheated(75));
        }
        public static boolean isMotorOverheated(int temperature) {
        if(temperature>70) {
            return true;
        }
        else return false;

        }
        }




