import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

public class TimeCalculatorTest {
    private static WebDriver driver;

    @BeforeClass
    public static void startUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.miraclesalad.com/webtools/timesheet.php");
    }

    @Test
    public void simpleTimeAdditionTest(){
        WebElement hours1 = driver.findElement(By.id("hours1"));
        hours1.sendKeys("2:00");
        driver.findElement(By.id("hours2")).sendKeys("1:00");
        driver.findElement(By.id("hours3")).sendKeys("3:00");
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");

        driver.findElement(By.id("submit-sum-hours")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textMatches(By.id("shresult"), Pattern.compile("\\d+:\\d+\\W+")));

        String result = driver.findElement(By.id("shresult")).getText();
        Assert.assertEquals("6:00 (6.00 hours)", result);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
