

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.gecko.driver", "C:/Users/user/Downloads/geckodriver.exe");
			//ExtentReports extent;
			ExtentTest test = null;
			//extent =new ExtentReports("C:/Users/user/Downloads/output.html",true);
			test=new ExtentTest("First Test", "Describe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			test.log(LogStatus.PASS, "Maximized");
			Thread.sleep(5000);
			driver.get("http://www.abhisingh.co.nf");
			WebElement ele;
			ele=driver.findElement(By.id("about"));
			ele.click();
			Thread.sleep(5000);
			driver.close();
	}

}
