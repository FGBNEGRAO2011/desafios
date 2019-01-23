package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver navegador) {
        super(navegador);
    }

    public OrderSummaryPage clicarPayment () {

        String totalProduto =navegador.findElement(By.id("total_product")).getText().substring(1);
        Float totalProdutoF = Float.parseFloat(totalProduto);

        String totalShipping = navegador.findElement(By.id("total_shipping")).getText().substring(1);
        Float totalShippingF = Float.parseFloat(totalShipping);

        String totalPrice  =navegador.findElement(By.id("total_price")).getText().substring(1);
        Float totalPriceF = Float.parseFloat(totalPrice);

        String totalTax  =navegador.findElement(By.id("total_tax")).getText().substring(1);
        Float totalTaxF = Float.parseFloat(totalTax);

        Float totalCompraF = totalProdutoF + totalShippingF + totalTaxF;
        Assert.assertEquals(totalCompraF,totalPriceF);

        navegador.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        return new  OrderSummaryPage (navegador);

    }
}
