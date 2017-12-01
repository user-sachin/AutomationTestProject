import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {


    @FindBy(css="#email")
    private WebElement email;

    @FindBy(css="#password")
    private WebElement password;

    @FindBy(css="#social--signup--submit")
    public WebElement signInBtn;


    public void setEmail(String newEmail){

        email.sendKeys(newEmail);

    }

    public void setPassword(String newPassword){

        password.sendKeys(newPassword);

    }

}
