package testcases;



import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Pages.NavBar;

public class TC_NavBar extends BaseClass {
	
	@Test
	public void navTest(){
		NavBar Nav= new NavBar(driver);
		Nav.openBankProjectV2();
		
	}

}
