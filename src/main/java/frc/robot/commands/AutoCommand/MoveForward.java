package frc.robot.commands.AutoCommand;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class MoveForward extends Command {
    final Drivetrain drivetrain;
    final int distance;

    public MoveForward(Drivetrain drivetrain, int distance) {
        this.drivetrain=drivetrain;
        this.distance=distance;
        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {
        drivetrain.resetEncoders();
        drivetrain.arcadeDrive(2,0);
    }

    @Override 
    public void end(boolean interrupted) { 
        drivetrain.arcadeDrive(0,0);
    
    }

    @Override                                                                                                                                                                                                                                                                                                                 public boolean isFinished() {
return drivetrain.leftDistance() >= distance;
   
    }
    
}
