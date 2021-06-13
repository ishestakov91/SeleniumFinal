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

    @When("^Выбран раздел Телевизоры$")
    public void selectTelevision() {
        marketCatalogSteps.selectTelevision();
    }

    @When("^Задать параметр поиска от 20000 рублей$")
    public void fillPriceFrom20000() {
        marketGoodsSteps.fillPriceFrom("20000");
    }

    @When("^Выбрать производителей Samsung и LG$")
    public void selectBrands() {
        marketGoodsSteps.selectBrands();
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


    @When("^Выбран раздел Наушники$")
    public void selectHeadphones() {
        marketCatalogSteps.selectHeadphones();
    }

    @When("^Задать параметр поиска от 5000 рублей$")
    public void fillPriceFrom5000() {
        marketGoodsSteps.fillPriceFrom("5000");
    }

    @When("^Выбрать производителя Beats$")
    public void selectBeats() {
        marketGoodsSteps.selectBeats();
    }

    @Then("^Ждать$")
    public void waitALittle() throws Exception {
        marketSearchSteps.waitALittle(5000);
    }


}









