package udemychap3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse workspace\\chap3udemy\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();// to maximize the webpage
		System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
	};

}
