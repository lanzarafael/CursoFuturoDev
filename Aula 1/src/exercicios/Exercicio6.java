package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int valorInicial = 0;
    int raiz = 0;
    boolean entradaValida = false;

    // Solicita o valor inicial
    while (!entradaValida) {
      try {
        System.out.println("Digite o valor inicial (número inteiro): ");
        valorInicial = entrada.nextInt();
        entradaValida = true;
      } catch (InputMismatchException e) {
        System.out.println("Número inválido! Por favor, digite um número inteiro.");
        entrada.next(); // Limpa o buffer do entrada
      }
    }

    entradaValida = false; // Reinicia a flag para a próxima entrada

    // Solicita o valor da raiz
    while (!entradaValida) {
      try {
        System.out.println("Digite o valor da raiz: ");
        raiz = entrada.nextInt();
        entradaValida = true;
      } catch (InputMismatchException e) {
        System.out.println("Número inválido! Por favor, digite um número inteiro.");
        entrada.next(); // Limpa o buffer do entrada
      }
    }

    // Pergunta ao usuário se deseja calcular P.A. ou P.G.
    System.out.println(
        "Deseja calcular os 10 primeiros valores de uma P.A. ou P.G.? (Digite 'PA' ou 'PG'): ");
    String tipoProgressao = entrada.next();

    // Verifica a escolha do usuário e calcula a sequência correspondente
    if (tipoProgressao.equalsIgnoreCase("PA")) {
      System.out.println("Os 10 primeiros valores da P.A. são:");
      for (int i = 0; i < 10; i++) {
        int valor = valorInicial + i * raiz;
        System.out.println(valor + " ");
      }
    } else if (tipoProgressao.equalsIgnoreCase("PG")) {
      System.out.println("Os 10 primeiros valores da P.G. são:");
      for (int i = 0; i < 10; i++) {
        int valor = valorInicial * (int) Math.pow(raiz, i);
        System.out.println(valor + " ");
      }
    } else {
      System.out.println("Opção inválida! Por favor, digite 'PA' ou 'PG'.");
    }

    entrada.close();
  }
}
