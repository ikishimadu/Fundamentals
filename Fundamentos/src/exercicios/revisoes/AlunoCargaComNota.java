/*
 Faça um método que calcule a média de um aluno de acordo com o criterio 
definido neste curso.

Nota acima de 7: "Aprovado"
Nota entre 5 e 7: Conceito "Verificalção Suplementar"
Nota abaixo de 5: Conceito "Reprovado"

Além disso, verifique a frequencia do aluno: em uma carga horaria de 40 horas e
que cada dia de aula possui 4 horas. Caso esteja abaixo de 75% de presença o 
aluno está reprovado
*/
package exercicios.revisoes;

import java.util.Scanner;

public class AlunoCargaComNota { 
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner (System.in)) {
            int cargaHoraria = 40;
            double limiteDeFaltas = cargaHoraria * 0.75;
            int frequencia = 25;
            
            System.out.println("Digite a quantidade da sua carga horaria:");
            int qntHoraria = teclado.nextInt();
            
            if (frequencia < limiteDeFaltas ) {
                System.out.println("O aluno perdeu por execeder o limite de faltas!!");
            } else {
                System.out.println("O aluno passara para proxima etapa!");
            }
            
             System.out.println("Digite o nome do aluno:");
            String aluno  = teclado.nextLine();
            
            System.out.println("Digite a nota do primeiro semestre:");
            int sum = teclado.nextInt();
            
            System.out.println("Digite a nota do segundo semestre:");
            int sdois = teclado.nextInt();
            
            System.out.println("Digite a nota do terceiro semestre:");
            int stres = teclado.nextInt();
            
            int media = (sum + sdois + stres)/3;
            
            if (media > 7) {
                System.out.println( "Aluno: "+aluno+" aprovado!");
            } else if (media <= 7){
                System.out.println("Aluno: "+aluno+" verificado pelo suplementar!");
            }else{
                System.out.println("Aluno: "+aluno+" reprovado!");
            }
            
            
        }
    }
}
