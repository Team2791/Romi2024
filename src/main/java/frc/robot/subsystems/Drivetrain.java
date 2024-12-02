// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.DriveConstants;

public class Drivetrain extends SubsystemBase {
    // Setup Motors
    private final Spark left = new Spark(0);
    private final Spark right = new Spark(1);

    // Setup motor encoders
    private final Encoder leftEncoder = new Encoder(4, 5);
    private final Encoder rightEncoder = new Encoder(6, 7);

    // Set up the differential drive controller
    private final DifferentialDrive driveController = new DifferentialDrive(left::set, right::set);

    /** Creates a new RomiDrivetrain. */
    public Drivetrain() {
        leftEncoder.setDistancePerPulse(DriveConstants.kDistancePerPulse);
        rightEncoder.setDistancePerPulse(DriveConstants.kDistancePerPulse);

        resetEncoders();
        right.setInverted(true);
    }

    /** Drives the robot, with speed and rotate values between -1 and 1  */
    public void arcadeDrive(double speed, double rotate) {
        driveController.arcadeDrive(speed, rotate);
        
    }

    public void resetEncoders() {
        leftEncoder.reset();
        rightEncoder.reset();
    }

    public double leftDistance() {
        if(drivetrain.leftDistance>=distance)
        return leftEncoder.getDistance();
    }

    public double rightDistance() {

        return rightEncoder.getDistance();
    }
}
