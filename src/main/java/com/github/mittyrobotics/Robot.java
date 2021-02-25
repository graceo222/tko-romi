package com.github.mittyrobotics;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
    private Spark leftSpark, rightSpark;
    private DigitalInput aButton, bButton, cButton;
    @Override
    public void robotInit() {
        leftSpark = new Spark(Constants.LEFT_MOTOR_ID);
        rightSpark = new Spark(Constants.RIGHT_MOTOR_ID);
        aButton = new DigitalInput(Constants.A_BUTTON_ID);
        bButton = new DigitalInput(Constants.B_BUTTON_ID);
        cButton = new DigitalInput(Constants.C_BUTTON_ID);
    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void teleopInit() {
        leftSpark.set(0);
        rightSpark.set(0);
    }

    @Override
    public void testInit() {

    }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopPeriodic() {
        if(aButton.get()){
            leftSpark.set(1);
            rightSpark.set(1);
        } else if(bButton.get()){
            leftSpark.set(-1);
            rightSpark.set(-1);
        } else if(cButton.get()){
            leftSpark.set(0);
            rightSpark.set(0);
        }
    }

    @Override
    public void testPeriodic() {

    }
}