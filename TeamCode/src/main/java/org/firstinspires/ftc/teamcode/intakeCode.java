package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


public class intakeCode extends LinearOpMode {
    private DcMotor geckoWheels = null;
    public void runOpMode() {
        geckoWheels = hardwareMap.get(DcMotor.class, "Intake_1");
        while (opModeIsActive()) {
            waitForStart();
            if(gamepad1.left_trigger <1)
                geckoWheels.setPower(0.50);
            if(gamepad1.right_trigger<1)
                geckoWheels.setPower(-0.50);


    }


}

