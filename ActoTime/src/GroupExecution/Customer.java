package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer {
	 
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
