package step_defination.Android;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;

import java.io.IOException;

public class AndroidSetup {

    public static String PLATFORM_VERSION;
    public static String UDID;
    public static String PORT;

    @Before
    public void BeforeLogging(Scenario scenario) throws IOException, InterruptedException {
        System.out.println("/*****************************************************************************************************/");
        System.out.println("/*****************************************************************************************************/");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("/*****************************************************************************************************/");
        System.out.println("Scenario Id :  - " + scenario.getId());
        System.out.println("/*****************************************************************************************************/");
        System.out.println("Scenario Tags :  - " + scenario.getSourceTagNames());
        System.out.println("/*****************************************************************************************************/");
//        if (myProp.getProperty("platformname").toString().equals("Android")) {
//            PORT = myProp.getProperty("appiumport");
//            StartAppiumServer(PORT);
//            androidDriver(PORT);
//        }
    }

//    @After
//    public  void after(Scenario scenario) throws IOException {
//        System.out.println("/------------------------------------------------------------------------------------------------------/");
//        System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
//        if (scenario.isFailed()) {
//            String rootDirectoryPath = System.getProperty("user.dir");
//            String directoryName = rootDirectoryPath+"/Images/"+ LocalDate.now().toString()+"/";
//            File directory = new File(directoryName);
//            if(!directory.exists())
//            {
//                directory.mkdir();
//            }
//            File screenshot = ((TakesScreenshot) AndroidDriverSetup.GetDriverWithNoReset()).getScreenshotAs(OutputType.FILE);
//
//            String filename= DateTime.now().toString()+scenario.getName()+scenario.getSourceTagNames();
//            String filePath = directory+"/"+ LocalTime.now().toString().replaceAll(":","")+scenario.getName()+".jpg";
//            File targetFile=new File(directory+"/"+ LocalTime.now().toString().replaceAll(":","")+scenario.getName()+".jpg");
//            FileUtils.copyFile(screenshot,targetFile);
//            Path content = Paths.get(filePath);
//            try (InputStream is = Files.newInputStream(content)) {
//                Allure.addAttachment("Failure",is);
//            }
//        }
//        System.out.println("/------------------------------------------------------------------------------------------------------/");
//        AndroidDriverSetup.GetDriverWithNoReset().hideKeyboard();
//    }


//    @When("^Install previous version of Foree App.$")
//    public void installPreviousForeeApp() throws InterruptedException, IOException {
//        String previousApp = "previousApk";
//        AndroidDriverSetup.StartDriverWithNoReset(UDID,PLATFORM_VERSION,PORT,previousApp);
//        AndroidDriverSetup.GetDriverWithNoReset().findElement(By.xpath("//*[@text='Foree Server Logging']")).click();
//        AndroidDriverSetup.GetDriverWithNoReset().findElement(By.id("android:id/button1")).click();
//    }
}
