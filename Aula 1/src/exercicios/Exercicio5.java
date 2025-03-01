package exercicios;

import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int rand = (int) (Math.random() * 5 + 1);
    System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
    int adivinhacaoDoUsuario = Integer.parseInt(entrada.nextLine());
    while (rand != adivinhacaoDoUsuario) {
      System.out.println("Você errou!");
      System.out.print("Tente novamente: ");
      adivinhacaoDoUsuario = Integer.parseInt(entrada.nextLine());
    }
    System.out.println("Parabéns, vocé acertou!");
  }
}
