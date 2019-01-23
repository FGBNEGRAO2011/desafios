package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver navegador) {
        super(navegador);
    }

    public HomePage clicarHome () {
        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
        return new HomePage (navegador);
    }

}
