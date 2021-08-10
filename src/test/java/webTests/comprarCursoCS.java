package webTests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class comprarCursoCS {
        WebDriver driver;
        WebDriverWait wait;


        @Before
        public void iniciar(){
            System.setProperty("webdriver.chrome.driver", "drivers/chrome/91/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
            driver.manage().window().maximize();

            wait = new WebDriverWait(driver, 5);

            System.out.println("0 - Antes do Teste iniciar");
        }

        @After
        public void finalizar(){
            driver.quit();
            System.out.println("Z - Depois do teste finalizar");
        }

    @Dado("^que acesso o site da Iterasys$")
    public void queAcessoOSiteDaIterasys() {
        driver.get("https://www.iterasys.com.br");
        System.out.println("1 - acessou o site");
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String curso) {
        driver.findElement(By.id("searchtext")).click();
        driver.findElement(By.id("searchtext")).clear();
        driver.findElement(By.id("searchtext")).sendKeys(Keys.chord(curso)); //escreve o nome do curso letra por letra
        System.out.println("2 - escreveu o nome do curso como " + curso);

    }

    @E("^clico na lupa$")
    public void clicoNaLupa() {
        driver.findElement(By.id("btn_form_search")).click();
        System.out.println("3 - clicou na lupa");
    }

    @Entao("^vejo a lista de resultados para o curso \"([^\"]*)\"$")
    public void vejoAListaDeResultadosParaOCurso(String curso)  {


        assertEquals(driver.findElement(By.cssSelector("h3")).getText(), "Cursos › \"" + curso + "\"");
        System.out.println("4 - exibiu a lista de resultados para o curso " + curso);

    }

    @Quando("^clico em Matricule-se$")
    public void clicoEmMatriculeSe() {
        driver.findElement(By.cssSelector("span.comprar")).click();
        System.out.println("5 - clicou em Matricule-se");
    }

    @Entao("^confirmo o nome do curso como \"([^\"]*)\" e o preco de \"([^\"]*)\"$")
    public void confirmoONomeDoCursoComoEOPrecoDe(String curso, String preco)  {
        assertEquals(driver.findElement(By.cssSelector("span.item-title")).getText(), curso);
        assertEquals(driver.findElement(By.cssSelector("span.new-price")).getText(), preco);
        System.out.println("6 - Confirmou o nome como " + curso + " e o valor do curso como " + preco);


    }

    @E("^pressiono Enter$")
    public void pressionoEnter() {
        driver.findElement(By.id("searchtext")).sendKeys(Keys.ENTER);
        System.out.println("3 - Pressiono Enter");
    }


    @Quando("^clico na imagem de um curso$")
    public void clicoNaImagemDeUmCurso() {
           // driver.findElement(By.cssSelector("span.mais")).click(); - essa linha clica no plano e nao no curso

        //driver.findElement(By.cssSelector("body.flat-theme:nth-child(2) div.container.lis_loja:nth-child(2) div.initial-cursos div.row.lis_loja:nth-child(3) div.col-md-12 div.owl-carousel.owl-theme.course-list.lis_produtos.owl-loaded.owl-drag div.owl-stage-outer div.owl-stage div.owl-item.active:nth-child(3) div.item-plan.item.item-course a:nth-child(2) > span.comprar")).click();
        WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }

    @Entao("^vejo a pagina com detalhes do curso$")
    public void vejoAPaginaComDetalhesDoCurso() {
            wait.until(ExpectedConditions.titleIs("Iterasys - Checkout"));
            assertEquals(driver.getTitle(), "Iterasys - Checkout");
    }

    @E("^clico no botao Ok do popup da LGPD$")
    public void clicoNoBotaoOkDoPopupDaLGPD() {
            driver.findElement(By.cssSelector("a.cc-btn.cc-dismiss")).click();
    }
}
