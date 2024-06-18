/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofrinho;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Cofrinho {

    public static void main(String[] args) {
        
        System.out.println("Cofrinho aplicattion, escolha o que deseja: "
                            + "\n[1] - Adicionar Moeda\n[2] - Remover Moeda"
                            + "\n[3] - Listar Moedas\n[4] - Total Convertido em Real ");
        
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        
        if( opcao == 1) {
            System.out.println("Adicionando moeda!");
        }
            
           
    }
    
}
