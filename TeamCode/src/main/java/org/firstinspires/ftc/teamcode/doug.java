package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class doug extends LinearOpMode{


    private DcMotor motor1;

    private DcMotor motor2;

    private DcMotor motor3;

    private DcMotor motor4;



    // Define the initial servo position (e.g., 0.5 for the center)
//    private double servoPosition = 0.5;

    // Define constants for the servo's movement increments or decrements
//    private static final double SERVO_INCREMENT = 0.01; // Adjust this value for smoother or faster movement

    @Override
    public void runOpMode(){


                motor1=hardwareMap.get(DcMotor.class, "spin");

        motor2=hardwareMap.get(DcMotor.class, "spin2");

        motor3=hardwareMap.get(DcMotor.class, "spin3");

        motor4=hardwareMap.get(DcMotor.class, "spin4");


        while (opModeIsActive()) {

            waitForStart();


            if(gamepad1.right_trigger>0.5);
            motor1.setPower(0.75);

            if(gamepad1.right_trigger>0.5);
            motor2.setPower(0.75);

            if(gamepad1.right_trigger>0.5);
            motor3.setPower(0.75);

            if(gamepad1.right_trigger>0.5);
            motor4.setPower(0.75);
        }










    }


}
