package spectrum3847.commands;

import spectrum3847.OI;
import spectrum3847.subsystems.Collector;
import spectrum3847.subsystems.DriveBase;
import spectrum3847.subsystems.Lift;
import spectrum3847.subsystems.Pneumatics;
import edu.wpi.first.wpilibj.command.Command;

/*
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static DriveBase drivebase = new DriveBase();
    public static Lift lift = new Lift();
    public static Collector collector = new Collector();
    public static Pneumatics pneumatics = new Pneumatics();

    // Create a single static instance of all of your subsystems
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}