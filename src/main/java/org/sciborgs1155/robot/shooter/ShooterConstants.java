package org.sciborgs1155.robot.shooter;

import static edu.wpi.first.units.Units.RadiansPerSecond;

import edu.wpi.first.units.measure.AngularVelocity;

public class ShooterConstants {

  public static AngularVelocity DEFAULT_VELOCITY = RadiansPerSecond.of(550);
  public static AngularVelocity MAX_VELOCITY = RadiansPerSecond.of(630);

  public static final class PID {
    public static final double kP = 1;
    public static final double kI = 0;
    public static final double kD = 0;
  }

  public static final class FF {
    public static final double kS = 0;
    public static final double kV = 0.016896;
    public static final double kA = 0.0031483;
  }
}
