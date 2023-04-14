package pkg.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Declaração de variáveis
        boolean temSol = true;
        boolean folga = false;
             
        /* 
        O retorno só sera "irei ir passear hoje!!! =D" se todas TODAS as opceos
        derem verdadeiras 
        */
        
        if (temSol && folga) {
            System.out.println("Irei ir passear hoje!!! =D");
        } else {
            System.out.println("Não irei passear! =C");
        }
    }
}
