package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormAutomationPraticePage extends BasePage{

    public LoginFormAutomationPraticePage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormAutomationPraticePage digitarEmailAddress (String login) {
        navegador.findElement(By.id("email")).sendKeys(login);
        return this;
    }

    public LoginFormAutomationPraticePage digitarPassword (String password) {
        navegador.findElement(By.id("passwd")).sendKeys(password);
        return this;
    }

    public MyAccountPage clicarSignIn () {
        navegador.findElement(By.id("SubmitLogin")).click();
        return new MyAccountPage (navegador);
    }
}
