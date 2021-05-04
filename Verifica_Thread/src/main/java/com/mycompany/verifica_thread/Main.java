package com.mycompany.verifica_thread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Semaforo s_donna= new Semaforo(1); //istanza del semaforo per donne, con massimo una persona nel bagno
    static Semaforo s_uomo= new Semaforo(1); //istanza del semaforo per uomini, con massimo una persona nel bagno
    public static Bagno bagnodonna = new Bagno(); //istanza del bagno per donna
    public static Bagno bagnouomo = new Bagno(); //istanza del bagno per uomoni

    public static void main(String[] args) {
        //istanzi di utenti uomini e donne con il rispettivo bagno
        Thread u1= new Thread (new Utente("uomo1", "uomo"));
        Thread u2= new Thread (new Utente("uomo2", "uomo"));
        Thread u3= new Thread (new Utente("uomo3", "uomo"));
        Thread u4= new Thread (new Utente("uomo4", "uomo"));
    
        Thread d1= new Thread (new Utente("donna1", "donna"));
        Thread d2= new Thread (new Utente("donna2", "donna"));
        Thread d3= new Thread (new Utente("donna3", "donna"));
        Thread d4= new Thread (new Utente("donna4", "donna"));
        
        u1.start();
        u2.start();
        u3.start();
        u4.start();
        
        d1.start();
        d2.start();
        d3.start();
        d4.start();
    }
    
}
