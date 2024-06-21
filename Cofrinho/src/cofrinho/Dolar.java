package cofrinho;

/**
 *
 * @author Leandro
 */
public class Dolar extends Moeda{
    
    public Dolar(double valor) {
        super(valor);
    }
    
    @Override
    String info() {
        return "Dólar $" + super.valor;
    }

    @Override
    double converter() {
        return super.valor * 5.4;
    }
    
}
