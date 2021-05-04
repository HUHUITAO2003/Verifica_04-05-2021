/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.verifica_thread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Bagno {
    /**
     * metodo che la persona usa per andare in bagno
     * @param nome identificatore della persona
     */
    public void occupato(String nome){
        System.out.println(nome+" entra in bagno");
        try {
            sleep(2000); //aspetta 2 secondi per rallentare l'esecuzione
        } catch (InterruptedException ex) {
            Logger.getLogger(Bagno.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nome+" esce dal bagno");
    }
}
