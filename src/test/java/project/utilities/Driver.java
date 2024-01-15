package project.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver = null;
        }
    }
    //java -jar selenium-server-<4.16.1>.jar standalone
//    java -jar selenium-server-<4.11.0>.jar standalone
}
/*
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driverThreadLocal.get() == null) {
            initializeDriver();
        }
        return driverThreadLocal.get();
    }

    private static void initializeDriver() {
        WebDriver driver;
        switch (ConfigReader.getProperty("browser")) {
            case "edge":
                // Yüklemeniz gereken EdgeDriver'ın sürümüne göre uygun yolu belirtin
//                System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case "firefox":
                // Yüklemeniz gereken FirefoxDriver'ın sürümüne göre uygun yolu belirtin
//                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                // Yüklemeniz gereken ChromeDriver'ın sürümüne göre uygun yolu belirtin
//                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
                driver = new ChromeDriver();
        }

        driverThreadLocal.set(driver);

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public static void closeDriver() {
        if (driverThreadLocal.get() != null) {
            getDriver().close();
            driverThreadLocal.remove(); // ThreadLocal değerini temizle
        }
    }

    public static void quitDriver() {
        if (driverThreadLocal.get() != null) {
            getDriver().quit();
            driverThreadLocal.remove(); // ThreadLocal değerini temizle
        }
    }
}*/
///////////////////SeleniumGrid icin Cross Browser
//Birde Trivagonun altinsa selenium server diye dosya acip serverleri kaydet
//Chrome driver,geckodriver,msedgedriver
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//
//import java.time.Duration;
//
//public class Driver {
//
//    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
//
//    public static WebDriver getDriver() {
//        if (driverThreadLocal.get() == null) {
//            initializeDriver();
//        }
//        return driverThreadLocal.get();
//    }
//
//    private static void initializeDriver() {
//        WebDriver driver;
//        switch (ConfigReader.getProperty("browser")) {
//            case "edge":
//                driver = new EdgeDriver();
//                break;
//            case "firefox":
//                driver = new FirefoxDriver();
//                break;
//            default:
//                driver = new ChromeDriver();
//        }
//
//        driverThreadLocal.set(driver);
//
//        getDriver().manage().window().maximize();
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//    }
//
//    public static void closeDriver() {
//        if (driverThreadLocal.get() != null) {
//            getDriver().close();
//            driverThreadLocal.remove();
//        }
//    }
//
//    public static void quitDriver() {
//        if (driverThreadLocal.get() != null) {
//            getDriver().quit();
//            driverThreadLocal.remove();
//        }
//    }
//}
