package ui.testScenarios;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class methods_Tsystems {

    WebDriver driver;

    @BeforeTest
    Public void beforeTest {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        driver.get("https://www.t-systems.com/in/en");
    }

    @Test
    Public void searchOption(){
        TsystemsWeb page = new TsystemsWeb(driver);
        page.searchBox("T Systems India");
    }

    @AfterTest
    Public void afterTest {
        driver.quit();
    }
}
