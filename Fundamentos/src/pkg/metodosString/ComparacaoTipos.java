package pkg.metodosString;

public class ComparacaoTipos {
    public static void main(String[] args) {
        
        //Declaração de variáveis
        String nomeUsuario = "Rhaenyra";
        int senha = 123;
        
        //Comparação de String e inteiros
        boolean resultadoNome = nomeUsuario.equals("Rhaenyra");
        boolean resultadoSenha = (senha == 456);
    
        //Exibindo resultados
        System.out.println("O nome do usuáriio está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
