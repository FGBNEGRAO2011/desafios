package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAutomationPraticePage extends BasePage {
    public LoginAutomationPraticePage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormAutomationPraticePage clicarSignIn () {
        navegador.findElement(By.xpath("//div[@class=\"header_user_info\"]//a[@title=\"Log in to your customer account\"]")).click();
        return new LoginFormAutomationPraticePage (navegador);
    }
}
