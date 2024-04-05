package empresa;

import java.util.ArrayList;


public class Cofrinho {
    //array lista-ListaMoedas- privado(-)
    private ArrayList<Moeda>listaMoedas = new ArrayList(); 
    
    //método para adicionar moedas
    public void adicionar(Moeda m){
        listaMoedas.add(m);
    }
    
    public void remover(Moeda m){
        listaMoedas.remove(m);
        
    }
    public void listagemMoedas(){
        for(Moeda m : listaMoedas){
            System.out.println(m);
        }
    }
    public double totalConvertido(){
        double total = 0;
        for (Moeda m: listaMoedas){
            total += m.converter();
        }
        return total;
               
    }
    
    
    
    
    
}

