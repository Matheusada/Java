package empresa;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Conta c1  = new Conta("Matheus", 15000);
        Conta c2  = new Conta("Mario", 75000);
    
        c1.info();
        c2.info();
        
         System.out.println("Digite um valor para transferir de c1 ----> c2");
        double valorTransferir = teclado.nextDouble();
        boolean sucessoLeitura= false;
         while(!sucessoLeitura){
                try{ // vamos tentar transferir dentro do try, se der algum problema... catch !
                        c1.transferir(valorTransferir,c2);
                        c1.info();
                        c2.info();
                        sucessoLeitura = true;
                } catch(Exception e){
                        System.out.println("Ocorreu um problema, digite outro valor abaixo:");
                        System.out.println(e.getMessage());
                        valorTransferir = teclado.nextDouble();  
   
        }   
       }   
    }
    
}
