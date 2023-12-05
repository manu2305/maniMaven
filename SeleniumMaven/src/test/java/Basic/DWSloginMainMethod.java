package Basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Generic.LoginPage;
import Generic.WelcomePage;

public class DWSloginMainMethod {
	public static WebDriver driver;
public static void main(String[] args) {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reportextend/ExtentReport.html");
		
	     ExtentReports report = new ExtentReports();
	     
	     report.attachReporter(reporter);
	     
	     ExtentTest test = report.createTest("Login");
	     
	     driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     
	     test.log(Status.INFO,"LOgin page is displayed");
	     
	     WelcomePage w = new WelcomePage(driver);
	     
	     w.logbutton.click();
	     
	     test.log(Status.PASS,"user is logged in");
	     
	     LoginPage l = new LoginPage(driver);
	     
	     String username = "yogbelavanaki@gmail.com";
	     
	     String password = "Password@13";
	     
	     l.enterEmail(username);
	     
	     l.enterPassword(password);
	     
	     l.clickOnLogin();
	     
	     try {
	    	 if(driver.findElement(By.partialLinkText("Log out")).isDisplayed()) {
	    		 System.out.println("pass: user is logged in");
	    		 test.log(Status.PASS,"user is logged in");
	    	 }
	     }
	     catch (Exception e) {
	    	 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(Screenshot()).build());
	    	 System.out.println("fail: user is Not logged in");
    		 test.log(Status.FAIL,"user is not logged in"); 
		}
	     
	    // driver.findElement(By.partialLinkText("Log out")).click();
	     
	     report.flush();
	     
	} 
public static String Screenshot() {
	LocalDateTime dateTime=LocalDateTime.now();
	String name=dateTime.toString().replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	String path="./Screenshot/"+name+".png";
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(path);
	try {
		FileHandler.copy(temp, dest);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	return "."+path;
}






















}
