package CDP;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v142.emulation.Emulation;

public class DevToolsExample {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Emulation.setDeviceMetricsOverride(300, 700, 100, true, Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), Optional.empty()));
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		System.out.println("Screen size changed using DevTools!");
	}
}
