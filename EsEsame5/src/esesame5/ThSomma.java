/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame5;

/**
 *
 * @author besan
 */
public class ThSomma extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    int buffer;
    int numero;

    public ThSomma(int n, DatiCondivisi ptrDati) {
        datiC = ptrDati;
        numero = n;
        buffer = datiC.getBuffer();
    }

    @Override
    public void run() {
        for (int i = 0; i < numero; i++) {
            datiC.chiediPermesso1();
            datiC.somma();
            datiC.daiPermesso2();
        }
    }
}
