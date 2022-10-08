package ru.ibs.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

  @FindBy(xpath = "/html/body/div[4]/noindex[2]/div/div/div/nav/ul[1]/li[9]/div/div/a")
  private WebElement electronicaButton;


  public void MarketElectronica() {
    waitUtilElementToBeClickable(electronicaButton);
    electronicaButton.click();

  }
}
