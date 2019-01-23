package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage{

    public CreateAccountPage(WebDriver navegador) {
        super(navegador);
    }

    public CreateAccountPage ClicarBotaoHome (){
        // Create Account
        // No campo de id "e-mail_create" informar "fabiob@db.com.br"
        navegador.findElement(By.id("email_create")).sendKeys("fabiob@db.com.br");

        // Clicar no botão 'Create an account' da classe name 'Submit' do botão  com id  'SubmitCreate'
        navegador.findElement(By.xpath("//div[@class=\"submit\"]//button[@id=\"SubmitCreate\"]")).click();

        // Clicar no Title "Mr." através do id //div[@id="uniform-id_gender1"]
        navegador.findElement(By.id("uniform-id_gender1")).click();

        // No campo de id "customer_firstname"]  digitar "PAULO"
        navegador.findElement(By.id( "customer_firstname")).sendKeys("Paulo");

        // No campo de id "customer_lastname"]  digitar "SILVA"
        navegador.findElement(By.id( "customer_lastname")).sendKeys("Silva dos Santos");

        // No campo de id "passwd"  digitar "123456"
        navegador.findElement(By.id( "passwd")).sendKeys("123456");

        // No combo de nome "days" escolher  o indice "2"
        WebElement campoType = navegador.findElement(By.name("days"));
        new Select(campoType).selectByIndex(2);

        // No combo de nome "months" escolher  o indice "3"
        campoType = navegador.findElement(By.name("months"));
        new Select(campoType).selectByIndex(3);

        // No combo de nome "years" escolher  o indice "20"
        campoType = navegador.findElement(By.name("years"));
        new Select(campoType).selectByIndex(20);

        // No campo de id firstname  digitar "Paulo"
        navegador.findElement(By.id( "firstname")).sendKeys("Paulo");

        // No campo de id lastname  digitar "Silva dos Santos"
        navegador.findElement(By.id( "lastname")).sendKeys("Silva dos Santos");

        // No campo de id company  digitar "DBSERVER"
        navegador.findElement(By.id( "company")).sendKeys("DBSERVER");

        // No campo de id address1  digitar "Rua Jose Mountary 456"
        navegador.findElement(By.id( "address1")).sendKeys("Rua Jose Mountary 456");

        // No campo de id address2  digitar "Azenha"
        navegador.findElement(By.id( "address2")).sendKeys("Azenha");

        // No campo de id city  digitar "Porto Alegre"
        navegador.findElement(By.id( "city")).sendKeys("Porto Alegre");

        // No combo de nome "id_state" escolher  o indice "10"
        campoType = navegador.findElement(By.name("id_state"));
        new Select(campoType).selectByIndex(10);

        // No campo de id postcode  digitar "00000"
        navegador.findElement(By.id( "postcode")).sendKeys("00000");

        // No campo de id phone  digitar "5551989898"
        navegador.findElement(By.id( "phone")).sendKeys("5551989898");

        // No campo de id phone_mobile  digitar "55517777"
        navegador.findElement(By.id( "phone_mobile")).sendKeys("55517777");

        // Clicar no campo de id submitAccount
        navegador.findElement(By.id( "submitAccount")).click();
        return new CreateAccountPage (navegador);
    }
}
