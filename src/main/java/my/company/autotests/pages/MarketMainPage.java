package my.company.autotests.pages;

import my.company.autotests.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketMainPage extends BasePage {

    @FindBy(tagName = "body")
    public WebElement body;

    @FindBy(xpath = "//a[@data-id='market']")
    public WebElement menuMarket;

    @FindBy(xpath = "//span[text()='Электроника']")
    public WebElement menuElectronics;

    public MarketMainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuElectronics() {
        menuElectronics.click();
    }

    public void selectMenuMarket() {
        menuMarket.click();
    }

}
