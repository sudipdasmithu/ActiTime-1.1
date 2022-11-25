package DistributedParallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Modify {
	@Test(groups="regression")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(groups= {"smoke","regression"})
	public void modifyReception() {
		Reporter.log("modifyReception",true);
	}

}
