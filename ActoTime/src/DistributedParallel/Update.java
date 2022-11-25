package DistributedParallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Update {
	@Test(groups="regression")
	public void updateCustomer() {
		Reporter.log("updateCustomer",true);
	}
	@Test(groups= {"smoke","regression"})
	public void updateReception() {
		Reporter.log("updateReception",true);
	}

}
