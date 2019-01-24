package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage extends BasePage {
    public OrderSummaryPage(WebDriver navegador) {
        super(navegador);
    }

    public  OrderConfirmation clicarIConfirmMyOrder () {
        navegador.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        String mensagemOrdemComplete = navegador.findElement(By.xpath(" //*[@id=\"center_column\"]/div/p/strong")).getText();
        Assert.assertEquals( "Your order on My Store is complete.", mensagemOrdemComplete);
        return new OrderConfirmation (navegador);
    }
}
