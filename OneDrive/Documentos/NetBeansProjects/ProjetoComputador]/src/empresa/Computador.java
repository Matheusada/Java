package empresa;

public abstract class Computador { // Ao criar uma classe abstrata = sem instanciar e métodos abstratos!
    int gbMemoria;
    int numProcessadores;
    
    public Computador(int gbMemoria, int numProcessadores){
        super();
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;  
        
    }
    
    abstract double calcularValor();
    
}
