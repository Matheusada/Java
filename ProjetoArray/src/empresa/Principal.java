package empresa;

public class Principal {
    
    public static int[] instanciaArray(int n) {
        return new int[n];
        
    }
    public static void main(String[] args) {
        int tam=-10; 
        int arr[]; // como se apontasse para um endereço de memória vazio/nulo
        try{
            int conta = 10/0;
             arr = instanciaArray(tam);
             for(int i=0; i<tam; i++){
             System.out.println(arr[i]);
        }
             /* podemos colocar genericamente
             *a Exceção mãe (superclasse) => catch (Exception e){}, aí pega 
             genericamente todos os tipos de exceções, sem especificação 
             */
       }catch(NegativeArraySizeException e){
            System.out.println("Valor inválido, digite outro!");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Divido por 0 não existe, digite outro: ");
            System.out.println(e);
        }
        
       
    }
    
}
