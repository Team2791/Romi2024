package frc.robot.constants;

public class DriveConstants {
	public static final double kPulsesPerRevolution = 1440.0;
	public static final double kWheelDiameter = 70;
	public static final double kTrackWidth = 140;

	public static final double kDistancePerPulse = (Math.PI * kWheelDiameter) / kPulsesPerRevolution;
}
