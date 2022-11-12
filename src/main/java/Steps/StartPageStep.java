package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class StartPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("Выполнен переход в каталог")
  public void selectCatalog() {
    pageManager.getStartPage().selectCatalog();
  }

  @И("Выполнить переход в раздел {string}")
  public void Выполнить_переход_в_раздел(String string) {
    pageManager.getStartPage().selectBaseMenuByText(string);
  }

  @И("Выполнить переход в подраздел {string}")
  public void Выполнить_переход_в_подраздел(String string) {
    pageManager.getStartPage().selectSubMenuByText(string);
  }


}
