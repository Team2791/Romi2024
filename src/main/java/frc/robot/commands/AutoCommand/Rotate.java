package frc.robot.commands.AutoCommand;

import frc.robot.subsystems.Drivetrain;

public class Rotate {
    final Drivetrain drivetrain;
    final double degrees;

    public Rotate(Drivetrain drivetrain, double degrees) {
        this.drivetrain=drivetrain;
        this.degrees=degrees;
    }

    public void initialize() {
        drivetrain.resetEncoders();
        drivetrain.arcadeDrive(0,2);
    }

    public void execute() {
        
    }    
    public void end(boolean interrupted) { 
        drivetrain.arcadeDrive(0,0);
    }    

    public boolean isFinished() {
        
    }
}
