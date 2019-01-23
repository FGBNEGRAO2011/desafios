package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummayPage extends BasePage {
    public ShoppingCartSummayPage(WebDriver navegador) {
        super(navegador);
    }

    public AddressesPage clicarProceedToCheckoutAddress () {
        String descricaoCarrinho = navegador.findElement(By.xpath("//*[@id=\"product_1_1_0_135380\"]/td[2]/p/a")).getText();
        Assert.assertEquals("Faded Short Sleeve T-shirts", descricaoCarrinho);

        navegador.findElement(By.linkText("Proceed to checkout")).click();
        return new AddressesPage (navegador);
    }
}
