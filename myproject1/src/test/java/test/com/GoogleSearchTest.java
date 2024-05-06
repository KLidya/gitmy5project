/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author User
 */
public class GoogleSearchTest {
    private WebDriver driver;
    
    public GoogleSearchTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Implicit wait - Wait for the elements to load before throwing an exception
        driver.manage().window().maximize();

        // Open Google homepage
        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
       
    }
    
   public void testGoogleSearch() {
       driver.get("https://www.google.com");
       WebElement SearchBox = driver.findElement(By.name("q"));
       SearchBox.sendKeys("TestNG");
       SearchBox.submit();
       assertTrue(driver.getTitle().contains("TestNG"));
       
       

} 
}

