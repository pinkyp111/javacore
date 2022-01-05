package udemychap3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\eclipse workspace\\udemychap3\\browserdriver\\chromedriver.exe");
		WebDriver opera=new ChromeDriver();
		opera.get("https://www.google.com");
		opera.manage().window().maximize();
		opera.findElement(By.linkText("Advertising")).click();
		// To indentify a hperlink the tag name is href at the end of the URL you can see the actual name of element"Advertising"
        opera.findElement(By.linkText("Sign in")).click();
        
	}

}
