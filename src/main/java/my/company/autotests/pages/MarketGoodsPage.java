package my.company.autotests.pages;

import my.company.autotests.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MarketGoodsPage extends BasePage {

    public static String firstElementText;

    @FindBy(xpath = "//input[@name='Цена от']")
    public WebElement priceFrom;

    @FindBy(xpath = "//span[text()='Samsung']")
    public WebElement brandSamsung;

    @FindBy(xpath = "//span[text()='LG']")
    public WebElement brandLG;

    @FindBy(xpath = "//span[text()='Beats']")
    public WebElement brandBeats;

    @FindBy(xpath = "//h3[@data-zone-name='title']")
    public List<WebElement> elements;

    @FindBy(id = "header-search")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@data-r='search-button']")
    public WebElement searchButton;

    public MarketGoodsPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillPriceFrom(String price){
        fillField(priceFrom,price);
    }

    public void clickBrandSamsung(){
        brandSamsung.click();
    }

    public void clickBrandLG(){
        brandLG.click();
    }

    public void clickBeats(){
        brandBeats.click();
    }

    public void checkCount() {
        int number = 48;
        int count = elements.size();
        assertEquals(number, count);
    }

    public void saveElementText() {
        firstElementText = elements.get(0).getText();
    }

    public void fillSearchBar() {
        fillField(searchBar,firstElementText);
    }

    public void searchButtonClick() {
        searchButton.click();
    }

}