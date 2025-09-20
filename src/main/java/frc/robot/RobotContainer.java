// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ThrottleRunCommand;
import frc.robot.subsystems.ExampleSubsystem;

import com.fasterxml.jackson.core.JsonToken;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final Joystick joystick = new Joystick(0);
  
  private final JoystickButton runButton = new JoystickButton(joystick, 1);

  public RobotContainer() {
    configureBindings();
  }


  private void configureBindings() {
   runButton.whileTrue(new ThrottleRunCommand(() -> joystick.getThrottle()));
  }

  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(m_exampleSubsystem);
  }
}
