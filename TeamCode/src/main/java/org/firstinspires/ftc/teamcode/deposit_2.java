package org.firstinspires.ftc.teamcode;


import static java.lang.reflect.Array.get;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class deposit_2 extends LinearOpMode {
    private DcMotor deposit_2 ;
    private DcMotor deposit_3;


    @Override
    public void runOpMode()  {
        deposit_2 = hardwareMap.get(DcMotor.class, "deposit_2");
        deposit_3 =hardwareMap.get(DcMotor.class, "deposit_3");

        while (opModeIsActive()) {

            waitForStart();

                deposit_2.setPower(gamepad1.left_stick_x);

                deposit_3.setPower(gamepad1.right_stick_x);





        }

    }
}
