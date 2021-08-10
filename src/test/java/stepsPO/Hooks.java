package stepsPO;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void iniciar(){

        System.out.println("Passo 0");}

    @After
    public void finalizar(){

        System.out.println("Passo Z");}

}
