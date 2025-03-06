package exercicios;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
    }
}
