package ghozti.rpibotlib.template.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import ghozti.rpibotlib.template.Robot;
import pibotlib.graphics.DriverStationLauncher;


public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("RPiBotLib driver station");
		config.setWindowSizeLimits(1080,720,1080,720);
		config.setWindowedMode(1080,720);
		config.setForegroundFPS(20);
		config.setIdleFPS(5);
		new Lwjgl3Application(new DriverStationLauncher(new Robot()), config);
	}
}
