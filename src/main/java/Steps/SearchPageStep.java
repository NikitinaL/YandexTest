package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class SearchPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Задать параметры поиска для TV: диапазон цен и производитель")
  public void ParamSearchTv(){
    pageManager.getSearchPage().ParamSearchTv();
  }

  @И("Задать параметры поиска для наушников: диапазон цен и производитель")
  public void ParamSearchEarPods(){
    pageManager.getSearchPage().ParamSearchEarPods();
  }
}
