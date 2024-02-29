package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class day {
    public static void main(String[] args) throws IOException, InterruptedException {
       System.setProperty("Webdriver.chrome.driver","C:\\Users\\Felix\\Downloads\\Learning\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        TakesScreenshot ts =(( TakesScreenshot)(driver));
//        File screenshotAs1 = ts.getScreenshotAs(OutputType.FILE);
//        File file = new File("./target/screenshot/mg.png");
//        FileUtils.copyFile(screenshotAs1 ,file);



        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.id("newTabBtn")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window : "+parentWindow);

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Child Window : "+allWindowHandles);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        FluentWait<WebDriver> fs = new FluentWait(driver);

        for(String sampleWindow :allWindowHandles){
            if(!sampleWindow.equals(parentWindow)){
                Thread.sleep(3000);
                driver.switchTo().window(parentWindow);
            }
        }
        String currentUrl = driver.getCurrentUrl();
        TakesScreenshot ts = ((TakesScreenshot) (driver));
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

        File file = new File ("./target/screenshot/mg.png");
        FileUtils.copyFile(screenshotAs,file);


        driver.quit();

    }
}
