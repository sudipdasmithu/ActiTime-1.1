package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer {
	@Test
	public void customerCreate()
	{
		Reporter.log("CreateCutomer",true);
	}
	@Test
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	}

}
