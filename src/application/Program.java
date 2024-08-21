package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o primeiro numero 	"); // Declarando variáveis para os números
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        // Realizando as operações diretamente no método main
        double soma = num1 + num2;
        System.out.println("Soma: " + soma);

        double subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao);

        double multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);

        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
       

        // Realizando as operações diretamente no método main
         soma = num1 + num2;
        System.out.println("Soma: " + soma);

         subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao);

        multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);

        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
	}

}
