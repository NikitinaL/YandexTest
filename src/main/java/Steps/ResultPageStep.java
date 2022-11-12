package Steps;

import io.cucumber.java.ru.И;
import managers.PageManager;

public class ResultPageStep {
  PageManager pageManager = PageManager.getPageManager();

  @И("В поисковую строку ввести запомненное значение, сравнить результат")
  public void firstElement() {
    pageManager.getResultPage().firstElement();
  }
}
