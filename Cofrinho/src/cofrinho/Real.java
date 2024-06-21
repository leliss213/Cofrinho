package cofrinho;

/**
 *
 * @author Leandro
 */
public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }
    
    @Override
    double converter() {
        return super.valor;
    }

    @Override
    String info() {
        return "Real: R$" + super.valor;
    }

}
