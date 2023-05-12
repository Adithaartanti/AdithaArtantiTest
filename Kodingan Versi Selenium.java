package action;

import jdk.internal.util.xml.impl.Input;
import launcher.MainAutomationEngine;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static action.MyConfig.isLaunch;
import static action.MyConfig.webDriver;

public class Belajar {
    public void main(String[] args) throws IOException {
        WebDriver getDriver = null;
//        File exDriver = new File(MyConfig.strDataTablePath + "\\externalDriver" + File.separator + MyConfig.strChromeDriver + ".exe");
        boolean isLaunch = false;

        while (!isLaunch) {
            try {
                System.setProperty("webdriver.chrome.driver", "C:\\git-server\\belajar.git\\DataTable\\externalDriver\\chromedriver113.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                getDriver = driver;
                isLaunch = true;
            } catch (Exception e) {

            }
        }


        getDriver.get("https://stage.mobipaid.com/en/register");


        getDriver.findElement(By.xpath("//input[@name='signatory_first_name']")).sendKeys("Aditha");
        getDriver.findElement(By.xpath("//input[@name='signatory_last_name']")).sendKeys("Artanti");
        getDriver.findElement(By.xpath("(//div//input[@name='email'])[2]")).sendKeys("tataaditha21@gmail.com");
        getDriver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Aditha210698");
        getDriver.findElement(By.xpath("//input[@placeholder='Company name']")).sendKeys("PT Pranala Ragam Karya");
        getDriver.findElement(By.xpath("//div[@class='iti__selected-flag']")).click();
        getDriver.findElement(By.xpath("//div[text()='+62']")).click();
        getDriver.findElement(By.xpath("//div[@class='iti__selected-flag']")).click();
        getDriver.findElement(By.xpath("(//input[@placeholder='812-345-678'])[1]")).sendKeys("82211148508");
        getDriver.findElement(By.xpath("//select[@id='country']")).click();
        getDriver.findElement(By.xpath("//option[contains(text(),'Indonesia')]")).click();
        getDriver.findElement(By.xpath("//input[@name='state']")).sendKeys("Asia");
        getDriver.findElement(By.xpath("//input[@type='checkbox']")).click();
        getDriver.findElement(By.xpath("//button[contains(text(),'Next Step')]")).click();



    }

}

