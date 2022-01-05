package udemychap3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive =new ChromeDriver();
		drive.get("http:\\www.google.com");
		System.out.println("Hello i am coding");
		
		////System.out.println(drive.getTitle());
		//System.out.println(drive.getCurrentUrl());
		//System.out.println(drive.getPageSource());
	/*drive.get("http:\\www.facebook.com");
	drive.findElement(By.id("email")).sendKeys("pinkypappachan111@gmail.com");
	drive.findElement(By.id("pass")).sendKeys("password");
  drive.findElement(By.linkText("Forgot Password?")).click();
	drive.findElement(By.xpath("//*[@id=\"u_0_d_sg\"]")).click();*/
    
    drive.get("https://login.salesforce.com/");
    
    drive.findElement(By.id("username")).sendKeys("pinkypappachan111@gmail.com");
    drive.findElement(By.name("pw")).sendKeys("12345");
   // drive.findElement(By.linkText("Forgot Your Password?")).click();
    drive.findElement(By.xpath("//*[@id=\"Login\"]")).click();
    
    
	


	}

}
