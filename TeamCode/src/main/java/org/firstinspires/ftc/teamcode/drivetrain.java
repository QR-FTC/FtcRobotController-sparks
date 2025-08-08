package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name="Servo Control with Gamepad", group="Tutorials")
public class drivetrain extends LinearOpMode {

    private DcMotor myServo = null;
    private DcMotor notMyServo = null;
    private DcMotor maybeMyServo = null;
    private DcMotor maybeNotMyServo = null;
    @Override
    public void runOpMode() {
        // Initialize the servo from the hardware map
        // Replace "my_servo" with the name you configured for your servo in the Robot Controller app
        myServo = hardwareMap.get(DcMotor.class, "it's mine");
        notMyServo = hardwareMap.get(DcMotor.class, "it's really not");
        maybeMyServo = hardwareMap.get(DcMotor.class, "could be");
        maybeNotMyServo = hardwareMap.get(DcMotor.class, "poetic");


        while (opModeIsActive()) {
            waitForStart();
            if (gamepad1.left_trigger < 0.45)
                myServo.setPower(0.50);
            notMyServo.setPower(0.50);
            maybeMyServo.setPower(0.50);
            maybeNotMyServo.setPower(0.50);
            if(gamepad1.right_trigger<0.45)
                myServo.setPower(-0.45);
            notMyServo.setPower(-0.45);
            maybeMyServo.setPower(-0.45);
            maybeNotMyServo.setPower(-0.45);
            if(gamepad1.left_stick_y<0.5)
                myServo.setPower(0.55);
            notMyServo.setPower(0.55);
            maybeMyServo.setPower(-0.55);
            maybeNotMyServo.setPower(-0.55);


        }
    }
}
