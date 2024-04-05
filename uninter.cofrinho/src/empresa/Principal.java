package empresa;

import java.util.Scanner;

/**
 * Trabalho UNINTER para a disciplina de Programação orientada a objetos
 * @author Matheus Augusto de Azevedo
 * RU: 4324713
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int escolha;
        int tipMoeda;
        double valorAdicionado;
        Moeda m;
        Cofrinho cofrinho = new Cofrinho(); // Instanciando o cofrinho
        
        System.out.println(">>>>MENU COFRINHO <<<<");
        System.out.println("");
        System.out.println("1-Adicionar Moedas");
        System.out.println("2-Remover Moedas");
        System.out.println("3-Listar Moedas");
        System.out.println("4-Converter valor total para R$");
        System.out.println("0-Encerrar");
       
        escolha = teclado.nextInt();
        
        while (escolha !=0){
            
            switch(escolha){
                case 1:
                    //adicionar
                    tipMoeda = 0;
                    while(tipMoeda >4 || tipMoeda <=0){
                         System.out.println("1-Real (R$)");
                         System.out.println("2-Dolar(US$)");
                         System.out.println("3-Euro (EUR)");
                         tipMoeda = teclado.nextInt();
                    }
                    m = null;
                    if(tipMoeda ==1){
                        System.out.println("Qual valor em REAIS deseja ADICIONAR?");
                        valorAdicionado = teclado.nextDouble();
                        m = new Real(valorAdicionado);  
                    }
                    if(tipMoeda ==2){
                        System.out.println("Qual valor em DOLAR deseja ADICIONAR?");
                        valorAdicionado = teclado.nextDouble();
                        m = new Dolar(valorAdicionado);  
                    }
                    if(tipMoeda ==3){
                        System.out.println("Qual valor em EURO deseja ADICIONAR?");
                        valorAdicionado = teclado.nextDouble();
                        m = new Euro(valorAdicionado);  
                    }
                    
                    cofrinho.adicionar(m);
                    
                    break;
                case 2:
                    //remover
                    tipMoeda = 0;
                    while(tipMoeda >4 || tipMoeda <=0){
                         System.out.println("Remover:");
                         System.out.println("1-Real (R$)");
                         System.out.println("2-Dolar(US$)");
                         System.out.println("3-Euro (EUR)");
                         tipMoeda = teclado.nextInt();
                    }
                    m = null;
                    if(tipMoeda ==1){
                        System.out.println("Qual valor em REAIS deseja REMOVER?");
                        valorAdicionado = teclado.nextDouble();
                        m = new Real(valorAdicionado);  
                    }
                    if(tipMoeda ==2){
                        System.out.println("Qual valor em DOLAR deseja REMOVER?");
                        valorAdicionado = teclado.nextDouble();
                        m = new Dolar(valorAdicionado);  
                    }
                    if(tipMoeda ==3){
                        System.out.println("Qual valor em EURO deseja REMOVER?");
                        valorAdicionado = teclado.nextDouble();
                        m = new Euro(valorAdicionado);  
                    }
                    
                    cofrinho.remover(m);
                    
                    break;
                case 3:
                    //listagem das moedas
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    //conversão total
                    System.out.println("O total convertido para reais (R$): ");
                    System.out.println(cofrinho.totalConvertido());
                    break;
                default:
                    System.out.println("alternativa INCORRETA, tente novamente...");       
            } 
                    System.out.println(">>>>MENU COFRINHO <<<<");
                    System.out.println("");
                    System.out.println("1-Adicionar Moedas");
                    System.out.println("2-Remover Moedas");
                    System.out.println("3-Listar Moedas");
                    System.out.println("4-Converter valor total para R$");
                    System.out.println("0-Encerrar");

                    escolha = teclado.nextInt();     
     
        }
         System.out.println("Encerrando o Programa...");
    }
    
}
