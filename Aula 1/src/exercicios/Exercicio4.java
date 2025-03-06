package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("-----------");

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Escolha a operação (1 - soma, 2 - subtracao, 3 - multiplicacao, 4 - divisao): ");
        String operacao = entrada.next();

        double resultado;

        switch (operacao) {
            case "1":
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            case "2":
                resultado = num1 - num2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            case "3":
                resultado = num1 * num2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            case "4":
                resultado = num1 / num2;
                System.out.printf("Resultado: %.2f%n", resultado);
                break;
            }
        }
    }


