/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package com.company;


import com.company.subsystems.DriveTrainSubsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

    public static int
    DriveLeft1 = 1,
    DriveLeft2 = 0,
    DriveRight1 = 3,
    DriveRight2 = 2;


    public static WPI_VictorSPX driveLeft1 = new WPI_VictorSPX(DriveLeft1);
    public static WPI_VictorSPX driveLeft2 = new WPI_VictorSPX(DriveLeft2);
    public static WPI_VictorSPX driveRight1 = new WPI_VictorSPX(DriveRight1);
    public static WPI_VictorSPX driveRight2 = new WPI_VictorSPX(DriveRight2);

    public static DriveTrainSubsystem  MainDrive = new DriveTrainSubsystem();


}

