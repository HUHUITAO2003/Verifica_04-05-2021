/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.verifica_thread;

/**
 *
 * @author informatica
 */
public class Utente implements Runnable{
    String nome; 
    String sesso;

    public Utente(String nome, String sesso) { //identificativo del thread
         this.nome=nome;
         this.sesso=sesso;
    }


    @Override
    public void run() {
        if(sesso.equals("donna")){
            Main.s_donna.P(); //richiede la risorsa bagno
            Main.bagnodonna.occupato(nome);
            Main.s_donna.V(); //rilascia la risorsa bagno
        }
        if(sesso.equals("uomo")){
            Main.s_uomo.P(); //richiede la risorsa bagno
            Main.bagnouomo.occupato(nome);
            Main.s_uomo.V(); //rilascia la risorsa bagno
        }
        
    }
    
}
