package Banking.Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CREATEBRANCH {

	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome Using WebDriver Manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//To open URL
		driver.get("http://primusbank.qedgetech.com/");
		
		//testNG Assertion
		//To Maximize the window
		driver.manage().window().maximize();
		
		//Create new Variables using "STRING" & "INT"Datatypes 
		//Banker Login
		String Username = "Admin";
		String Password = "Admin";
		driver.findElement(By.name("txtuId")).sendKeys(Username);
		driver.findElement(By.name("txtPword")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
		//testNG Assertion
		
		//Click on Branch and Create a new Branch
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		//testNG Assertion
		driver.findElement(By.name("BtnNewBR")).click();
		//testNG Assertion
		String Branch_name = "JaiHind";
		String Address1 = "H.NO.1";
		String Address2 = "Road no.1";
		String Address3 = "Street no.1";
		String Area = "Miyapur";
		String Zipcode = "27560";
		String Country = "INDIA";
		String State = "Andhra Pradesh";
		String City = "Hyderabad";
		driver.findElement(By.name("txtbName")).sendKeys(Branch_name);
		driver.findElement(By.name("txtAdd1")).sendKeys(Address1);
		driver.findElement(By.name("Txtadd2")).sendKeys(Address2);
		driver.findElement(By.name("txtadd3")).sendKeys(Address3);
		driver.findElement(By.name("txtArea")).sendKeys(Area);
		
		//The method sendKeys(CharSequence...) in the type WebElement is not applicable for the arguments (int)
		driver.findElement(By.name("txtZip")).sendKeys(Zipcode);
		
		//Use SELECT to Dropdown
		Select country = new Select(driver.findElement(By.name("lst_counrtyU")));
		country.selectByVisibleText(Country);
	    Select state = new Select(driver.findElement(By.name("lst_stateI")));
	    state.selectByVisibleText(State);
		Select city = new Select(driver.findElement(By.name("lst_cityI")));
		city.selectByVisibleText(City);
		
		driver.findElement(By.name("btn_insert")).click();
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[3]/a/img")).click();
		
		//to Click ok/submit
		driver.switchTo().alert().sendKeys("ok");
		
		//To close the browser
		driver.close();
		

	}

}
