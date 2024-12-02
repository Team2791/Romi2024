package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drivetrain;


public class ControllerDrive extends Command {
    final CommandXboxController controller;
    final Drivetrain drivetrain;

    public ControllerDrive(Drivetrain drivetrain, CommandXboxController controller) {
        this.controller = controller;
        this.drivetrain = drivetrain;

        // you must use addRequirements() to specify the subsystems used by this command
        // remember how the command scheduler works?
        addRequirements(drivetrain);
    }

    // What should this command do?
    @Override
    public void execute() {
        double speed = controller.getLeftY();
        double rot = controller.getRightX();
        drivetrain.arcadeDrive(speed,rot);

        // ?
    }
}
