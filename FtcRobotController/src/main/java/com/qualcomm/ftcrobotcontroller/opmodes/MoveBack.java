package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by pedrosilva on 10/31/15.
 */
public class MoveBack extends OpMode {

    DcMotor motorRight;
    DcMotor motorLeft;


    public void init() {
        motorRight = hardwareMap.dcMotor.get("motor_right");
        motorLeft = hardwareMap.dcMotor.get("motor_left");


    }

    public void loop() {

        float P = -1;

        motorRight.setPower(1);
        motorLeft.setPower(1);


    }

    public void stop() {

    }


}