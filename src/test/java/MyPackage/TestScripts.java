package MyPackage;

import java.util.concurrent.TimeUnit;

import header.Actions;
import header.AfterClass;
import header.AfterMethod;
import header.AfterSuite;
import header.AfterTest;
import header.BeforeClass;
import header.BeforeMethod;
import header.BeforeSuite;
import header.BeforeTest;
import header.Constant;
import header.Elements;
import header.ExcelUtils;
import header.FirefoxDriver;
import header.Test;
import header.WebDriver;

public class TestScripts {
	ExcelUtils excel = new ExcelUtils();
	Constant cnt = new Constant();
	Elements e = new Elements();
	WebDriver dr;// = new FirefoxDriver();
	Actions actions;// = new Actions(dr);

	public void login() {
		System.out.println("pass login0");
		// dr = new FirefoxDriver();
		System.out.println("pass login1");
		dr.get(cnt.baseUrl + "wp-admin");
		dr.findElement(e.acc).sendKeys("admin");
		dr.findElement(e.pass).sendKeys("1");
		dr.findElement(e.btnSubmit).click();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.findElement(e.textDashboard).getText().equals("Dashboard");
		System.out.println("pass login");
	}

	@Test(priority = 1)
	public void gotoHeaderList() throws InterruptedException {
		System.out.println("go to header");
		actions = new Actions(dr);
		Thread.sleep(3000);
		System.out.println("go to header");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		dr.navigate().to(cnt.baseUrl + "wp-admin/edit.php?post_type=header_builder");
		 actions.moveToElement(dr.findElement(e.btnNitro)).build().perform();
		 dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 System.out.println("hover nitro");
		 actions.moveToElement(dr.findElement(e.btnHeader)).click();
		// actions.perform();
		// Thread.sleep(6000);
		// actions.click().perform();
		// Thread.sleep(6000);
		System.out.println("pass go to header list");
	}

	// @Test(priority = 0)
	public void andf() throws Exception {

		String r00 = excel.getCellData(0, 1);
		System.out.println("ham 1\t" + r00);
	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		// excel.setExcelFile(cnt.Path_TestData + cnt.File_TestData, "info");
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		excel.setExcelFile(cnt.Path_TestData + cnt.File_TestData, "info");
		// dr = new FirefoxDriver();
		login();
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("call before test funtion");
		System.setProperty("webdriver.gecko.driver", "/Users/thampt/selenium/lib/geckodriver");
		dr = new FirefoxDriver();
		System.out.println("call before test funtion2");

	}

	@AfterTest
	public void afterTest() {
		// dr.quit();
	}

	@BeforeSuite
	public void beforeSuite() {

	}

	@AfterSuite
	public void afterSuite() {
	}
}
