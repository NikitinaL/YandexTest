package ru.ibs.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage {

  @FindBy(xpath = "//*[@id='search-filters']")
  private WebElement searchFilters;

  public void searchFilters (){
    waitUtilElementToBeClickable(searchFilters);
    searchFilters.click();
  }

  @FindBy(xpath = "//input[@placeholder='7307']")
  private WebElement inputPriceButton;

  @FindBy(xpath = "//div[@data-tid='177f686 ace6a94']")
  private List<WebElement> selectCheckbox;


//  @FindBy(xpath = "//label[@id='153061']")
//  private WebElement SamsungButton;

//  @FindBy(xpath = "//*[@id='153074']")
//  private WebElement LGButton;

  @FindBy(xpath = "//a[contains (text(), 'Показать')]")
  private WebElement NaidennoeButton;

  @FindBy(xpath = "//input[@placeholder='60']")
  private WebElement inputEarPriceButton;

//  @FindBy(xpath = "//*[@id='152794']")
//  private WebElement JBLButton;

  public void paramSearchTv() {
    waitUtilElementToBeClickable(inputPriceButton);
    inputPriceButton.sendKeys("20000");
    //waitUtilElementToBeClickable(SamsungButton);
//    ((JavascriptExecutor)driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()",SamsungButton);
//    SamsungButton.click();
    //waitUtilElementToBeClickable(LGButton);
//    ((JavascriptExecutor)driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()",LGButton);
//    LGButton.click();

  }

  public void paramSearchEarPods() {
    waitUtilElementToBeClickable(inputEarPriceButton);
    inputEarPriceButton.sendKeys("5000");
//    ((JavascriptExecutor)driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()",JBLButton);
//    JBLButton.click();

  }

  public void selectCheckboxByText(String Name){
    for (WebElement itemMenu : selectCheckbox){
      if (itemMenu.getText().contains(Name)){
        itemMenu.click();
      } return;
    }
    Assert.fail("Производитель" + selectCheckbox + "не найден на странице");
  }

  public void showResult(){
    waitUtilElementToBeClickable(NaidennoeButton);
    NaidennoeButton.click();
  }

}
