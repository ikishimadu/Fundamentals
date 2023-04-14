/*
Crie um progama que informe ao usuário sua obrigatoriedade de votar

obs: menores de 18 anos e maiores que 65 não são obrigados a votar 
 */
package exercicios.revisoes;

import java.util.Scanner;

public class VotaçãoIdade {
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite a sua idade: ");
            int idade = teclado.nextInt();
            
            if (idade <18 || idade>65 ) {
                System.out.println("Você NÃO é obrigado a votar!!");
            } else {
                System.out.println("Você É obrigado a votar!!");
            }
        }
    }       
}
