package ru.ibs.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage {
  public void firstElement() {
    WebElement firstElement = driverManager.getDriver().findElement(By.xpath("(//h3/a)[1]"));
    waitUtilElementToBeClickable(firstElement);
    ((JavascriptExecutor) driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()", firstElement);
    firstElement.getText();
    WebElement inputFirstElement = driverManager.getDriver().findElement(By.xpath("//input[@placeholder='Искать товары']"));
    inputFirstElement.sendKeys(firstElement.getText());
    WebElement naitFirstElement = driverManager.getDriver().findElement(By.xpath("//span[contains (text(), 'Найти')]"));
    waitUtilElementToBeClickable(naitFirstElement);
    WebElement firstElement2 = driverManager.getDriver().findElement(By.xpath("(//h3/a)[1]"));
    Assert.assertEquals(firstElement.getText(),firstElement2.getText());
  }
}
