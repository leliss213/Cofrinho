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
public class Main {

    public static void main(String[] args) {
        
        int opcao = 0;
        while( opcao != 5 ) {
            System.out.println("Cofrinho aplicattion, escolha o que deseja: "
                                + "\n[1] - Adicionar Moeda\n[2] - Remover Moeda"
                                + "\n[3] - Listar Moedas\n[4] - Total Convertido em Real ");

            Scanner scan = new Scanner(System.in);
            opcao = scan.nextInt();

            if( opcao == 1 ) {

                System.out.println("Adicionando moeda!");

            } else if( opcao == 2 ){

                System.out.println("Removendo moeda!");

            } else if( opcao == 3 ){

                System.out.println("Listando as moedas!");


            } else if( opcao == 4 ){

                System.out.println("Convertendo o total em real!");

            }
            
        }    
           
    }
    
}
