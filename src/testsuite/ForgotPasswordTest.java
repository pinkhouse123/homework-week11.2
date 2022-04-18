package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // Enter username and password
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        // Click on forgot your password link
        driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}




