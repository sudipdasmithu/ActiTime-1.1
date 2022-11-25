package com.Niosfear.script;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Niosfear.generic.FearBaseClass;
import com.Niosfear.pom.TaskList;

public class TaskListExecute extends FearBaseClass{
	@Test
	public void TasklistExe() throws InterruptedException 
	{
		Reporter.log("tasklistmodule ",true);
		TaskList t= new TaskList(driver);
		t.getTaskBtn().click();
		t.getAddnewbtn().click();
		t.getNewCustbtn().click();
		Thread.sleep(2000);
		t.getTextLine().sendKeys("HDFC_01");
		Thread.sleep(2000);
		t.getCreatebtn().click();
		
		
		
	}

}
