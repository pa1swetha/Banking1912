package Banking.Banking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lets_talkTea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//enter URL
		driver.get("http://www.practiceselenium.com/let-s-talk-tea.html");
		driver.manage().window().maximize();
		
		/*String Exppage = "Let's Talk Tea";
		String Actpage =driver.getTitle();
		
		Boolean status = Exppage.equals(Actpage);
		Assert.assertTrue(status, "Let's Talk tea Navigation");*/
		
		
		Lets_talkTea Lt = new Lets_talkTea();
		Lt.testNGAssertion(driver, "Let's Talk Tea", "Lets talk tea Navigation");
 
	}
	
	
	public void testNGAssertion(WebDriver driver ,String expTitle , String message) {
		
        String actTitle =driver.getTitle();
		boolean status = expTitle.equals(actTitle);
		Assert.assertTrue(status, message);
	}

}
