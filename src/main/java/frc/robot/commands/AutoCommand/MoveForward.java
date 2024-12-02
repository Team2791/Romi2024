package frc.robot.commands.AutoCommand;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class MoveForward extends Command {
    final Drivetrain drivetrain;
    final int distance;

    public MoveForward(Drivetrain drivetrain, int distance) {
        
    }

    @Override
    public void initialize() {
       
    }

    @Override 
    public void end(boolean interrupted) { 
        
    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
}
