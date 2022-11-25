package UnitRegressionTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Unit {
	@Test
	public void createModule(){
		Reporter.log("createmodule",true);
	}
	@Test
	public void modifyModule() {
		Reporter.log("modifymodule",true);
	}
	@Test
	public void deleteModule() {
		Reporter.log("deletelog",true);
	}

}
