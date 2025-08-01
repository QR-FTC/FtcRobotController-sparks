package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Servo Control with Gamepad", group="Tutorials")
public class expoMarker extends LinearOpMode {

    private Servo myServo;
    private DcMotor myMotor;


    @Override
    public void runOpMode() {

        myServo = hardwareMap.get(Servo.class, "turret");
        myMotor = hardwareMap.get(DcMotor.class,"sentry");

        waitForStart();

        if(gamepad1.dpad_left)
            myMotor.setDirection(DcMotor.Direction.REVERSE);
        if(gamepad1.dpad_right)
            myMotor.setDirection(DcMotor.Direction.FORWARD);

        while (opModeIsActive()) {
            double power;
            power = gamepad1.right_trigger;
            myMotor.setPower(power);

            if(gamepad1.x)
                myServo.setPosition(0.0);
            if(gamepad1.y)
                myServo.setPosition(0.5);
            if(gamepad1.b)
                myServo.setPosition(1);

            telemetry.addData("Servo Position", myServo.getPosition());
            telemetry.update();
        }
    }
}