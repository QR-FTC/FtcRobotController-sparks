package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name="Tasks 3,4,5,6", group="LinearOpMode")
public class whatToName2 extends LinearOpMode {

    private Servo armServo;
    private DcMotor leftMotor;

    @Override
    public void runOpMode() {
        armServo= hardwareMap.get(Servo.class, "armServo");
        leftMotor = hardwareMap.get(DcMotor.class, "leftMotor");

        waitForStart();

        while (opModeIsActive()) {
            leftMotor.setPower(-gamepad1.left_stick_y);


            if(gamepad1.a)
                armServo.setPosition(0);
            if (gamepad1.b)
                armServo.setPosition(1);

            telemetry.addData("Servo Position", armServo.getPosition());
            telemetry.update();

        }
    }
}





