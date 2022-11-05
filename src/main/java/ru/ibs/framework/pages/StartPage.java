package ru.ibs.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StartPage extends BasePage {

  @FindBy (xpath = "//*[@id='catalogPopupButton']/span/div/span")
  private WebElement catalogButton;

  @FindBy (xpath = "//ul[@role='tablist' and contains(@data-tid, 'a051d6a8')]")
  private List<WebElement> baseMenu;

  @FindBy (xpath = "//div[@role='heading' and @aria-level='2' and contains(@data-tid, 'dc1558e0 4225d81f')]")
  private List<WebElement> subMenu;

//  @FindBy(xpath = "/html/body/div[4]/noindex[2]/div/div/div/nav/ul[1]/li[9]/div/div/a")
//  private WebElement electronicaButton;

  public void selectCatalog () {
    waitUtilElementToBeClickable(catalogButton);
    catalogButton.click();
  }

  /**
   * Клик по базовому меню каталога - меню выбирается по тексту переданному на вход функции
   * @param NameMenu - текст который будет передан
   */

  public void selectBaseMenuByText (String NameMenu) {
    for (WebElement itemMenu : baseMenu){
      if (itemMenu.getText().contains(NameMenu)){
        itemMenu.click();
      } return;
    }
    Assert.fail("Меню с текстом" + NameMenu + "не найдено на странице");
  }

  public void selectSubMenuByText (String NameSubMenu) {
    for (WebElement itemMenu : subMenu){
      if (itemMenu.getText().contains(NameSubMenu)){
        itemMenu.click();
      } return;
    }
    Assert.fail("Меню с текстом" + NameSubMenu + "не найдено на странице");
  }

}
