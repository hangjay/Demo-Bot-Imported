// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drive;

public class drivecommand extends CommandBase {
  drive train; 
  Joystick Controller;


  /** Creates a new drivecommand. */
  public drivecommand(drive train, Joystick controllerJoystick) {
    this.train = train; 
    this.Controller = controllerJoystick;
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(train);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    this.train.arcadeDrive(Controller.getRawAxis(0), Controller.getRawAxis(1));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
