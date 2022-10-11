package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class StartPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Выполнен переход в раздел Электроника")
  public void MarketElectronica(){
    pageManager.getStartPage().MarketElectronica();
  }
}
