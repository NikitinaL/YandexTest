package ru.ibs.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {

  @FindBy(xpath = "//div[@data-baobab-name='all_filters_button']/a")
  private WebElement searchFilters;

  @FindBy(xpath = "(//div[@data-filter-id='glprice']//input)[1]")
  private WebElement inputPrice;

  @FindBy(xpath = "//div[@data-filter-id='7893318']/div/label/div")
  private List<WebElement> selectCheckbox;

  @FindBy(xpath = "//a[contains (text(), 'Показать')]")
  private WebElement naidennoeButton;

  public void searchFilters() {
    waitUtilElementToBeClickable(searchFilters);
    searchFilters.click();
  }

  public void inputPrice(String price) {
    waitUtilElementToBeClickable(inputPrice);
    inputPrice.sendKeys(price);
  }

  public void tvParams() {
    WebElement SamsungButton = driverManager.getDriver().findElement(By.xpath("//label[@id='153061']"));
    waitUtilElementToBeClickable(SamsungButton);
    ((JavascriptExecutor) driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()", SamsungButton);
    SamsungButton.click();
    WebElement LGButton = driverManager.getDriver().findElement(By.xpath("//*[@id='153074']/div"));
    waitUtilElementToBeClickable(SamsungButton);
    ((JavascriptExecutor) driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()", SamsungButton);
    LGButton.click();

//    for (WebElement itemMenu : selectCheckbox){
//      if (itemMenu.getText().contains(Name)){
//        itemMenu.click();
//        return;
//      }
//    }
//    Assert.fail("Производитель" + selectCheckbox + "не найден на странице");
  }

  public void earParams() {
    WebElement JBLButton = driverManager.getDriver().findElement(By.xpath("//*[@id='152794']"));
    waitUtilElementToBeClickable(JBLButton);
    ((JavascriptExecutor) driverManager.getDriver()).executeScript("arguments[0].scrollIntoView()", JBLButton);
    JBLButton.click();
  }

  public void showResult() {
    waitUtilElementToBeClickable(naidennoeButton);
    naidennoeButton.click();
  }

}
