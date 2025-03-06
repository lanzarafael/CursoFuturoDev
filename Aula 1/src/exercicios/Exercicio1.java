package exercicios;
import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite seu sobrenome: ");
    String sobrenome = entrada.nextLine();

    System.out.println("Digite seu nome: ");
    String nome = entrada.nextLine();

    String nomeCompleto = nome + " " + sobrenome;
    System.out.println("Seu nome completo é: " + nomeCompleto);

    System.out.println("Seu nome completo tem: " + nomeCompleto.length() + " letras");
  }
}