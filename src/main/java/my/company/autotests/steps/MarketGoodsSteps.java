package my.company.autotests.steps;

import my.company.autotests.pages.MarketGoodsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketGoodsSteps {

    @Step("Задать параметр поиска в рублях от")
    public void fillPriceFrom(String price) {
        new MarketGoodsPage().fillPriceFrom(price);
    }

    @Step("Выбрать производителей Samsung и LG")
    public void selectBrands() {
        MarketGoodsPage page = new MarketGoodsPage();
        page.clickBrandSamsung();
        page.clickBrandLG();
    }

    @Step("Проверить количество элементов на странице")
    public void checkCountOfElements() {
        new MarketGoodsPage().checkCount();
    }

    @Step("Запомнить первый элемент в списке")
    public void saveElementText() {
        new MarketGoodsPage().saveElementText();
    }

    @Step("В поисковую строку ввести запомненное значение")
    public void fillSearchBar() {
        new MarketGoodsPage().fillSearchBar();
    }

    @Step("Найти")
    public void setSearchButtonClick() {
        new MarketGoodsPage().searchButtonClick();
    }

    @Step("Выбрать производителя Beats")
    public void selectBeats() {
        new MarketGoodsPage().clickBeats();
    }

}