#language: ru

Функционал: ЯндексМаркет

  Сценарий: Сценарий #1

    Когда Переход в Яндекс Маркет
    Когда Выбрана категория Электроника
    Когда Выбран раздел Телевизоры
    Когда Задать параметр поиска от 20000 рублей
    Когда Выбрать производителей Samsung и LG
    Тогда Проверить количество элементов на странице
    Тогда Ждать
    Тогда Запомнить первый элемент в списке
    Когда В поисковую строку ввести запомненное значение
    Тогда Найти
    Тогда Ждать
    Тогда Проверить, что наименование товара соответствует запомненному значению


  Сценарий: Сценарий #2

    Когда Переход в Яндекс Маркет
    Когда Выбрана категория Электроника
    Когда Выбран раздел Наушники
    Когда Задать параметр поиска от 5000 рублей
    Когда Выбрать производителя Beats
    Тогда Проверить количество элементов на странице
    Тогда Ждать
    Тогда Запомнить первый элемент в списке
    Когда В поисковую строку ввести запомненное значение
    Тогда Найти
    Тогда Ждать
    Тогда Проверить, что наименование товара соответствует запомненному значению
    