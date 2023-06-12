// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
//drive 

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drive extends SubsystemBase {
  Spark BR = new Spark (3);
  Spark FR = new Spark (0);
  Spark FL = new Spark (1);
  Spark BL = new Spark (2);
  DifferentialDrive drivetrain; 

  /** Creates a new drive. */
  public drive() {
    MotorControllerGroup leftwheels = new MotorControllerGroup(FL, BL);
    MotorControllerGroup rightwheels = new MotorControllerGroup(FR, BR);
    rightwheels.setInverted(true);
    drivetrain = new DifferentialDrive (leftwheels, rightwheels);
  }

  public void arcadeDrive(double y, double x) {
  drivetrain.arcadeDrive(y, x);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
