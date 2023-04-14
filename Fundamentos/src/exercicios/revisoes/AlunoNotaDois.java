/*
Escrever um progama que leia o nome de um aluno e as notas das duas provas
que ele obteve no semestre.

No final informar o nome do aluno e sua média (aritmética)

Se a média aritmética do aluno for maior que 7, o aluno está aprovado caso, 
a nota seja até que 5, o aluno está em recuperação. Se menor que 5, então está 
reprovador
 */
package exercicios.revisoes;

import java.util.Scanner;

public class AlunoNotaDois {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o nome do aluno:");
        String aluno  = teclado.nextLine();
        
        System.out.println("Digite a nota da primeira prova:");
        double provaum = teclado.nextDouble();
        
        System.out.println("Digite a nota da segunda prova:");
        double provadois = teclado.nextDouble();
        
        double divisão = 2;
        
        double somadaprova = provaum + provadois;
        
        double divisãodaprova = somadaprova / divisão;
       
        System.out.println("Nome: " + aluno);
        System.out.println("Somas das provas: " + somadaprova);
        System.out.println("Média: " + divisãodaprova);
        
        if (divisãodaprova >= 7) {
            System.out.println( "APROVADO!");
        } else if ( divisãodaprova >= 5){
            System.out.println("RECUPERAÇÃO!");
        }else {
            System.out.println("REPROVADO!");
     
      teclado.close();  
     } 
   }
}