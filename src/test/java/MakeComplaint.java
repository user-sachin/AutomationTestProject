import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeComplaint {


    @FindBy(css="#name")
    private WebElement name;

    @FindBy(css="#email")
    private WebElement email;

    @FindBy(css="#telephone")
    public WebElement telephone;

    @FindBy(css="#js-contactus__page--contact-lightbox-select")
    private WebElement selectComplaint;

    @FindBy(css="#js-contactus__page--email-form > div:nth-child(5) > textarea")
    public WebElement message;


    @FindBy(css="#js-contactus__page--sendemail")
    public WebElement sendButton;


    public void setName(String newName){
        name.sendKeys(newName);
    }

    public void setEmail(String newEmail){
        email.sendKeys(newEmail);
    }

    public void setTelephone(String newTelephone){
        telephone.sendKeys(newTelephone);
    }

    public void setMessage(String newMessage){
        message.sendKeys(newMessage);
    }



}
