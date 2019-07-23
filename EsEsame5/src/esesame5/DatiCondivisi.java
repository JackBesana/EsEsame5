/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame5;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class DatiCondivisi {

    ArrayList<Integer> v = new ArrayList<Integer>();

    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;
    private Semaphore sem5;
    private Semaphore sem6;
    int somma = 0, massimo = -1, minimo = 11, numero;
    float media = 0, scartoMedio = 0;
    int buffer = 0;

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public DatiCondivisi() {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
        sem4 = new Semaphore(0);
        sem5 = new Semaphore(0);
        sem6 = new Semaphore(1);
    }

    public DatiCondivisi(int n) {
        sem1 = new Semaphore(0);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
        sem4 = new Semaphore(0);
        sem5 = new Semaphore(0);
        sem6 = new Semaphore(1);
        numero = n;
    }

    public void somma() {
        
        somma = somma + buffer;
    }

    public void media(int n) {
        media = somma / n;
    }

    public void massimoEMinimo() {

        if (massimo < buffer) {
            massimo = buffer;
        }
        if (minimo > buffer) {
            minimo = buffer;
        }

    }

    public void scartoMedio(int n) {
        float scarto = 0;
        for (int i = 0; i < n; i++) {
            scarto += Math.abs(media - buffer);
        }
        scartoMedio = scarto / n;
    }

    public void visualizza() {

        System.out.println("Numero generato: " + buffer);
        System.out.println("La somma è: " + somma);
        System.out.println("La media è: " + media);
        System.out.println("Il massimo è: " + massimo);
        System.out.println("Il minimo è: " + minimo);
        System.out.println("Lo scarto medio è: " + scartoMedio);

    }

    public void daiPermesso1() {
        sem1.release();
    }

    public void chiediPermesso1() {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso2() {
        sem2.release();
    }

    public void chiediPermesso2() {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso3() {
        sem3.release();
    }

    public void chiediPermesso3() {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso4() {
        sem4.release();
    }

    public void chiediPermesso4() {
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso5() {
        sem5.release();
    }

    public void chiediPermesso5() {
        try {
            sem5.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void daiPermesso6() {
        sem6.release();
    }

    public void chiediPermesso6() {
        try {
            sem6.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
