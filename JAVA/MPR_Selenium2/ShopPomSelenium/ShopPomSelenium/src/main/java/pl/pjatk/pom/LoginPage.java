package pl.pjatk.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "email")
    private WebElement loginInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='center_column']/div[contains(@class, 'alert')]")
    private WebElement errorTextArea;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage unsuccesfulLogin(String email, String password) {
        login(email, password);
        return new LoginPage(driver);
    }

    private void login(String email, String password){
        loginInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public String getErrorMessage(){
        return errorTextArea.getText();
    }

    public UserPage successfulLogin(String email, String password) {
        login(email, password);
        return new UserPage(driver);
    }
}
