package parallelCompact;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Compact.generic.BaseClass;

public class Delete  extends BaseClass{
	@Test(groups="regression")
	public void deleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}
	@Test(groups= {"regression","smoke"})
	public void deleteReception() {
		Reporter.log("delteRecption",true);
	}
}
