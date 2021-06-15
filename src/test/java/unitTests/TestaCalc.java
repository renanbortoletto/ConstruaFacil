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
    public static void testarSomarDoisNumerosERROR() {
        //1- Prepara - Configura - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 21;

        //2 - Executa - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        //3 - Validar - Then
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }


    @Test
    public static void testarSubtrairDoisNumeros() {

        int num1 = 4;
        int num2 = 1;
        int resultadoEsperado = 3;

                int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
        }

    @Test
    public static void testarSubtrairDoisNumerosERROR() {

        int num1 = 4;
        int num2 = 1;
        int resultadoEsperado = 32;

        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test
    public static void testarMultiplicarDoisNumeros() {

        int num1 = 2;
        int num2 = 2;
        int resultadoEsperado = 4;

            int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test
    public static void testarMultiplicarDoisNumerosERROR() {

        int num1 = 2;
        int num2 = 2;
        int resultadoEsperado = 31;

        int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test
    public static void testarDividirDoisNumeros() {

        double num1 = 10;
        double num2 = 5;
        double resultadoEsperado = 2;

            double resultadoAtual = Calc.dividirDoisNumeros(num1, num2);
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test
    public static void testarDividirDoisNumerosERROR_1() {

        double num1 = 10;
        double num2 = 5;
        double resultadoEsperado = 0;

        double resultadoAtual = Calc.dividirDoisNumeros(num1, num2);
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test
    public static void testarDividirDoisNumerosERROR_2_Resultado_Infinity() {

        double num1 = 1;
        double num2 = 0;
        double resultadoEsperado = 0;

        double resultadoAtual = Calc.dividirDoisNumeros(num1, num2);
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoEsperado,resultadoAtual);
    }
}
