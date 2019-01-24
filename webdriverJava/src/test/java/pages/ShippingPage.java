package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage extends BasePage{
    public ShippingPage(WebDriver navegador) {
        super(navegador);
    }

    public PaymentPage clicarTermsOfService () {
        navegador.findElement(By.id("cgv")).click();
        navegador.findElement(By.id("order")).click();
        navegador.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
        return new PaymentPage (navegador);

    }
}
