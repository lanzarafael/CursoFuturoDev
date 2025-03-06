package exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as notas do semestre");

        System.out.println("Nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua media é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
