import config.env_target;
import org.joda.time.Duration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login extends env_target {
    @Test
    public void main(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);


        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit'][@Data-test='login-button']")).click();

        driver.quit();


    }
    @Test
    public void invalidusername(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);


        driver.findElement(By.name("user-name")).sendKeys("standard_ser");
        driver.findElement(By.id("password")).sendKeys("secret_sace");
        driver.findElement(By.xpath("//input[@type='submit'][@Data-test='login-button']")).click();

        driver.quit();


    }
}
