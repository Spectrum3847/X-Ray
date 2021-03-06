package spectrum3847.commands;

import spectrum3847.Dashboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class CompressorDashboard extends CommandBase {

	public CompressorDashboard() {
		requires(pneumatics);
	}

	protected void initialize() {
	}

	protected void execute() {
		if(SmartDashboard.getBoolean(Dashboard.COMPRESSOR, true) && !pneumatics.getCompressor().enabled()) {
			pneumatics.startCompressor();
		} 
		else if (!SmartDashboard.getBoolean(Dashboard.COMPRESSOR) && pneumatics.getCompressor().enabled()){
			pneumatics.stopCompressor();
		}
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		pneumatics.startCompressor();
	}

	protected void interrupted() {
		end();
	}
}
