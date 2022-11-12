package ru.ibs.test;

import managers.DriverManager;
import managers.PageManager;
import managers.TestPropManager;
import org.junit.Before;

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
