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

public class AlunoNotaDoisDois {
      public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o nome do aluno:");
        String aluno  = teclado.nextLine();
        
        System.out.println("Digite a nota da primeira prova:");
        int provaum = teclado.nextInt();
        
        System.out.println("Digite a nota da segunda prova:");
        int provadois = teclado.nextInt();
        
        int media = (provaum + provadois)/2;
        
        if (media >= 7) {
            System.out.println( "Aluno: "+aluno+" aprovado!");
        } else if ( media >= 5){
            System.out.println("Aluno: "+aluno+" recuperação!");
        }else{
            System.out.println("Aluno: "+aluno+" reprovado!");
        }
        
      teclado.close();  
    }  
}
