# language: ru
@withdrawal
Функция: Проверка корректности поиска  на Яндекс.Маркет

  @success
  Сценарий: Поиск телевизоров на Яндекс.Маркет
    Когда Выполнен переход в каталог
    Тогда Выполнить переход в раздел "Электроника"
    Затем Выполнить переход в подраздел "Телевизоры"
    Затем Применить расширенный фильтр
    Затем Установить цену от "20000"
    Затем Задать параметры поиска производителя "Samsung"
    Затем Задать параметры поиска производителя "LG"
    И Получить результат
    Затем В поисковую строку ввести запомненное значение, сравнить результат

  @success
  Сценарий: Поиск наушников на Яндекс.Маркет
    Когда Выполнен переход в каталог
    Тогда Выполнить переход в раздел "Электроника"
    Затем Выполнить переход в подраздел "Наушники и Bluetooth-гарнитуры"
    Затем Применить расширенный фильтр
    Затем Установить цену от "5000"
    Затем Задать параметры поиска производителя "JBL"
    И Получить результат
    Затем В поисковую строку ввести запомненное значение, сравнить результат
