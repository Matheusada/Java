package empresa;

public class Conta {
    String nome;
    double saldo;
    
 public Conta(String nome, double saldo){
     super();
     this.nome = nome;
     this.saldo = saldo;
 }
 
 void depositar(int valor){
     if(valor<0){
         throw new RuntimeException("Valor invalido");
     }
     saldo -=valor;
 }
 void sacar(int valor) throws Exception{
     if(valor>saldo){
        throw new RuntimeException("Saldo insuficiente");
    }
    if(valor <0){
        throw new RuntimeException("Valor invalido");
    }   
     saldo -= valor;
 }
 void transferir(int valor){
     if(valor<0){
         throw new RuntimeException("Valor invalido");     
     }
     saldo -= valor;
 }
 void info(){
     
     System.out.println("------------");
     System.out.println("Nome: " + nome);
     System.out.println("Saldo: " + saldo);
     
 }
    
}
