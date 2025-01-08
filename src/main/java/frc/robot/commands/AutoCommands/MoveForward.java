// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.AutoCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class MoveForward extends Command {
  /** Creates a new MoveForward. */
  final Drivetrain drivetrain;
  public MoveForward(Drivetrain drivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
    this.drivetrain=drivetrain;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drivetrain.resetEncoders();
    drivetrain.arcadeDrive(1, -1);
    drivetrain.arcadeDrive(0,1);
    drivetrain.arcadeDrive(1, 1);
    drivetrain.arcadeDrive(1, 1);
    
  }
  
  // Called every time the scheduler runs while the command is scheduled.
 

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.arcadeDrive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (drivetrain.leftDistance()>=100)
        return true;
    return false;
  }
}
