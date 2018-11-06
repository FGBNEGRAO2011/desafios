package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Web;

import java.util.concurrent.TimeUnit;

public class AutomationPriceTest {
    private WebDriver navegador;

    @Before
    public void setup() {
        navegador = Web.createChromeAutomationPrice();
    }

    @Test
    public void testAutomationPrice () {

        // Clicar no link Sign in através do seu xpath "//div[@class="header_user_info"]//a[@title="Log in to your customer account"]"
        navegador.findElement(By.xpath("//div[@class=\"header_user_info\"]//a[@title=\"Log in to your customer account\"]")).click();

        // Already Registered
        // No campo de id "email"  informar "fabio.bapt@outlook.com"
        navegador.findElement(By.id("email")).sendKeys("fabio.bapt@outlook.com");

        // No campo de id "passwd"  informar "fscb2008"
        navegador.findElement(By.id("passwd")).sendKeys("fscb2008");

        // Clicar no campo de id "SubmitLogin"
        navegador.findElement(By.id("SubmitLogin")).click();

        // Home
         //Clicar no link 'Home' pelo xpath //*[@id="center_column"]/ul/li/a/span
        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();

        // Seleciona 1 Produto - este func
        // navegador.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")).click();
        navegador.findElement (By.linkText("Faded Short Sleeve T-shirts")).click();

        // Clicar add to cart
        navegador.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

        // Clicar no link Proceed to checkout
        navegador.findElement(By.linkText("Proceed to checkout")).click();

        // Guardar descrição do Produto 01 no carrinho atraves do seu xpath //*[@id="product_1_1_0_110115"]/td[2]/p/a
        String descricaoCarrinho = navegador.findElement(By.xpath("//*[@id=\"product_1_1_0_110115\"]/td[2]/p/a")).getText();
        System.out.println("Descricao Item carrinho: "  + descricaoCarrinho);

        // Validar se o produto do carrinho tem a mesma descrição do produto selecionado
        Assert.assertEquals("Faded Short Sleeve T-shirts", descricaoCarrinho);

        // Recuperar endereço (Delivery Address) atraves do seu xpath //*[@id="center_column"]/div[3]/div[1]/ul/li[4]/span
        String enderecoDelivery = navegador.findElement(By.xpath("//*[@id=\"center_column\"]/div[3]/div[1]/ul/li[4]/span")).getText();

        // Recuperar endereço (Invoice Address) atraves do seu xpath //*[@id="center_column"]/div[3]/div[2]/ul/li[4]/span
        String enderecoInvoice = navegador.findElement(By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/ul/li[4]/span")).getText();
        System.out.println("Ender Invoice "  + enderecoInvoice);

        // Validar se os endereços Delivery e Invoice estão iguais
        Assert.assertEquals(enderecoDelivery, enderecoInvoice);

        navegador.findElement(By.linkText("Proceed to checkout")).click();

        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();

        // Clicar no campo de id "cgv"
        navegador.findElement(By.id("cgv")).click();

        // Clicar no campo de id "order"
        navegador.findElement(By.id("order")).click();

        // Clicar no campo "Proceed to checkout" atraves de seu xpath //*[@id="form"]/p/button/span
        navegador.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();

        // Recuperar total da compra no campo id //*[@id="total_product"]
        String totalProduto =navegador.findElement(By.id("total_product")).getText().substring(1);
        Float totalProdutoF = Float.parseFloat(totalProduto);

        // Recuperar total shipping no campo id //*[@id="total_shipping"]
        String totalShipping = navegador.findElement(By.id("total_shipping")).getText().substring(1);
        Float totalShippingF = Float.parseFloat(totalShipping);

        // Recuperar total no campo id //*[@id="total_price"]
        String totalPrice  =navegador.findElement(By.id("total_price")).getText().substring(1);
        Float totalPriceF = Float.parseFloat(totalPrice);

        // Somatorio Total Products + Total Shipping
        Float totalCompraF = totalProdutoF + totalShippingF;

        System.out.println("Total Products: "  + totalProdutoF);
        System.out.println("Total Shipping: "  + totalShippingF);
        System.out.println("Somatório Total Products e Total Shipping: "  + totalCompraF);
       // System.out.println("Total da Compra: "  +  totalPriceF);

        // Validar se Total Products +  Total Shipping bate com Total
        Assert.assertEquals(totalCompraF,totalPriceF);

        // Clicar no campo de id "module-bankwire-payment"
        // //*[@id="HOOK_PAYMENT"]/div[1]/div/p/a
        navegador.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();

        // Clicar  xpath //*[@id="cart_navigation"]/button/span
        navegador.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();

        // Validar a mensagem "Your order on My Store is complete." atraves do seu xpath //*[@id="center_column"]/div/p/strong
        String mensagemOrdemComplete = navegador.findElement(By.xpath(" //*[@id=\"center_column\"]/div/p/strong")).getText();
        Assert.assertEquals( "Your order on My Store is complete.", mensagemOrdemComplete);

    }
    @After
    public void tearDown () {
        // Fechar o navegador
      //  navegador.close();
    }
}
