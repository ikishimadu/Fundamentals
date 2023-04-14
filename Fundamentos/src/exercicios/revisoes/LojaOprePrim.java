package exercicios.revisoes;

/*
A loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações 
sem juros. Faça um progama que receba um valor de uma compra e mostre
o valor das prestações
No final informar o nome do mercado e valor de cada
*/

public class LojaOprePrim {

    public static void main(String[] args) {
        
        String nome = "Mamão com Açúcar";
        double valor = 57.9;
        int parcelas = 5;
        
       double divisãosemjuros = valor / parcelas;
        
        System.out.println("O Mercado " + nome);
        System.out.println("O valor final a pagar será: " +divisãosemjuros );
        
        
    }
    
}
