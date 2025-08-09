package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Basic Movement", group="Linear OpMode")

public class BasicMovementOpMode extends LinearOpMode {
    private DcMotor leftMotor;
    private Servo armServo;

    @Override
    public void runOpMode() {
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        armServo = hardwareMap.get(Servo.class, "arm_servo");

        while (opModeIsActive()) {
            waitForStart();
            if(gamepad1.left_stick_y>0.0) {
                leftMotor.setPower(-gamepad1.left_stick_y);
            }
            if(gamepad1.a) {
                armServo.setPosition(0.0);
            }
            if(gamepad1.b){
                armServo.setPosition(1.0);
            }

        }
    }

}

