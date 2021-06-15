package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test
    public static void testarSomarDoisNumeros() {
    //1- Prepara - Configura - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

    //2 - Executa - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

    //3 - Validar - Then
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }


@Test
    public void testarMain(){

}
}
