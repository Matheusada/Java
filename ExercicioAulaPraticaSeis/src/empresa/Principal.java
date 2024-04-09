package empresa;


public class Principal {


    public static void main(String[] args) {
        
        Conta c1  = new Conta("Matheus", 15000);
        Conta c2  = new Conta("Mario", 75000);
        
       
        try {
            c1.info();
            c2.info();
            c1.depositar(300);
            c1.info();
            c1.sacar(800000);
            c1.info();  
        }
        catch(Exception e){ // poderia ser qualquer no lugar da letra "e"
            System.out.println("Ocorreu um erro! Coloque outro valor! ");
            System.out.println(e.getMessage()); // sempre teremos getMessage() para retornar o erro 8impresso !
        }
        finally {
            System.out.println("");
            System.out.println("Encerrando Programa...");
        }
         
        
    }
    
}
