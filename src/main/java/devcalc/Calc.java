// 1 - Pacote
package devcalc;
// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Calc {
    //3.1 - Atributos e Caracteristicas
    static Scanner entrada = new Scanner(System.in);

    //3.2 - Métodos e Funçoes
    public static void main(String[] args){ // 4 testes pra cada, em dividir sao 5
        //Exibe o MENU da Calculadora
        System.out.println(">>> CALCULADORA <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("Escolha o Calculo Desejado");

        //Recebe a opcao desejada
        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;

        //Pergunta os valores a serem usados no calculo

        if (opcao >= 1 && opcao <= 4) {
            System.out.print("Entre o primeiro numero: ");
            num1 = entrada.nextInt();
            System.out.print("Entre o segundo numero: ");
            num2 = entrada.nextInt();
            System.out.print("O Resultado e: ");
        }

        //Chama a funçao do calculo desejado
        switch (opcao){
            case 1:
                System.out.println(somarDoisNumeros(num1, num2));
                break;
            case 2:
                System.out.println(subtrairDoisNumeros(num1, num2));
                break;
            case 3:
                System.out.println(multiplicarDoisNumeros(num1, num2));
                break;
            case 4:
                System.out.println(dividirDoisNumeros(num1, num2));
                break;

            default:
                System.out.println("Opcao invalida");
                break;
        }


    }

    public static int somarDoisNumeros(int num1, int num2){
        return num1 + num2;
    }
    public static int subtrairDoisNumeros(int num1, int num2) {return num1 - num2;}
    public static int multiplicarDoisNumeros(int num1, int num2) {return num1 * num2;}
    public static double dividirDoisNumeros (double num1, double num2) {return num1 / num2;}
}