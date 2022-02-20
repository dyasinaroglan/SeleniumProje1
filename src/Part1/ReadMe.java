package Part1;

import com.sun.source.tree.IfTree;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.Locale;


public class ReadMe extends BaseStaticDriver {

    /*
        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
		ve Ekrana "**** Name Onaylandi ****" yazdirin. 
		degilse "**** Name Yanlis Girildi ****"

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
		ve Ekrana "**** Email Onaylandi ****" yazdirin. 
		degilse "**** Email Yanlis Girildi ****"

     */

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation");

        WebElement eMail = driver.findElement(By.cssSelector("input[id='userEmail']"));
        eMail.sendKeys("Testing@testing.com");

        WebElement currentAdress = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
        currentAdress.sendKeys("Testing Current Address");

        WebElement parmanentAdress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        parmanentAdress.sendKeys("Testing Permanent Address");
        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.cssSelector("button[id='submit']"));
        submit.click();
/*
        WebElement kontroluser=driver.findElement(By.cssSelector("p[id='name']"));
        String actual = kontroluser.getText();
        System.out.println(actual);
        String expected = "Name:automation";
        Assert.assertTrue("YANLIŞ" ,expected.contains(actual));

/*
        WebElement kontrolemail=driver.findElement(By.cssSelector("p[id='email']"));

        if (kontrolemail.getText().toLowerCase().contains("testing")){
            System.out.println(" Email Onaylandi ");
            }

        Assert.assertTrue("yanlış ",kontroluser.getText().toLowerCase().contains("automation"));

 */











       

    }


}
