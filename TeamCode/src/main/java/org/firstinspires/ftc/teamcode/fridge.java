package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name="Servo Control with Gamepad", group="Tutorials")
public class fridge extends LinearOpMode {

    // Declare a Servo object
    private Servo myServo;
    private DcMotor nato = null;
    private DcMotor nicaragua = null;
    private DcMotor brazil = null;
    private DcMotor murica = null;
    private DcMotor caneeda = null;


    // Define the initial servo position (e.g., 0.5 for the center)
//    private double servoPosition = 0.5;

    // Define constants for the servo's movement increments or decrements
//    private static final double SERVO_INCREMENT = 0.01; // Adjust this value for smoother or faster movement

    @Override
    public void runOpMode() {
        // Initialize the servo from the hardware map
        // Replace "my_servo" with the name you configured for your servo in the Robot Controller app
        myServo = hardwareMap.get(Servo.class, "turret");
        nato  = hardwareMap.get(DcMotor.class, "ww2");
        nicaragua = hardwareMap.get(DcMotor.class, "central america")
        brazil = hardwareMap.get(DcMotor.class, "you're coming to brazil")
        murica = hardwareMap.get(DcMotor.class, "Amurica")
        caneeda = hardwareMap.get(DcMotor.class, "Caneeda")

        // Set the initial position of the servo
//        myServo.setPosition(servoPosition);


        // Run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            // Display initial servo position on the Driver Station
//        telemetry.addData("Status", "Initialized");
//        telemetry.addData("Servo Position", servoPosition);
//        telemetry.update();

            // Wait for the game to start (driver presses PLAY)
            waitForStart();
            // Control the servo with the D-pad UP button (increase position)
            if(gamepad1.right_trigger<0.99)
                myServo.setPosition(0.356);
            if(gamepad1.left_trigger<0.45)
                myServo.setPosition(0.456);
            // Display the current servo position on the Driver Station
            telemetry.addData("Servo Position", myServo.getPosition());
            telemetry.update();
            if(gamepad1.right_trigger<0.99)
                myServo.setPosition(0.356);
            if(gamepad1.left_trigger<0.45)
                myServo.setPosition(0.456);
            if(gamepad1.left_stick_y<0.5)
                myServo.setPosition(0.556);
            if(gamepad1.right_stick_y<0.6)
                myServo.setPosition(0.666);
            if(gamepad1.left_trigger<0.4)
                nato.setPower(0.766);
            if(gamepad1.left_trigger<0.4)
                nicaragua.setPower(0.866);
            if(gamepad1.left_trigger<0.4)
                brazil.setPower(0.966);
            if(gamepad1.left_trigger<0.4)
                murica.setPower(0.166);
            if(gamepad1.left_trigger<0.4)
                caneeda.setPower(0.266);



        }
    }
}
