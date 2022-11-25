package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Delete {
	@Test
	public void deleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}
	@Test
	public void deleteReception() {
		Reporter.log("delteRecption",true);
	}

}
