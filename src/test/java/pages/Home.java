package pages;

import gherkin.lexer.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    //Classe de mapeamento possui 3 seçoes
    //1 - Mapeamento de elementos (atributos)
    //2 - Construtor entre os elementos e os passos
    //3 - Funçoes e metodos mapeados

    // 1 - Mapeamento
    WebDriver driver;

    @FindBy(id = "searchtext")
    WebElement caixaDePesquisa;

    @FindBy(id = "btn_form_search")
    WebElement botaoProcurar;

    // 2 - Construtor
    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }



    // 3 - Funcoes e metodos
    public void pesquisarPorCurso(String curso){
    caixaDePesquisa.click();
    caixaDePesquisa.clear();
    caixaDePesquisa.sendKeys(curso);

    }
    public void clicarNaLupa(){
    botaoProcurar.click();

    }


}
