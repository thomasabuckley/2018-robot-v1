package org.usfirst.frc.team61.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GrabWithJoysticks extends GlobalCommand {

    public GrabWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
    	requires(claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	oi.updateToggleLift();
        if(oi.toggleOnLift){
        	// commands to occur when torque toggle is pressed
        	// we only want the moveAllMotors command in TorqueLift to
        	// run so we will do nothing here
        	return;
        } else {
        	//the commands here will be what normally runs
        	
        	// toggle button to open and close claw
        	oi.updateToggleOpenClaw();
            if(oi.toggleOnOpenClaw){
            	claw.openClaw();
            } else {
            	claw.closeClaw();
            }
            
            // toggle button to lift and lower claw
        	oi.updateToggleLiftClaw();
            if(oi.toggleOnLiftClaw){
            	claw.liftClaw();
            } else {
            	claw.lowerClaw();
            }
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}