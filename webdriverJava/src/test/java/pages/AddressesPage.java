package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressesPage extends BasePage {

    public AddressesPage(WebDriver navegador) {
        super(navegador);
    }

    public ShippingPage clicarProceedToChekoutShipping () {
        String enderecoDelivery = navegador.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[4]")).getText();
        String enderecoInvoice = navegador.findElement(By.xpath("//*[@id=\"address_invoice\"]/li[4]")).getText();
        Assert.assertEquals(enderecoDelivery, enderecoInvoice);

        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
        return new ShippingPage (navegador);
    }
}
