package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class ElectronicaPageStep {

  PageManager pageManager = PageManager.getPageManager();

  @И("Выбрать раздел Телевизоры")
  public void MarketTV(){
    pageManager.getElectronicaPage().MarketTV();
  }

  @И("Выбрать раздел Наушники")
  public void MarketEarPodsAudio(){
    pageManager.getElectronicaPage().MarketEarPodsAudio();
  }


}
