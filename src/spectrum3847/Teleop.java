package spectrum3847;

import edu.wpi.first.wpilibj.command.Scheduler;

/**
 *
 * @author matthew
 */
public class Teleop {
    public static void init() {
        Scheduler.getInstance().removeAll();
        Init.liftcontrol.start();
        Init.collectcontrol.start();
    }

    public static void periodic() {
        Scheduler.getInstance().run();
        Dashboard.updateDashboard();
    }

    public static void cancel() {
        Scheduler.getInstance().removeAll();
    }
}
