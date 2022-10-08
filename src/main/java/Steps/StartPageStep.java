package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class StartPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Перейти в раздел Электроника")
  public void MarketElectronica(){
    pageManager.getStartPage().MarketElectronica();
  }
}
