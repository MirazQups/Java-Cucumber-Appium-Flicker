

import com.aventstack.extentreports.ExtentReports;
import core.utils.EmailSender.EmailUtil;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/bykea/android/BykeaCashReceive.feature"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:Reports/cucumber-report/Cucumber.json"},
        monochrome = true,
        tags = {"@android"})

public class RunnerTest {

    @BeforeClass
    public static void PathFolderCreation() {
        DateFormat timeFormat = new SimpleDateFormat("HH.mm.ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Calendar cal = Calendar.getInstance();
        ExtentReports extent;
        String Path = "./ExtentReport.html";
        System.out.println(Path);
        extent = new ExtentReports();

    }

    @AfterClass
    public static void ExtentXmlReader() throws IOException, InterruptedException {
        EmailUtil.Email();
    }

}