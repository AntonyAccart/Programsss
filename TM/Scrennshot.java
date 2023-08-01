package TM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrennshot {
	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized", "--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/alert.xhtml");

//	File image = driver.getScreenshotAs(OutputType.FILE);
//	File destination =new File("./Pic/one.jpg");
//	FileUtils.copyFile(image, destination);
//	
		File image = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./pics/one.jpg");
		FileUtils.copyFile(image, destination);
//	
	}
}

