package empresa;

public class Real extends Moeda {
   
    public Real(double valor) {
        super(valor);
    }
    
    public double converter() {
      return valor;
    }

    public String toString() { // imprimindo direto o objeto
        return "Real- R$ " + valor;
    }
    
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
   
