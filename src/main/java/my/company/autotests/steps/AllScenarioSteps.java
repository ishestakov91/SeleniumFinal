package my.company.autotests.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.company.autotests.pages.MarketSearchPage;

public class AllScenarioSteps {

    MarketMainSteps marketMainSteps = new MarketMainSteps();
    MarketCatalogSteps marketCatalogSteps = new MarketCatalogSteps();
    MarketGoodsSteps marketGoodsSteps = new MarketGoodsSteps();
    MarketSearchSteps marketSearchSteps = new MarketSearchSteps();


    @When("^Переход в Яндекс Маркет$")
    public void selectMenuMarket() throws Exception{
        marketMainSteps.selectMenuMarket();
    }

    @When("^Выбрана категория Электроника$")
    public void selectMenuItem() {
        marketMainSteps.selectElectronics();
    }

    @When("^Выбран раздел (.+)$")
    public void selectSection(String value) throws Throwable {
        switch (value) {
            case "Телевизоры":
                marketCatalogSteps.selectTelevision();
                break;
            case "Наушники":
                marketCatalogSteps.selectHeadphones();
                break;
        }

    }

    @When("^Задать параметр поиска от (.+) рублей$")
    public void fillPriceFrom(String value) throws Throwable {
        marketGoodsSteps.fillPriceFrom(value);
    }

    @When("^Выбрать производителя (.+)$")
    public void selectBrands(String value) throws Exception {
        switch (value) {
            case "Samsung и LG":
                marketGoodsSteps.selectBrands();
                break;
            case "Beats":
                marketGoodsSteps.selectBeats();
                break;
        }
    }

    @Then("^Проверить количество элементов на странице$")
    public void checkCountOfElements() {
        marketGoodsSteps.checkCountOfElements();
    }

    @Then("^Запомнить первый элемент в списке$")
    public void saveElementText() {
        marketGoodsSteps.saveElementText();
    }

    @When("^В поисковую строку ввести запомненное значение$")
    public void fillSearchBar() {
        marketGoodsSteps.fillSearchBar();
    }

    @Then("^Найти$")
    public void searchButtonClick() {
        marketGoodsSteps.setSearchButtonClick();
    }

    @Then("^Проверить, что наименование товара соответствует запомненному значению$")
    public void checkSearchValue() {
        marketSearchSteps.checkSearchValue();
    }

    @Then("^Ждать$")
    public void waitALittle() throws Exception {
        marketSearchSteps.waitALittle(5000);
    }


}









