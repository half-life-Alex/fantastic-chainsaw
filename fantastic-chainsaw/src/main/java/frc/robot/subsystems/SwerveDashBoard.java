// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SwerveDashBoard extends SubsystemBase {
  /** Creates a new SwerveDashBoard. */
  public SwerveDashBoard() {}

  public double setRobotMass(double mRobotMass){
    Constants.ROBOT_MASS = mRobotMass;
    return mRobotMass;
  }

  public double setLoopTime(double mLoopTime){
    Constants.LOOP_TIME = mLoopTime;
    return mLoopTime;
  }

  public double setMaxSpeed(double mMaxSpeed){
    Constants.MAX_SPEED = mMaxSpeed;
    return mMaxSpeed;
  }

  public double setDeadband(double mDeadband){
    Constants.OperatorConstants.DEADBAND = mDeadband;
    return mDeadband;
  }

  public double setLeftYDeadband(double mLeftYDeadband){
    Constants.OperatorConstants.LEFT_Y_DEADBAND = mLeftYDeadband;
    return mLeftYDeadband;
  }

  public double setRightXDeadband(double mRightXDeadband){
    Constants.OperatorConstants.RIGHT_X_DEADBAND = mRightXDeadband;
    return mRightXDeadband;
  }

  public double setTurnConstant(double mTurnConstant){
    Constants.OperatorConstants.TURN_CONSTANT = mTurnConstant;
    return mTurnConstant;
  }

  private void GetSmartDashCons(){
    //Allows users to change ROBOT_MASS constant in SmartDashboard
    SmartDashboard.putNumber("robot_mass", Constants.ROBOT_MASS);
    setRobotMass(SmartDashboard.getNumber("robot_mass", (148 - 20.3) * 0.453592));

    //Allows users to change LOOP_TIME constant in SmartDashboard
    SmartDashboard.putNumber("loop_time", Constants.LOOP_TIME);
    setLoopTime(SmartDashboard.getNumber("loop_time", 0.13));

    //Allows users to change MAX_SPEED constant in SmartDashboard
    SmartDashboard.putNumber("max_speed", Constants.MAX_SPEED);
    setMaxSpeed(SmartDashboard.getNumber("max_speed", 14.5));

    //Allows users to change DEADBAND constant in SmartDashboard
    SmartDashboard.putNumber("deadband", Constants.OperatorConstants.DEADBAND);
    setDeadband(SmartDashboard.getNumber("deadband", 0.1));

    //Allows users to change LEFT_Y_DEADBAND constant in SmartDashboard
    SmartDashboard.putNumber("left_y_deadband", Constants.OperatorConstants.LEFT_Y_DEADBAND);
    setDeadband(SmartDashboard.getNumber("left_y_deadband", 0.1));

    //Allows users to change RIGHT_X_DEADBAND constant in SmartDashboard
    SmartDashboard.putNumber("right_x_deadband", Constants.OperatorConstants.RIGHT_X_DEADBAND);
    setDeadband(SmartDashboard.getNumber("right_x_deadband", 0.1));

    //Allows users to change TURN_CONSTANT constant in SmartDashboard
    SmartDashboard.putNumber("turn_constant", Constants.OperatorConstants.TURN_CONSTANT);
    setDeadband(SmartDashboard.getNumber("turn_constant", 6));
  } 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    GetSmartDashCons();
  }
}
