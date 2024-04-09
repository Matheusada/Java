package empresa;


public class Principal {


    public static void main(String[] args) {
        
        Conta c1  = new Conta("Matheus", 15000);
        Conta c2  = new Conta("Mario", 75000);
        
        c1.info();
        c2.info();
        c1.depositar(300);
        c1.info();
        c1.sacar(800);
        c1.info();
        
        
    }
    
}
