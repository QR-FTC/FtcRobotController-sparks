package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.hardware.Servo;


public class servoControl extends LinearOpMode {
    private Servo armServo;

    @Override
    public void runOpMode() {

        armServo = hardwareMap.get(Servo.class, "arm_servo");

        while (opModeIsActive()) {
            waitForStart();
            if(gamepad1.a) {
                armServo.setPosition(0.0);
            }
            if(gamepad1.b){
                armServo.setPosition(1.0);
            }

        }
    }
}