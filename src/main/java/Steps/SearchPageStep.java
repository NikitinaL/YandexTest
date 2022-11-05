package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class SearchPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Применить расширенный фильтр")
  public void filter (){
    pageManager.getSearchPage().searchFilters();
  }

  @И("Установить цену ТВ от")
  public void paramSearchTv(){
    pageManager.getSearchPage().paramSearchTv();
  }

  @И("Задать параметры поиска ТВ {string}")
  public void Задать_параметры_поиска_ТВ(String string){
    pageManager.getSearchPage().selectCheckboxByText(string);
  }

  @И("Установить цену наушников от")
  public void paramSearchEarPods(){
    pageManager.getSearchPage().paramSearchEarPods();
  }

  @И("Задать параметры поиска наушников {string}")
  public void Задать_параметры_поиска_наушников (String string){
    pageManager.getSearchPage().selectCheckboxByText(string);
  }


  @И("Получить результат")
  public void showResult() {
    pageManager.getSearchPage().showResult();
  }

}
