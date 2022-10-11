package ru.ibs.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

  @FindBy(xpath = "//input[@placeholder='500']")
  private WebElement inputPriceButton;

  @FindBy(xpath = "//label[@id='153061']")
  private WebElement SamsungButton;

  @FindBy(xpath = "//*[@id='153074']")
  private WebElement LGButton;

  @FindBy(xpath = "//a[contains (text(), 'Показать')]")
  private WebElement NaidennoeButton;


  @FindBy(xpath = "//input[@placeholder='60']")
  private WebElement inputEarPriceButton;

  @FindBy(xpath = "//*[@id='152794']")
  private WebElement JBLButton;

  public void ParamSearchTv() {

    waitUtilElementToBeClickable(inputPriceButton);

    inputPriceButton.sendKeys("20000");
    //waitUtilElementToBeClickable(SamsungButton);
    ((JavascriptExecutor)driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()",SamsungButton);
    SamsungButton.click();
    //waitUtilElementToBeClickable(LGButton);
    ((JavascriptExecutor)driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()",LGButton);
    LGButton.click();

    waitUtilElementToBeClickable(NaidennoeButton);
    NaidennoeButton.click();

  }

  public void ParamSearchEarPods() {

    waitUtilElementToBeClickable(inputEarPriceButton);
    inputEarPriceButton.sendKeys("5000");
    ((JavascriptExecutor)driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()",JBLButton);
    JBLButton.click();
    waitUtilElementToBeClickable(NaidennoeButton);
    NaidennoeButton.click();
  }

}
