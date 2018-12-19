package Banking.Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.utils.SeleniumHelper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		SeleniumHelper sh = new SeleniumHelper();
		
		WebElement selectBranchList = driver.findElement(By.name("drlist"));
		sh.ListBoxItemTextSelection(selectBranchList, "Abc123");
		

	}

}
