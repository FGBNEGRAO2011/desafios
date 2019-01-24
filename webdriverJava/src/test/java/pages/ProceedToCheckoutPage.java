package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckoutPage extends BasePage{
    public ProceedToCheckoutPage(WebDriver navegador) {
        super(navegador);
    }

    public ShoppingCartSummayPage clicarProceedToCheckout () {
        navegador.findElement(By.linkText("Proceed to checkout")).click();
        return new ShoppingCartSummayPage (navegador);
    }
}
