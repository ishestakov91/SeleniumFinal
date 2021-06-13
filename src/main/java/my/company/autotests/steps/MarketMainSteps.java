package my.company.autotests.steps;

import my.company.autotests.pages.MarketMainPage;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;

public class MarketMainSteps {

    @Step("Переход в Яндекс Маркет")
    public void selectMenuMarket() throws Exception {
        MarketMainPage page = new MarketMainPage();
        page.selectMenuMarket();
        WebDriver driver = BaseSteps.getDriver();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    @Step("Выбрана категория Электроника")
    public void selectElectronics() {
        new MarketMainPage().selectMenuElectronics();
    }

}
