package CDP;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class ExcuteCdpCommands {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		Map<String, Object> deviceMetrics = new HashMap<>();
		deviceMetrics.put("width", 300);
		deviceMetrics.put("height", 700);
		deviceMetrics.put("deviceScaleFactor", 100);
		deviceMetrics.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		System.out.println("Screen size changed using DevTools!");

	}

}
