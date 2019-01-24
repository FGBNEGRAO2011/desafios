package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrincipalPage extends BasePage{
    public PrincipalPage(WebDriver navegador) {
        super(navegador);
    }

    public MyAddressPage clicarProceedToCheckout () {
        navegador.findElement(By.linkText("Proceed to checkout")).click();
        return new MyAddressPage (navegador);
    }
}
