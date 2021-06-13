package my.company.autotests.pages;

import my.company.autotests.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketCatalogPage extends BasePage {

    @FindBy(xpath = "//a[text()='Телевизоры']")
    public WebElement menuTelevision;

    @FindBy(xpath = "//a[text()='Наушники и Bluetooth-гарнитуры']")
    public WebElement menuHeadphones;

    public MarketCatalogPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuTelevision(){
        menuTelevision.click();
    }

    public void selectMenuHeadphones(){
        menuHeadphones.click();
    }
}