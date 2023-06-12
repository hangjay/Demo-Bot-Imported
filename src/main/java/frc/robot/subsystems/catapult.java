// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class catapult extends SubsystemBase {
  /** Creates a new catapult. */
  DoubleSolenoid trebuchet1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
  DoubleSolenoid trebuchet2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 2, 3);

  public catapult() {

  }
public void toggle(DoubleSolenoid.Value value){
  trebuchet1.set(value);
  trebuchet2.set(value);

}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
