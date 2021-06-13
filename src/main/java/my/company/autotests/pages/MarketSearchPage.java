package my.company.autotests.pages;

import my.company.autotests.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MarketSearchPage extends BasePage {

    @FindBy(xpath = "//h3[@data-zone-name='title']")
    public List<WebElement> elements;

    public MarketSearchPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void checkFirstElementValue() {
        String searchValue = elements.get(0).getText();
        assertEquals(searchValue, MarketGoodsPage.firstElementText);
    }

}
