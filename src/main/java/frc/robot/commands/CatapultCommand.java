// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.catapult;

public class CatapultCommand extends CommandBase {
  /** Creates a new CatapultCommand. */
  catapult trebuchet;
  Joystick buttonboard;
  
  public CatapultCommand(catapult trebuchet, Joystick buttonboard ) {
    // Use addRequirements() here to declare subsystem dependencies.
  addRequirements(trebuchet);
  this.trebuchet = trebuchet;
  this.buttonboard = buttonboard;
  

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (buttonboard.getRawButton(6)) {
      trebuchet.toggle(DoubleSolenoid.Value.kForward);
    
    }
    else if (buttonboard.getRawAxis(3) >= .5){
      trebuchet.toggle(DoubleSolenoid.Value.kReverse); 
    }
    else
    {
      trebuchet.toggle(DoubleSolenoid.Value.kOff);
    }
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
