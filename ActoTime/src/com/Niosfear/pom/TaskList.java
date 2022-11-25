package com.Niosfear.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TaskList {
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskBtn;
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newCustbtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement textLine;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createbtn;
	
	public WebElement getTextLine() {
		return textLine;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskBtn() {
		return taskBtn;
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewCustbtn() {
		return newCustbtn;
	}
	

	
	
}
