// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import static edu.wpi.first.units.Units.Percent;

import java.util.function.DoubleSupplier;

import javax.sound.sampled.Control;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ControllerSubsystem;

public class ThrottleRunCommand extends Command {
  
  private DoubleSupplier throttle;
  private ControllerSubsystem controller = new ControllerSubsystem();

  public ThrottleRunCommand(DoubleSupplier throttle) {
    this.throttle = throttle;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    System.out.println("Throttle PCT: " + throttle.getAsDouble());

    double percentRun = throttle.getAsDouble() < 25 ? 50 : throttle.getAsDouble();

    controller.runPercent(Math.abs(percentRun));
  }

  @Override
  public void end(boolean interrupted) {
    controller.stop();
    System.out.println("Controller Command Stopped");
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
