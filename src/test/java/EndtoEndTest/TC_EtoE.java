package EndtoEndTest;


import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.LoginPage;
import Pages.NavBar;
import Pages.NewAccount;
import Utils.Exceldataprovider;
import Utils.JsonDataProvider;

public class TC_EtoE extends BaseClass {

	//retryAnalyzer = Utils.Retry.class
	//(dataProvider="Data1",dataProviderClass = Exceldataprovider.class)
	@Test(dataProvider="loginData",dataProviderClass = JsonDataProvider.class)
	public void CompleteE2E(String username, String password) throws InterruptedException {
		
		NavBar Nav= new NavBar(driver);
		Nav.openBankProjectV2();
		
		LoginPage LP = new LoginPage(driver);
		LP.login(username,password);
		

		NewAccount NA = new NewAccount(driver);
		NA.NewAccountBank();
		NA.Details();
		NA.getAccountID();
		NA.Nexttomove();
	}
}
