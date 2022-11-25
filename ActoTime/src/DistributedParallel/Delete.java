package DistributedParallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Delete {
	@Test(groups="regression")
	public void deleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}
	@Test(groups= {"regression","smoke"})
	public void deleteReception() {
		Reporter.log("delteRecption",true);
	}

}
