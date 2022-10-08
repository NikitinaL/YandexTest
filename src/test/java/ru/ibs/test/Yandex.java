package ru.ibs.test;

import org.junit.Test;
import ru.ibs.framework.pages.ElectronicaPage;
import ru.ibs.framework.pages.SearchPage;
import ru.ibs.framework.pages.StartPage;
import ru.ibs.framework.pages.TvPage;

public class Yandex extends BaseTests {

  StartPage startPage = new StartPage();
  ElectronicaPage electronicaPage = new ElectronicaPage();
  TvPage tvPage = new TvPage();
  SearchPage searchPage = new SearchPage();

  @Test
  public void test() {

    //Выбрать раздел Электроника
    startPage.MarketElectronica();

    //Выбрать раздел Телевизоры
    electronicaPage.MarketTV();

    //Зайти в расширенный поиск
    tvPage.SearchTv();

    //Задать параметр поиска по цене от 20000 рублей
    //Выбрать производителей Samsung и LG
    // Нажать кнопку "Показать <найденное количество> предложений"
    searchPage.ParamSearchTv();

    //Проверить, что элементов на странице 12 (настройка в конце списка)
    //не понятно что проверить

    //Запомнить первый элемент в списке
    //какой элемент? что это за список?

    //В поисковую строку ввести запомненное значение

    //Найти и проверить, что наименование товара соответствует запомненному значению

    //Сценарий 2
    //Выбрать раздел Электроника
    startPage.MarketElectronica();

    //Выбрать раздел Наушники и аудиотехника
    //Выбрать Наушники и Bluetooth-гарнитуры
    electronicaPage.MarketTV();

    //Зайти в расширенный поиск
    tvPage.SearchTv();

    //Задать параметр поиска по цене от 5000 рублей
    //Выбрать производителя JBL
    //Нажать кнопку "Показать <найденное количество> предложений"
    searchPage.ParamSearchEarPods();


    //Проверить, что элементов на странице 12 (настройка в конце списка)
    //не понятно что проверить

    //Запомнить первый элемент в списке
    //какой элемент? что это за список?

    //В поисковую строку ввести запомненное значение

    //Найти и проверить, что наименование товара соответствует запомненному значению


  }


}
