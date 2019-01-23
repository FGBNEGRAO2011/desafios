package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public AddToCartPage clicarProduct () {
        // Seleciona 1 Produto
        navegador.findElement (By.linkText("Faded Short Sleeve T-shirts")).click();
        return new AddToCartPage (navegador);
    }
}
