/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1diegobrunoro;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        Scanner ler = new Scanner(System.in);
        ListaDupla LD = new ListaDupla();
        ListaDupla LDPositivo = new ListaDupla();
        ListaDupla LDNegativo = new ListaDupla();
        Nodo nodoAtual = LD.prim;
        
         int entra;
         int somaPositivo=0, somaNegativo=0;
            
        
        do{
            
            System.out.println("Informe o Valor: ");
            int valor = ler.nextInt();
            LD.insereInicio(valor);
            System.out.println("PARA SAIR: 0 \nPARA CONTINUAR: 1");
            entra = ler.nextInt();
        } while (entra == 1);
        LD.mostraLista(); 
    
        //Até aqui ok
        
        nodoAtual = LD.prim;
        
        while(nodoAtual != null)
        {
                if(nodoAtual.dado >= 0){
                    LDPositivo.insereInicio(nodoAtual.dado);
                }else{
                    LDNegativo.insereInicio(nodoAtual.dado);
                }
                nodoAtual=nodoAtual.next;
         }

        LDPositivo.mostraLista(); 
        LDNegativo.mostraLista(); 

    
    }
    
        
        
  
    
}
