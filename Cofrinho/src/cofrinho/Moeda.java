/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
