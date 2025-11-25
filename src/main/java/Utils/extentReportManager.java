package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportManager {

	public static ExtentReports extent;

	 public static ExtentReports getReporter() {

		String reportPath = System.getProperty("user.dir") + "/reports/Report_" + "index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("ParabankProject Framework Execution");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Tester", "PavanUddanti");
		return extent;

	}
	 

}
