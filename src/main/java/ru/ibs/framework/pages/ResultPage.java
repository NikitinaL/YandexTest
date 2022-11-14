package ru.ibs.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

  @FindBy(xpath = "//input[@placeholder='Искать товары']")
  private WebElement poisktovary;

  @FindBy(xpath = "//span[contains (text(), 'Найти')]")
  private WebElement naitFirstElement;

  public void firstElement() {
    WebElement firstElement = driverManager.getDriver().findElement(By.xpath("(//h3/a)[1]"));
    waitUtilElementToBeClickable(firstElement);
    ((JavascriptExecutor) driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()", firstElement);
    String text = firstElement.getText();
    poisktovary.sendKeys(text);
    waitUtilElementToBeClickable(naitFirstElement);
    naitFirstElement.click();
    WebElement firstElement2 = driverManager.getDriver().findElement(By.xpath("(//h3/a)[1]"));
    waitUtilElementToBeClickable(firstElement2);
    ((JavascriptExecutor) driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()", firstElement2);
    String text2 = firstElement2.getText();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Assert.assertEquals(text, text2);
  }
}
