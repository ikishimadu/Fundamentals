package pkg.metodosString;

public class MetodosString {
    public static void main(String[] args) {
        
        String nome = "Rhaenyra";
        String sobrenome = "Targaryen";
        
        //Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " +nome.length());
        System.out.println("Tamanho do sobtenome: " +sobrenome.length());        
    
        //Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
    
        //Exibindo nome completo usando métodos String - Maiúsculas 
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        
        //Exibibdo nome completo usando médodos String - Minúscula 
        System.out.println("Concatenação  Minúscula: " + nomeCompleto.toLowerCase());
    }
}
