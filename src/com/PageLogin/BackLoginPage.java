package com.PageLogin;

import com.sun.jna.platform.win32.Netapi32Util.UserInfo;
import com.webtest.core.WebDriverEngine;

public class BackLoginPage {

	public WebDriverEngine webtest;
    public BackLoginPage(WebDriverEngine webtest) {
		this.webtest = webtest;	
    }


	public void LoginSucceed() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='indexball']");
		Thread.sleep(5000);
		webtest.click("xpath=.//*[@id='nav_div']/a/img");
		Thread.sleep(3000);
		webtest.type("xpath=.//*[@id='input']/form/div[1]/input]","15732175160");
		webtest.type("xpath=.//*[@id='inputpwd']","glf123456");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='id']");
	}


	public void UserInfor() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='indexball']");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='nav_div']/a/img");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='buton1']/label");
		Thread.sleep(3000);
		webtest.type("xpath=.//*[@id='message']/form/div[1]/div[2]/input[1]","Dasen");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='message']/form/div[2]/div[2]/input");
		Thread.sleep(3000);
		webtest.type("xpath=.//*[@id='message']/form/div[3]/div[2]/textarea","Hello World!");
		webtest.click("xpath=.//*[@id='id']");
	}
	
	public void ChangeAccount() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='indexball']");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='nav_div']/a/img");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='usermessage5']");
		Thread.sleep(3000);
		webtest.type("xpath=.//*[@id='message']/form/div[1]/div[2]/input[1]","Dasen");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='message']/form/div[2]/div[2]/input");
		Thread.sleep(3000);
		webtest.type("xpath=.//*[@id='message']/form/div[3]/div[2]/textarea","Hello World!");
		webtest.click("xpath=.//*[@id='id']");
	}
	
	public void ForumCollection() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='indexball']");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='nav_div']/a/img");
		Thread.sleep(3000);
		webtest.click("xpath='].//*[@id='navigation']/ul/li[3]/a");
		Thread.sleep(3000);
		webtest.click("xpath=html/body/div[2]/div/div[2]/ul/li[2]/a/img");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='collectionA']");
	}
	
	public void ForumLike() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='indexball']");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='nav_div']/a/img");
		Thread.sleep(3000);
		webtest.click("xpath='].//*[@id='navigation']/ul/li[3]/a");
		Thread.sleep(3000);
		webtest.click("xpath=html/body/div[2]/div/div[2]/ul/li[2]/a/img");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='likeA']");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='likeA']");
	}

	public void ForumComment() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='indexball']");
		Thread.sleep(3000);
		webtest.click("xpath=.//*[@id='nav_div']/a/img");
		Thread.sleep(3000);
		webtest.click("xpath='].//*[@id='navigation']/ul/li[3]/a");
		Thread.sleep(3000);
		webtest.click("xpath=html/body/div[2]/div/div[2]/ul/li[2]/a/img");
		Thread.sleep(3000);
		webtest.type("xpath=.//*[@id='userbb']","This is a comment.");
		Thread.sleep(3000);
		webtest.click("xpath=html/body/div[3]/div[1]/a");
	}
}
