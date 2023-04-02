package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject{

    private By title(){
        return By.className("heading");
    }

    private By formLogin(){
        return By.cssSelector("a[href*='/login']");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnHomePage() {
        return $(title()).isDisplayed();
    }

    @Step
    public void clickFormAuth(){
        $(formLogin()).click();
    }
}
