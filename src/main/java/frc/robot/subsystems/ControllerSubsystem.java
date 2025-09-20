// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ControllerSubsystem extends SubsystemBase {

  private Talon motor = new Talon(0);

  public ControllerSubsystem() {
    motor = new Talon(1);
  }

  public void runBase(){
    motor.set(.50);
  }

  public void runPercent(double percent){
    motor.set(percent);
  }

  public void stop(){
    motor.set(0);
  }

  @Override
  public void periodic() {

  }
}
