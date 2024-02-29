package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tabel {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/table");
        WebElement C = driver.findElement(By.id("simpletable"));
        List<WebElement> tableHeader = C.findElements(By.tagName("th"));

        for (WebElement th : tableHeader) {
            String text = th.getText();
            System.out.println( "Tabel headers are :"+text);
        }
        List<WebElement> tableRow = C.findElements(By.cssSelector("tr"));
        for (WebElement ww:tableRow) {
            List<WebElement> td = ww.findElements(By.tagName("td"));
            WebElement element = td.get(0);
            System.out.println(element);

        }




    }
}