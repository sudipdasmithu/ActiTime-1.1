package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Modify {
@Test
public void modifyCustomer() {
	Reporter.log("modifyCustomer",true);
}
@Test
public void modifyReception() {
	Reporter.log("modifyReception",true);
}
}
