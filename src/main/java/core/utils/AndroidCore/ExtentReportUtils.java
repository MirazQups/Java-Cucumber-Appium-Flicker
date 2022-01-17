package core.utils.AndroidCore;//package core.utils.AndroidCore;
//
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//import java.io.IOException;
//
//public class ExtentReportUtils {
//
//    public static ExtentReports extent;
//
//    public static ExtentTest scenarioDef;
//
//    public static ExtentTest features;
//
//    public static String reportLocation = "Reports/";
//
//    static String fileName = reportLocation + "extentreport.html";
//
//
//    public static void ExtentReport() {
//        //First is to create Extent Reports
//        extent = new ExtentReports();
//
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
//        htmlReporter.config().setTheme(Theme.DARK);
//        htmlReporter.config().setDocumentTitle("Foree Android Automation");
//        htmlReporter.config().setEncoding("utf-8");
//        htmlReporter.config().setReportName("Foree Android Automation");
//
//        extent.attachReporter(htmlReporter);
//
//    }
//
////    public void ExtentReportScreenshot() throws IOException {
////
////        var scr = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
////        Files.copy(scr.toPath(), new File(reportLocation + "screenshot.png").toPath());
////        scenarioDef.fail("details").addScreenCaptureFromPath(reportLocation + "screenshot.png");
////    }
//
//
//    public void FlushReport(){
//        extent.flush();
//    }
//
//}
