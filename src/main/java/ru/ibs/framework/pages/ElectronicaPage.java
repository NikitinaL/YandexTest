package ru.ibs.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicaPage extends BasePage {


  @FindBy(xpath = "//a[@href='https://market.yandex.ru/catalog--televizory-i-aksessuary/26960170']")
  private WebElement TVandAkButton;

  @FindBy(xpath = "//a[@class='egKyN _2jA_3 _3a7xr'][contains (text(), 'Телевизоры')]")
  private WebElement TVButton;

  @FindBy(xpath = "//a[@href='https://market.yandex.ru/catalog--naushniki-i-audiotekhnika/26992071']")
  private WebElement EarPodsAudioButton;

  @FindBy(xpath = "//a[@href='/catalog--naushniki-i-bluetooth-garnitury/26992150/list?hid=90555']")
  private WebElement EarPodsButton;


  public void MarketTV() {
    waitUtilElementToBeClickable(TVandAkButton);
    TVandAkButton.click();
    waitUtilElementToBeClickable(TVButton);
    TVButton.click();
  }

  public void MarketEarPodsAudio() {
    waitUtilElementToBeClickable(EarPodsAudioButton);
    EarPodsAudioButton.click();
    waitUtilElementToBeClickable(EarPodsButton);
    EarPodsButton.click();

  }
}

