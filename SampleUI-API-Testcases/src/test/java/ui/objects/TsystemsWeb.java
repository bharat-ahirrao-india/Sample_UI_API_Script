package ui.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TsystemsWeb {


        WebDriver driver;
        public TsystemsWeb (WebDriver driver){

            this.driver = driver;
        }

        By searchBox = By.xpath(''//*[@id='top']/div[3]/div/a");

                Public Void searchTsystems(String searchInput){
            driver.findElement(searchBox).sendKeys(searchInput);
        }
    }


