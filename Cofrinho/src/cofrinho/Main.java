/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cofrinho;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Main {
    
    public static void main(String[] args) {
        
        int opcao = 0;
        int tipoMoeda;
        double valorMoeda = 0;
        double totalConvertido;
        
        Cofrinho cofrinho = new Cofrinho();
        
        while( opcao != 5 ) {
            System.out.println("\n\nAplicação cofrinho escolha o que deseja: "
                                + "\n[1] - Adicionar Moeda\n[2] - Remover Moeda"
                                + "\n[3] - Listar Moedas\n[4] - Total Convertido em Real\n[5] - Sair");
            Scanner scan = new Scanner(System.in);
            try{
                opcao = scan.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Opção inválida, se deseja sair digite o número 6!");
            }       
            
            if( opcao == 1 || opcao == 2 ) {
                //Adicionar - Remover
                if(opcao == 1){
                    System.out.println("\nAdicionando moeda!");
                } else{
                    System.out.println("\nRemovendo moeda!");
                }
                    
                System.out.println("Escolha o tipo da moeda: \n[1] - Real\n[2] - Dólar\n[3] - Euro");
                tipoMoeda = scan.nextInt();
                
                System.out.println("Agora digite o valor:");
                try{
                    valorMoeda = scan.nextDouble();
                } catch( InputMismatchException  e){
                    System.out.println("Valor digitao é inválido, digite apenas números!");
                    e.printStackTrace();
                }
                    
                
                Moeda moeda = null;
                
                switch (tipoMoeda) {
                    case 1:
                        //Real
                        moeda = new Real( valorMoeda );
                        break;
                    case 2:
                        //Dólar
                        moeda = new Dolar( valorMoeda );
                        break;
                    case 3:
                        //Euro
                        moeda = new Euro( valorMoeda );
                        break;
                    default:
                        System.out.println("Tipo informado não existe!");
                        break;
                }
                 
                if(moeda != null){
                    //Validando se é para add ou remover
                    if( opcao == 1 ){
                        System.out.println("Adicionando "+moeda.valor);
                        cofrinho.adicionar(moeda);
                    } else {
                        cofrinho.remover(moeda);
                    }  
                } else {
                    System.out.println("Erro ao inserir a moeda, verifique!");
                }

            } else if( opcao == 3 ){
                //Listar
                System.out.println("Listando as moedas!");
                cofrinho.listaMoedas();

            } else if( opcao == 4 ){
                //Converter
                System.out.println("Convertendo o total em real!");
                totalConvertido = cofrinho.totalConvertido();
                
                if( totalConvertido == 0 ){
                    System.out.println("Total está zerado, adicione moedas para aumentar o saldo.");
                } else {
                    System.out.println("Total convertido em R$ " + totalConvertido);
                }
            }
            
        }    
           
    }
    
}
