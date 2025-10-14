package Selenium_MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test002 
{
	public static void main(String []args)
	{
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.saucedemo.com/v1/");
		dr.findElement(By.name("user-name")).sendKeys("standard_user");
		dr.findElement(By.name("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		System.out.println(dr.findElements(By.xpath("//*")));
	}
}
