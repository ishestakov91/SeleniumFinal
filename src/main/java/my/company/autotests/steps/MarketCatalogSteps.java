package my.company.autotests.steps;

import my.company.autotests.pages.MarketCatalogPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketCatalogSteps {

    @Step("Выбран раздел Телевизоры")
    public void selectTelevision() {
        new MarketCatalogPage().selectMenuTelevision();
    }

    @Step("Выбран раздел Наушники")
    public void selectHeadphones(){
        new MarketCatalogPage().selectMenuHeadphones();
    }


}
