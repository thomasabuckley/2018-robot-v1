package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class closeClaw extends GlobalCommand {

    public closeClaw() {
        // Use requires() here to declare subsystem dependencies
        requires(claw);
        setTimeout(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	claw.closeClaw();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
