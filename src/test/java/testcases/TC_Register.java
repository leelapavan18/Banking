package testcases;

import Baseclass.BaseClass;
import Pages.RegisterPage;

public class TC_Register extends BaseClass {

	public void RTest() {
		RegisterPage RP = new RegisterPage(driver);
		RP.registerPage();
	}
}
