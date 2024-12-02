package frc.robot.commands.AutoCommand;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class MoveForward extends Command {
    final Drivetrain drivetrain;
    final int distance;

    public MoveForward(Drivetrain drivetrain, int distance) {
        this.drivetrain = drivetrain;
        this.distance = distance;

        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {
drivetrain.arcadeDrive(5, 10);
    }


    @Override
    public void end(boolean interrupted) {
        /* Fill this in yourself! */
        drivetrain.arcadeDrive(0, 0);
    }

    @Override
    public boolean isFinished() {
        drivetrain leftDistance()>=distance;
        return false;
    }
}
