package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginAutomationPraticePage;
import suporte.Web;

public class AutomationPracticePageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChromeAutomationPrice();
    }

    @Test
    public void testAutomationPrice () {
        new LoginAutomationPraticePage(navegador).clicarSignIn()
                .digitarEmailAddress("fabio.bapt@outlook.com")
                .digitarPassword("fscb2008")
                .clicarSignIn()
                .clicarHome()
                .clicarProduct()
                .clicarAddToCart()
                .clicarProceedToCheckout()
                .clicarProceedToCheckoutAddress()
                .clicarProceedToChekoutShipping()
                .clicarTermsOfService()
                .clicarPayment()
                .clicarIConfirmMyOrder();

    }

    @After
    public void tearDown() {
    //    navegador.quit();
    }

}
