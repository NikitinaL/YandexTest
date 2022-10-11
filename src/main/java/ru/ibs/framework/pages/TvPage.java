package ru.ibs.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvPage extends BasePage {

  @FindBy(xpath = "//a[@data-auto='allFiltersButton']")
  private WebElement SearchTvButton;

  public void SearchTv() {

    waitUtilElementToBeClickable(SearchTvButton);
    SearchTvButton.click();
  }
}
