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
        /* Fill this in yourself! */
    }

    @Override
    public void initialize() {
        /* Fill this in yourself! */
    }

    @Override

    @Override
    public void end(boolean interrupted) {
        drivetrain.arcanedrive(0);
        /* Fill this in yourself! */
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
