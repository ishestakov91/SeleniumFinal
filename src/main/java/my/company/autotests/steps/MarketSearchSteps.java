package my.company.autotests.steps;

import cucumber.api.java.it.Ma;
import my.company.autotests.pages.MarketGoodsPage;
import my.company.autotests.pages.MarketSearchPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSearchSteps {

    @Step("Проверить, что наименование товара соответствует запомненному значению")
    public void checkSearchValue() {
        new MarketSearchPage().checkFirstElementValue();
    }

    @Step("Ждать")
    public void waitALittle(int ms) throws Exception {
        new MarketGoodsPage().wait(ms);
    }

}


