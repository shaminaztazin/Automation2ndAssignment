package com.Locator;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementLocator extends TestBase {
    public static void main(String[] args){
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        OpenRegisterPage();
        TC_Register();
    }
    public static void OpenRegisterPage(){
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();
        WebElement Register=driver.findElement(By.linkText("Register"));
        Register.click();
    }
    public static void TC_Register(){
        WebElement FirstName=driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Muhammad");
        WebElement LastName=driver.findElement(By.name("lastname"));
        LastName.sendKeys("Yusuf");
        WebElement Email=driver.findElement(By.name("email"));
        Email.sendKeys("yusuf@gmail.com");
        WebElement Telephone=driver.findElement(By.name("telephone"));
        Telephone.sendKeys("01912334242");
        WebElement Password=driver.findElement(By.name("password"));
        Password.sendKeys("12345");
        WebElement PasswordConfirm=driver.findElement(By.name("confirm"));
        PasswordConfirm.sendKeys("12345");
        WebElement Subscribe=driver.findElement(By.name("newsletter"));
        Subscribe.click();
        WebElement PrivacyPolicy=driver.findElement(By.name("agree"));
        PrivacyPolicy.click();
        WebElement Continue=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();









    }

}




