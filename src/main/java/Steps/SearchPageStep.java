package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class SearchPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Применить расширенный фильтр")
  public void filter() {
    pageManager.getSearchPage().searchFilters();
  }

  @И("Установить цену от {string}")
  public void inputPrice(String string) {
    pageManager.getSearchPage().inputPrice(string);
  }

  @И("Задать параметры поиска ТВ")
  public void Задать_параметры_поиска_ТВ() {
    pageManager.getSearchPage().tvParams();
  }

  @И("Задать параметры поиска наушников")
  public void Задать_параметры_поиска_наушников() {
    pageManager.getSearchPage().earParams();
  }

  @И("Получить результат")
  public void showResult() {
    pageManager.getSearchPage().showResult();
  }

}
