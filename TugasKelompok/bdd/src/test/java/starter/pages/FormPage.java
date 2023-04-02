package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class FormPage extends PageObject {

    private By usernameField() {
        return By.id("username");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginButton() {
        return By.className("radius");
    }

    private By titleSecureArea() {
        return By.className("icon-lock");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean validateOnSecureAreaPage() {
        return $(titleSecureArea()).isDisplayed();
    }
}
