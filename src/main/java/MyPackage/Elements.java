package MyPackage;

import header.By;

public class Elements {
	By acc = By.id("user_login");
	By pass = By.id("user_pass");
	By btnSubmit = By.id("wp-submit");
	By textDashboard = By.xpath("//*[@id='wpbody-content']/div[3]/h1");
	By btnNitro = By.xpath("//*[@id='toplevel_page_wr-intro']/a/div[3]");
	//("//div[@class = 'wp-menu-name' and text()='Nitro']");
	By btnHeader = By.xpath("//*[@id='toplevel_page_wr-intro']/ul/li[3]/a");
	//("//ul[@class='wp-submenu wp-submenu-wrap']//*[text()='Header Builder']");

}
