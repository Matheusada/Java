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
     saldo += valor;
     
 }
 void sacar(int valor){
     saldo -= valor;
 }
 void transferir(int valor){
     saldo -= valor;
 }
 void info(){
     
     System.out.println("------------");
     System.out.println("Nome: " + nome);
     System.out.println("Saldo: " + saldo);
     
 }
    
}
