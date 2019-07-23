/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame5;

import java.util.Random;

/**
 *
 * @author besan
 */
public class ThGenera extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThGenera(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        numero = n;
        buffer = datiC.getBuffer();
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso6();
            buffer = (rand.nextInt(10));
            datiC.setBuffer(buffer);
            datiC.daiPermesso1();
        }

    }
}
