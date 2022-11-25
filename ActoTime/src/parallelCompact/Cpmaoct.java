package parallelCompact;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Compact.generic.BaseClass;

public class Cpmaoct extends BaseClass{
	@Test(groups= {"regression","smoke"})
	public void customerCreate()
	{
		Reporter.log("CreateCutomer",true);
	}
	@Test (groups="regression")
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	}
}
