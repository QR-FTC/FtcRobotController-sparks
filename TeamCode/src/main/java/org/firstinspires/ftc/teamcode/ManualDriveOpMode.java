package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Tasks 3,4,5,6", group="LinearOpMode")
public class ManualDriveOpMode extends LinearOpMode {

    private DcMotor rightFMotor;
    private DcMotor leftFMotor;
    private DcMotor rightBMotor;
    private DcMotor leftBMotor;


    @Override
    public void runOpMode() {
        leftBMotor = hardwareMap.get(DcMotor.class, "leftBMotor");
        leftFMotor = hardwareMap.get(DcMotor.class, "leftFMotor");
        rightBMotor = hardwareMap.get(DcMotor.class, "rightBMotor");
        rightFMotor = hardwareMap.get(DcMotor.class, "rightFMotor");


        waitForStart();

        while (opModeIsActive()) {
            leftFMotor.setPower(-gamepad1.left_stick_y);
            leftBMotor.setPower(-gamepad1.left_stick_y);
            rightBMotor.setPower(-gamepad1.left_stick_y);
            rightFMotor.setPower(-gamepad1.left_stick_y);

            if(gamepad1.dpad_up) {
                leftFMotor.setPower(1);
                leftBMotor.setPower(1);
                rightFMotor.setPower(1);
                rightBMotor.setPower(1);
            }

            if (gamepad1.dpad_down) {
                leftFMotor.setPower(-1);
                leftBMotor.setPower(-1);
                rightBMotor.setPower(-1);
                rightFMotor.setPower(-1);
            }
            if (gamepad1.dpad_left) {
                leftFMotor.setPower(-1);
                leftBMotor.setPower(-1);
                rightFMotor.setPower(1);
                rightBMotor.setPower(-1);
            }
            if (gamepad1.dpad_right) {
                leftFMotor.setPower(1);
                leftBMotor.setPower(1);
                rightFMotor.setPower(-1);
                rightBMotor.setPower(-1);
            }



        }
    }
}






