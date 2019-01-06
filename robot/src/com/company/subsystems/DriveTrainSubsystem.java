package com.company.subsystems;

        import com.company.RobotMap;
        import com.company.commands.ArcadeDriveCommand;
        import edu.wpi.first.wpilibj.Joystick;
        import edu.wpi.first.wpilibj.command.Subsystem;
        import edu.wpi.first.wpilibj.drive.DifferentialDrive;

        import static com.company.RobotMap.*;


public class DriveTrainSubsystem extends Subsystem {
    private static DifferentialDrive MainDrive = new DifferentialDrive(driveLeft1, driveRight1);

    public DriveTrainSubsystem() {
        MainDrive.setSafetyEnabled(false);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ArcadeDriveCommand());

    }

    public void TeleopDrive(Joystick Driver) {

            MainDrive.arcadeDrive(Driver.getY() * .6, Driver.getX() * -.6);
        }

    public void Stop() {
        MainDrive.arcadeDrive(0, 0);
    }
}