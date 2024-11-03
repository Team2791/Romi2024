package frc.robot;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.ControllerDrive;
import frc.robot.subsystems.Drivetrain;

public class RobotContainer {
	private final Drivetrain drivetrain = new Drivetrain();
	private final SendableChooser<Command> auto = new SendableChooser<>();
	private final CommandXboxController controller = new CommandXboxController(0);

	public RobotContainer() {
		ShuffleboardTab tab = Shuffleboard.getTab("Robot");
		tab.add("Auto Command", auto);

		bindings();
	}

	private void bindings() {
		drivetrain.setDefaultCommand(new ControllerDrive(drivetrain, controller));
	}

	public Command getAutonomousCommand() {
		return auto.getSelected();
	}
}
