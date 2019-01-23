package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddToCartPage extends BasePage{
    public AddToCartPage(WebDriver navegador) {
        super(navegador);
    }

    public ProceedToCheckoutPage clicarAddToCart () {
        navegador.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        return new ProceedToCheckoutPage (navegador);
    }
}
