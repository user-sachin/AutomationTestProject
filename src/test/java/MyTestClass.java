import org.junit.*;

public class MyTestClass {

    @BeforeClass
    public static void init(){
        System.out.println("Init");
    }

    @Before
    public void setUp(){
        System.out.println("Set Up");
    }

    @Test
    public void testOne(){
        System.out.println("First Test");
    }

    @After
    public void tearDown(){
        System.out.println("Tear Down");
    }

    @AfterClass
    public static void terminate(){
        System.out.println("Termination");
    }

}
