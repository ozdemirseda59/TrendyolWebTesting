package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) { super(driver); }

    //*********Web Elements*********
    By emailBy =  By.id("login-email");
    By passwordBy=By.id("login-password-input");
    By loginButtonBy=By.xpath(".//div[@class='forgot-password']/following-sibling::button");

    //*********Page Methods*********

    //Enter login info and click login button
    public void loginToTrendyol () throws Exception {
        sendText(emailBy,email);
        sendText(passwordBy,password);
        waitAndClick(loginButtonBy);
        checkForUrlContains("butik/liste/");
    }
}
