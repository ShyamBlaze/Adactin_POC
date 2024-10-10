package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public static void launchBrowser(String brows){driver = new ChromeDriver();}
    public static void launchURL(String URL){
        driver.get(URL);
    }
    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public boolean verifyURL(String url){
        String currenturl = driver.getCurrentUrl();
        boolean contains = currenturl.contains(url);
        return contains;
    }
    public static void quitBrowser(){
        driver.quit();
    }
}
