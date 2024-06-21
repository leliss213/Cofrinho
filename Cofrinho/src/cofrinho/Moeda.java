package cofrinho;

/**
 *
 * @author Leandro
 */
public abstract class Moeda {

    public Moeda(double valor) {
        this.valor = valor;
    }
    
    double valor;
    
    abstract String info();
    
    abstract double converter();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
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
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        return true;
    }
    
}
