package Day38_Capture_HandleSSL_Headless_BlackAds_ChromeExtensions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BloackingAds {

public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		File file=new File("C:\\Automation\\automationFiles\\crx files\\uBlock-Origin.crx");
		options.addExtensions(file);
	
	
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");
	
	}
	
	
}
