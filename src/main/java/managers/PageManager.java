package managers;

import ru.ibs.framework.pages.ElectronicaPage;
import ru.ibs.framework.pages.SearchPage;
import ru.ibs.framework.pages.StartPage;
import ru.ibs.framework.pages.TvPage;

public class PageManager {
  private static PageManager pageManager;
  private static PageManager INSTANCE = null;

  private StartPage startPage;
  private ElectronicaPage electronicaPage;
  private TvPage tvPage;
  private SearchPage searchPage;

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
  public TvPage getTvPage() {
    if (tvPage == null) {
      tvPage = new TvPage();
    }
    return tvPage;
  }

  public StartPage getStartPage() {
    if (startPage == null) {
      startPage = new StartPage();
    }
    return startPage;
  }

  public ElectronicaPage getElectronicaPage() {
    if (electronicaPage == null) {
      electronicaPage = new ElectronicaPage();
    }
    return electronicaPage;
  }
  public SearchPage getSearchPage() {
    if (searchPage == null) {
      searchPage = new SearchPage();
    }
    return searchPage;
  }
}

