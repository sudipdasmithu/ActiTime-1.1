package parallelCompact;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Compact.generic.BaseClass;

public class modify extends BaseClass {
	@Test(groups="regression")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(groups= {"smoke","regression"})
	public void modifyReception() {
		Reporter.log("modifyReception",true);
	}
}
