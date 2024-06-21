package cofrinho;

import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class Cofrinho {
    
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
    
    public void adicionar(Moeda moeda){
        listaMoedas.add(moeda);
        System.out.println("Tamanho da lista de moedas: " + listaMoedas.size());

    }
    
    public void remover(Moeda moeda){
        listaMoedas.remove(moeda);
    }
    
    public void listaMoedas(){

        for(Moeda moeda : listaMoedas){
            System.out.println(moeda.info());
        }
    }
    
    public double totalConvertido(){
        double totalConvertido = 0;
        
        for(Moeda moeda : listaMoedas){
            totalConvertido += moeda.converter();
        }
        
        return totalConvertido;
    }
}
