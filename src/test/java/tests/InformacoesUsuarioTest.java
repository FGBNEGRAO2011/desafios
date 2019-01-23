package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Generator;
import suporte.Screenshot;

import javax.lang.model.element.Name;
import java.util.concurrent.TimeUnit;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioTest.csv")

public class InformacoesUsuarioTest {
    private WebDriver navegador;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp () {
        // Clicar no link que possui "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

        // Clicar no campo com nome login que esta  dentro do formulario de id "signinbox"
        //navegador).findElementById("signupbox");
        // Na verdade não precisa clicar, pode digitar direto

        // Identificando o formulario de login
        WebElement formularioSingInBox = navegador.findElement(By.id("signinbox"));

        // Digitar no campo com nome login que esta no formulario  "signinbox" o texto "julio0001"
        formularioSingInBox.findElement(By.name("login")).sendKeys("julio0001");

        // Digitar no campo com nome password que esta no formulario  "signinbox" o texto "123456"
        formularioSingInBox.findElement(By.name("password")).sendKeys("123456");

        // Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        // Validar que dentro do elemento com classe "me' esta o texto "Hi, Julio"
        //WebElement me = navegador.findElement(By.className("me"));
        //String textNoElementMe = me.getText();
        //Assert.assertEquals("Hi, Julio"  , textNoElementMe);

        // Clicar no link que possui a classe "me'
        navegador.findElement(By.className("me")).click();

        // Clicar no link que possui texto "MORE DATA ABOUT YOU"
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
   }

    @Test
    public void testAdicionarUmaInformacaoUsuario (@Param(name = "tipo") String tipo, @Param(name="contato") String contato, @Param(name = "mensagem") String mensagemEsperada) {

        // Clicar no botao atraves do seu xpath //button[@data-target="addmoredata"]
        navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        // Identificar o popup onde esta o formulario de id addmoredata
        WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

        // No combo de nome "type" escolher  a opção "Phone"
        WebElement campoType = navegador.findElement(By.name("type"));
        new Select(campoType).selectByVisibleText(tipo);

        // No campo de nome "contact" digitar "+55519898988"
        popupAddMoreData.findElement(By.name("contact")).sendKeys(contato);

        // Clicar no link "SAVE" que esta no popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        // Na mensagem de id "toast-container" validar que o texto é "Your contact has been added!"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();
        Assert.assertEquals(mensagemEsperada, mensagem);
    }
    @Test
    public void removerUmContaToDoUsuario() {
        // Clicar no elemento  pelo seu xpath //span[text()="+551199900000"]/following-sibling::a
        navegador.findElement(By.xpath("//span[text()=\"+551199900000\"]/following-sibling::a")).click();

        // Confirmar a janela javascript
        navegador.switchTo().alert().accept();

        // Validar que a mensagem apresentada foi Rest in peace, dear phone!
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();
        Assert.assertEquals("Rest in peace, dear phone!", mensagem);

        String screenshotArquivo = "C:\\Users\\fabiob\\test-reports\\" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.tirar(navegador, screenshotArquivo);

        // Aguardar ate 10 segundos para que a janela desapareça
        WebDriverWait aguardar =  new WebDriverWait(navegador, 10);
        aguardar.until(ExpectedConditions.stalenessOf(mensagemPop));

        // Clicar no link com texto "Logout"
        navegador.findElement(By.linkText("Logout")).click();
    }
    @After
    public void tearDown () {
        // Fechar o navegador
      navegador.close();
    }
}
