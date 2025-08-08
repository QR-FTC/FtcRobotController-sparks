package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
public class fireExtinguisher {



    @TeleOp(name="Servo Control with Gamepad", group="Tutorials")
    public class driveTrain extends LinearOpMode {

        private DcMotor bottomLeft;
        private DcMotor bottomRight;
        private DcMotor topLeft;
        private DcMotor topRight;


        @Override
        public void runOpMode() {

            bottomLeft = hardwareMap.get(DcMotor.class,"sentry0");
            bottomRight = hardwareMap.get(DcMotor.class,"sentry1");
            topLeft = hardwareMap.get(DcMotor.class,"sentry2");
            topRight = hardwareMap.get(DcMotor.class,"sentry3");

            waitForStart();

            double forward;
            forward = gamepad1.right_trigger;
            bottomLeft.setPower(forward);

            bottomRight.setDirection(DcMotor.Direction.REVERSE);
            bottomRight.setPower(forward);

            topLeft.setPower(forward);

            topRight.setDirection(DcMotor.Direction.REVERSE);
            topRight.setPower(forward);

            double backward;
            backward = gamepad1.left_trigger;
            topLeft.setDirection(DcMotor.Direction.REVERSE);
            bottomLeft.setPower(backward);

            bottomRight.setPower(backward);

            topLeft.setDirection(DcMotor.Direction.REVERSE);
            topLeft.setPower(backward);

            topRight.setPower(backward);

            double left;
            left = gamepad1.left_stick_x;
            
            bottomLeft.setPower(left);






            while (opModeIsActive()) {



                telemetry.addData("Motor Power", bottomLeft.getPower());;
                telemetry.addData("Motor Direction", bottomLeft.getDirection());
                telemetry.addData("Motor Power", bottomRight.getPower());;
                telemetry.addData("Motor Direction", bottomRight.getDirection());
                telemetry.addData("Motor Power", topLeft.getPower());;
                telemetry.addData("Motor Direction", topLeft.getDirection());
                telemetry.addData("Motor Power", topRight.getPower());;
                telemetry.addData("Motor Direction", topRight.getDirection());
            }
        }
    }
}
