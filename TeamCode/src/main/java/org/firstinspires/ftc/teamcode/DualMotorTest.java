package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class DualMotorTest extends LinearOpMode{


    private DcMotor motor1;

    private DcMotor motor2;





    // Define the initial servo position (e.g., 0.5 for the center)
//    private double servoPosition = 0.5;

    // Define constants for the servo's movement increments or decrements
//    private static final double SERVO_INCREMENT = 0.01; // Adjust this value for smoother or faster movement

    @Override
    public void runOpMode(){


        motor1=hardwareMap.get(DcMotor.class, "spin");

        motor2=hardwareMap.get(DcMotor.class, "spin2");



        while (opModeIsActive()) {

            waitForStart();
            double power2 = gamepad1.left_trigger;
            double power = gamepad1.right_trigger;
            if(gamepad1.right_trigger==power);
            {
                motor1.setPower(0.50);
                motor2.setPower(-0.50);
            }


            if(gamepad1.left_trigger==power2);{
                motor2.setPower(0.50);
                motor1.setPower(-0.50);
            } else {
                motor1.setPower(0);
                motor2.setPower(0);
            }












    }


} }}
