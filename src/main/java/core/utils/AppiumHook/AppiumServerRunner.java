package core.utils.AppiumHook;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.ServerSocket;


public class AppiumServerRunner {

        public static WebDriver driver = null;
        private AppiumDriverLocalService service;
        private AppiumServiceBuilder builder;
        private DesiredCapabilities cap;

        public void startServer() {
            //Set Capabilities
            cap = new DesiredCapabilities();
            cap.setCapability("noReset", "false");

            //Build the Appium service
            builder = new AppiumServiceBuilder();
            builder.withIPAddress("0.0.0.0");
            builder.usingPort(4723);
            builder.withCapabilities(cap);
            builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
            builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
            //Start the server with the builder
            service = AppiumDriverLocalService.buildService(builder);
            service.start();
        }

    public void stopServer() {
            service.stop();
        }

        public boolean checkIfServerIsRunnning(int port) {
            boolean isServerRunning = false;
            ServerSocket serverSocket;
            try {
                serverSocket = new ServerSocket(port);
                serverSocket.close();
            } catch (IOException e) {
                //If control comes here, then it means that the port is in use
                isServerRunning = true;
            } finally {
                serverSocket = null;
            }
            return isServerRunning;
        }
    }
