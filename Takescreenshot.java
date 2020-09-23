package Screenshot;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.temporal.ChronoField;

public class Takescreenshot {

    public static WebDriver driver;

    public void screenshot(WebDriver driver) throws IOException {

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File srcFile = (scrShot).getScreenshotAs(OutputType.FILE);
        //copying the screenshot to file path

        FileUtils.copyFile(srcFile,new File("C:\\Users\\sansp\\IdeaProjects\\firstsamp\\src\\test\\java\\newscreen.jpeg"));

    }

}
