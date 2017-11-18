package org.usfirst.frc.team4859.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	// Creating Talon motor objects
	Talon motor1 = new Talon(0);
	Talon motor2 = new Talon(1);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public void drivetrainForward() {
		// Tells motors to go forward at max speed
		motor1.set(1);
		motor2.set(1);
	}

	public void drivetrainStop() {
		// Tells motors to stop
		motor1.set(0);
		motor2.set(0);
	}
}
