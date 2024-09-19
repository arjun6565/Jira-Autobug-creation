package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JiraBugCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "C:\\Arjun\\chromedriver-win64\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2Fid.atlassian.com%2Fjoin%2Fuser-access%3Fresource%3Dari%253Acloud%253Ajira%253A%253Asite%252F09860df5-b536-4f04-ad14-3b86ee5d5896%26continue%3Dhttps%253A%252F%252Farabyads.atlassian.net%252Fjira%252Fsoftware%252Fc%252Fprojects%252FDSP%252Fboards%252F40%253Fsprints%253D176%25252C169&application=jira");	
		
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("abc@gmail.com");
		
		driver.findElement(By.className("css-178ag6o")).click();
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		WebElement PassWord = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		PassWord.sendKeys("Password");
		
		driver.findElement(By.className("css-178ag6o")).click();
		
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       driver.findElement(By.xpath("//span[@class=\"css-178ag6o\" and text()=\"Projects\"]")).click();
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	
       driver.findElement(By.xpath("//span[@class=\"css-5mekwu\" and text()= \"adfalcon-rm (AFRM)\"]")).click();
	}
}
