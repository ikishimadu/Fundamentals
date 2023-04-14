/*
Faça um progama que receba do usúario o nome de login e a senha
 
Caso o nome do logn e senha estejam corretos, mostre uma mensagem de "Bem-vindo, usúario logado!"

Caso contrário, mostre uma mensagem de "Nome de usuário ou senha inválidos"
*/
package pkg.metodosString;

import java.util.Scanner;

public class ExercicioLoginSenha {
    public static void main(String[] args) {
        
   
    
     Scanner teclado = new Scanner (System.in);
     
    String loginUsuario = "Rhaenyra";
    String senhaUsuario = "syrax";
    
    System.out.println("Digite o login do usuario:");
        String login = teclado.nextLine();
      
    System.out.println("Digite a senha do usuario:");
        String senha = teclado.nextLine();
        
        if (login.equals(loginUsuario) && (senha.equals(senhaUsuario))){
            System.out.println("Bem-vindo, usuáirio logado com sucesso!!");
        } else {
            System.out.println("Usuario não logado, sinto muito! Login ou senha devem estar incorretos");
        }
        
  }
}