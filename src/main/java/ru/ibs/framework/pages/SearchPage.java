package ru.ibs.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

  @FindBy(xpath = "//input[@placeholder='470']")
  private WebElement inputPriceButton;

  @FindBy(xpath = "//*[@id='153061']/input")
  private WebElement SamsungButton;

  @FindBy(xpath = "//*[@id='153074']/input")
  private WebElement LGButton;

  @FindBy(xpath = "//a[@class='_2qvOO _3qN-v _1Rc6L']")
  private WebElement NaidennoeButton;


  @FindBy(xpath = "//input[@placeholder='631']")
  private WebElement inputEarPriceButton;

  @FindBy(xpath = "//*[@id='152794']/input")
  private WebElement JBLButton;

  public void ParamSearchTv() {

    waitUtilElementToBeClickable(inputPriceButton);

    inputPriceButton.sendKeys("20000");
    SamsungButton.click();
    LGButton.click();

    waitUtilElementToBeClickable(NaidennoeButton);
    NaidennoeButton.click();

  }

  public void ParamSearchEarPods() {

    waitUtilElementToBeClickable(inputEarPriceButton);
    inputEarPriceButton.sendKeys("5000");

    JBLButton.click();
    waitUtilElementToBeClickable(NaidennoeButton);
    NaidennoeButton.click();
  }

}
