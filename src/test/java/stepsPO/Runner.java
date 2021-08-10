package stepsPO;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/resources/featuresPO"}, // Onde estao os cenarios em Gherkin
        glue = {"stepsPO"},                           // Onde estao as definicoes de passos
        dryRun = false,                               // Exibicao de log
        monochrome = true,                            // Detalhes do log
        plugin = {
                    "pretty",                         // Formatacao visual do Cucumber
                    "html:target/reports/extentreports",        //Saida HTML do relatorio simples
                    "json:target/reports/extentreports.json",    //Saida json com os dados
                   // "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/reports/dashboard.html"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
}
