package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class TvPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Расширенный поиск")
  public void SearchTv(){
    pageManager.getTvPage().SearchTv();
  }
}
