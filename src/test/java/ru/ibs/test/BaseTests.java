package ru.ibs.test;

import managers.DriverManager;
import managers.PageManager;
import managers.TestPropManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTests {
  private DriverManager driverManager= DriverManager.getINSTANCE();
  protected PageManager pageManager=PageManager.getINSTANCE();
  private TestPropManager propManager = TestPropManager.getINSTANCE();

  @Before

  public void before(){
    driverManager.getDriver().get(propManager.getProperty("HOSTNAME"));
  }


//  @After
//  public void after(){
//    driverManager.getDriver().quit();
//  }


}
