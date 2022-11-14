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

  @И("Задать параметры поиска производителя {string}")
  public void Задать_параметры_поиска (String string) {
    pageManager.getSearchPage().selectCheckboxByText(string);
  }


  @И("Получить результат")
  public void showResult() {
    pageManager.getSearchPage().showResult();
  }

}
