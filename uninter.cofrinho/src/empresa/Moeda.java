package empresa;

/*
 *A classe Moeda aqui é abstrata- para que ela sirva de classe mãe para 
 * as classes filhas: Real, Dolar, Euro
 */
public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }
    // Método abstrato que todoas as classes filhas terão de ter...
    public abstract double converter(); 

    @Override
    public int hashCode() { // não será utilizado, mas ele gera um número através do atributo do objeto e usa esse número
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Moeda other = (Moeda) obj;
        return Double.doubleToLongBits(this.valor) == Double.doubleToLongBits(other.valor);
    }
    
    
}
