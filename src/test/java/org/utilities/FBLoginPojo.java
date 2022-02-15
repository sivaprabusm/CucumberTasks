package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class FBLoginPojo extends BaseClass{

	public FBLoginPojo(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement userId;

	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public WebElement getUserId() {
		return userId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
