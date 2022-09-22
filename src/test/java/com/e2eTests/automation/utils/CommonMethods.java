package com.e2eTests.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CommonMethods {
	
public static WebDriver driver;
public static Properties prop;
public CommonMethods() {
	driver = Setup.driver;
}

protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

public void openURLWithConfigFile(String url) throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream("src/test/resource/configs/config.properties");
	prop.load(fis);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty(url));
}

public void scrollOnPage() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("window.scrollBy(0, 2000)", "");
	
}
}