/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.verifica_thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Semaforo {
    int valore; // indica la multeciplita della risorsa, quanti thread vi possono accedere contemporaneamente

    /**
    * costruttore per realizzare l'istanza
    * @param variabile per definire la multeplicità della risorsa
    */
    public Semaforo(int valore) {
        this.valore = valore;
    }
    
    /**
    * metodo per richiedere la risorsa
    */
    synchronized public void P(){ 
        while(valore==0){ //quando valore=0 la risorsa è occupata, il thread si mette in coda ad aspettare che la risorsa si liberi
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        valore--; //il thread ha occputa la risorsa
    }
    
    
    /**
    * metodo per rilasciare la risorsa
    */
    synchronized public void V(){
        valore++;//rilascia la risorsa
        notify();//avverte il primo thread nella coda di aver rilasciato la risorsa
    }
}
