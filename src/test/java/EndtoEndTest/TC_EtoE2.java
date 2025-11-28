//package EndtoEndTest;
//
//
//import org.testng.annotations.Test;
//
//import Baseclass.BaseClass;
//import Pages.LoginPage;
//import Pages.NewAccount;
//import Utils.Exceldataprovider;
//
//public class TC_EtoE2 extends BaseClass {
//
//
//	@Test(retryAnalyzer = Utils.Retry.class,dataProvider="Data1",dataProviderClass = Exceldataprovider.class)
//	public void CompleteE2E(String username, String password) throws InterruptedException {
//		LoginPage LP = new LoginPage(driver);
//		LP.login(username,password);
//		
//
//		NewAccount NA = new NewAccount(driver);
//		NA.NewAccountBank();
//		NA.Details();
//		NA.getAccountID();
//		NA.Nexttomove();
//	}
//}
