package exercicios.revisoes;

import java.util.Scanner;

public class InteracaoDoUsuario {
    public static void main(String[] args) {
        
        //Criando acesso ao teclado
        Scanner teclado = new Scanner (System.in);
        
        //Solicitando dados do usuário
        System.out.println("Digite o valor do produto:");
        double produto = teclado.nextDouble();
        
        //Exibindo resultado para o usuário
        System.out.println("O valor do produto: " + produto);
        

        //Fechando acesso ao teclado
        teclado.close();
    }
}
