/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }
    
    public void remover(Moeda moeda){
        listaMoedas.remove(moeda);
    }
    
    public String listaMoedas(){
        for(listaMoedas : )
    }
    
    public double totalConvertido(){
        return 2;
    }
}
