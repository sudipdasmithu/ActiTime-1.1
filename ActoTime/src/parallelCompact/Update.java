package parallelCompact;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Compact.generic.BaseClass;

public class Update extends BaseClass {
	@Test(groups="regression")
	public void updateCustomer() {
		Reporter.log("updateCustomer",true);
	}
	@Test(groups= {"smoke","regression"})
	public void updateReception() {
		Reporter.log("updateReception",true);
	}
}
