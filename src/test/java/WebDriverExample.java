import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.File;
import java.util.concurrent.TimeUnit;


public class WebDriverExample {

    private String url = "https://www.autotrader.co.uk";
    private static ExtentReports report;
    private WebDriver webDriver;

    @BeforeClass
    public static void init() {
        report = new ExtentReports();
        String fileName = "MyReport" + ".html";
        String filePath = System.getProperty("user.dir")
                + File.separatorChar + fileName;
        report.attachReporter(new ExtentHtmlReporter(filePath));
    }
    @Before
    public void setUp(){
        webDriver = new ChromeDriver();
    }
    @After
    public void tearDown(){
        webDriver.quit();
    }
    @AfterClass
    public static void cleanUp() {
        report.flush();
    }
    @Test
    public void testGitLogin(){

        ExtentTest test = report.createTest("Register");
        webDriver.navigate().to(url);
        SignUpPage signUpPage = PageFactory.initElements(webDriver, SignUpPage.class);
        test.log(Status.INFO, "Register");



//        WebElement signInButton = webDriver.findElement(By.cssSelector("#js-header-nav > ul > li.header__nav-listing.header__nav-my-at > div > a"));
//        signInButton.click();
//        WebElement signUpButton = webDriver.findElement(By.cssSelector("#js-social__signup-tab"));
//        signUpButton.click();
//        signUpPage.setEmail("dopiged@cobin2hood.com");
//        signUpPage.setPassword("Password123");
//        signUpPage.signInBtn.click();
//        WebElement accountButton = webDriver.findElement(By.cssSelector("#js-header-nav > ul > li.header__nav-listing.header__nav-my-at > a > svg > path"));
//        accountButton.click();
//        WebElement signOutButton = webDriver.findElement(By.cssSelector("#ursSignoutForm > button"));
//        signOutButton.click();


//        LogInPage logIn = PageFactory.initElements(webDriver, LogInPage.class);
//        logIn.setEmail("dopiged@cobin2hood.com");
//        logIn.setPassword("Password123");
//        logIn.signInBtn.click();



//        webDriver.navigate().to("https://www.autotrader.co.uk/contact-us");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement contactUsButton = webDriver.findElement(By.cssSelector("body > div.is-non-critical.o-clearfix.ov-pos-rel > footer > div > nav:nth-child(1) > section.footer__nav-corporate > ul > li.footer__nav-listing.footer__nav-listing--4 > a"));
        contactUsButton.click();
        WebElement complaintButton = webDriver.findElement(By.cssSelector("#js-contactus__page--options-complain > p.contactus__page--options-title.fs-24"));
        complaintButton.click();
        WebElement emailButton = webDriver.findElement(By.cssSelector("#js-contactus__page--getintouch-emailtab"));
        emailButton.click();
        MakeComplaint makeComplaint = PageFactory.initElements(webDriver, MakeComplaint.class);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        makeComplaint.setName("Namey Name");
        makeComplaint.setEmail("dopiged@cobin2hood.com");
        makeComplaint.setTelephone("02086698745");
        makeComplaint.setMessage("Meessage test");
        makeComplaint.sendButton.click();



//
//        WebElement result = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));

        //Assert.assertEquals("**Successful Login**", result.getText());

    }

}

















