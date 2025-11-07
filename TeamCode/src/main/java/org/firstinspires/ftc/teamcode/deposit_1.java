package org.firstinspires.ftc.teamcode;


import static java.lang.reflect.Array.get;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class deposit_1 extends LinearOpMode {
    private Servo servoDeposit;


    @Override
    public void runOpMode()  {
        servoDeposit = get(Servo.class, "deposit_1");

        while (opModeIsActive()) {

            waitForStart();


            if(gamepad1.dpad_down == true )
                servoDeposit.setPosition(0.5);
            if(gamepad1.dpad_up == true)
                servoDeposit.setPosition(0.0);





        }

    }
}
