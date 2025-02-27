package aula1;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = entrada.nextInt();

        if(idade < 16) {
            System.out.println("Não pode votar!");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Obrigatorio votar!");
        } else {
            System.out.println("Opcional votar!");
        }
    }
}
