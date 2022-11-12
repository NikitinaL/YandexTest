package managers;

import ru.ibs.framework.pages.ResultPage;
import ru.ibs.framework.pages.SearchPage;
import ru.ibs.framework.pages.StartPage;

public class PageManager {
  private static PageManager pageManager;
  private static PageManager INSTANCE = null;

  private StartPage startPage;

  private SearchPage searchPage;

  private ResultPage resultPage;

  private PageManager(){

  }

  public static PageManager getINSTANCE() {
    if (INSTANCE == null) {
      INSTANCE = new PageManager();
    }
    return INSTANCE;
  }
  public static PageManager getPageManager() {
    if (pageManager == null) {
      pageManager = new PageManager();
    }
    return pageManager;
  }


  public StartPage getStartPage() {
    if (startPage == null) {
      startPage = new StartPage();
    }
    return startPage;
  }


  public SearchPage getSearchPage() {
    if (searchPage == null) {
      searchPage = new SearchPage();
    }
    return searchPage;
  }

  public ResultPage getResultPage() {
    if (resultPage == null) {
      resultPage = new ResultPage();
    }
    return resultPage;
  }
}

