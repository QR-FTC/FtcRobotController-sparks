package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Servo Control with Gamepad", group="Tutorials")
public class expoMarker extends LinearOpMode {

    private Servo myServo;
    private DcMotor myMotor1;
    private DcMotor myMotor2;
    private DcMotor myMotor3;
    private DcMotor myMotor4;


    @Override
    public void runOpMode() {

        myServo = hardwareMap.get(Servo.class, "turret");
        myMotor1 = hardwareMap.get(DcMotor.class,"sentry1");
        myMotor2 = hardwareMap.get(DcMotor.class,"sentry2");
        myMotor3 = hardwareMap.get(DcMotor.class,"sentry3");
        myMotor4 = hardwareMap.get(DcMotor.class,"sentry4");

        waitForStart();

        if(gamepad1.dpad_left)
            myMotor1.setDirection(DcMotor.Direction.REVERSE);
            myMotor2.setDirection(DcMotor.Direction.REVERSE);
            myMotor3.setDirection(DcMotor.Direction.REVERSE);
            myMotor4.setDirection(DcMotor.Direction.REVERSE);
        if(gamepad1.dpad_right)
            myMotor1.setDirection(DcMotor.Direction.FORWARD);
            myMotor2.setDirection(DcMotor.Direction.FORWARD);
            myMotor3.setDirection(DcMotor.Direction.FORWARD);
            myMotor4.setDirection(DcMotor.Direction.FORWARD);

        while (opModeIsActive()) {
            double power;
            power = gamepad1.right_trigger;
            myMotor1.setPower(power);
            myMotor2.setPower(power);
            myMotor3.setPower(power);
            myMotor4.setPower(power);

            if(gamepad1.x)
                myServo.setPosition(0.0);
            if(gamepad1.y)
                myServo.setPosition(0.5);
            if(gamepad1.b)
                myServo.setPosition(1);

            telemetry.addData("Servo Position", myServo.getPosition());
            telemetry.addData("Motor Power", myMotor1.getPower());;
            telemetry.addData("Motor Direction", myMotor1.getDirection());
            telemetry.addData("Motor Power", myMotor2.getPower());;
            telemetry.addData("Motor Direction", myMotor2.getDirection());
            telemetry.addData("Motor Power", myMotor3.getPower());;
            telemetry.addData("Motor Direction", myMotor3.getDirection());
            telemetry.addData("Motor Power", myMotor4.getPower());;
            telemetry.addData("Motor Direction", myMotor4.getDirection());
        }
    }
}