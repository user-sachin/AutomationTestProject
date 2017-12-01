import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {


    @FindBy(css="#signin-email")
    private WebElement email;

    @FindBy(css="#signin-password")
    private WebElement password;

    @FindBy(css="#signInSubmit")
    public WebElement signInBtn;

    public void setEmail(String newEmail){

        email.sendKeys(newEmail);

    }

    public void setPassword(String newPassword){

        password.sendKeys(newPassword);

    }
}
