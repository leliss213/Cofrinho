package cofrinho;

/**
 *
 * @author Leandro
 */
public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    @Override
    String info() {
        return "Euro €" + super.valor;
    }

    @Override
    double converter() {
        return super.valor * 5.8;
    }
    
}
