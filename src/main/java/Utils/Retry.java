package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int count = 0;
	@Override
	public boolean retry(ITestResult result) {

		System.out.println("🔁 Retrying test: " + result.getName() + " | Attempt: " + (count + 1));
		if (count < 3) {
			count++;
			return true;
		}
		return false;
	}

}
