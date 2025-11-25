package testcases;

import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.NewAccount;

public class TC_NewAccount extends BaseClass {
	
	@Test
	public void createNewBankAccount() {
		NewAccount NA=new NewAccount(driver);
		NA.NewAccountBank();
	}

}
