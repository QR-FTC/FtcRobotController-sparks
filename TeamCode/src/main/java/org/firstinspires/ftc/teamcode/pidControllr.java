package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Motor 30 Degree Turn", group="Test")
public class pidControllr extends LinearOpMode {

    DcMotor motor;

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        // Map motor from hardware configuration
        motor = hardwareMap.get(DcMotor.class, "motor");

        // Reset encoder
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        // Calculate target ticks for 30 degrees


        // Wait for motor to reach the target
        while (opModeIsActive()){

            int ticksPerRev = 537; // GoBILDA 5203-19.1:1
            int targetTicks = (int)(3000.0 / 360.0 * ticksPerRev); // ~45 ticks
            motor.setTargetPosition(targetTicks);
            // Set mode to run to position
            motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);



            // Set the target and power

            motor.setPower(0.5);
            telemetry.addData("Target", targetTicks);
            telemetry.addData("Current", motor.getCurrentPosition());
            telemetry.update();
        }

        // Stop motor
        motor.setPower(0);

        // Optionally reset mode
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
}
