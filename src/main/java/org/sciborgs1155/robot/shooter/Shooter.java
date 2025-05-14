package org.sciborgs1155.robot.shooter;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase{
    private final ShooterIO top;
    private final ShooterIO bottom;

    public Shooter(ShooterIO top, ShooterIO bottom) {

        this.bottom = bottom;
        this.top = top;


    }





    public void setVoltage(double voltage) {
        top.setVoltage(voltage);
        bottom.setVoltage(voltage);
    }
    
}
