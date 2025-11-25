package EndtoEndTest;


import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.LoginPage;
import Pages.NewAccount;

public class TC_EtoE2 extends BaseClass {


	@Test
	public void CompleteE2E() throws InterruptedException {
		LoginPage LP = new LoginPage(driver);
		LP.login();
		
		NewAccount NA = new NewAccount(driver);
		NA.NewAccountBank();
		NA.Details();
		NA.getAccountID();
		NA.Nexttomove();
	}
}
