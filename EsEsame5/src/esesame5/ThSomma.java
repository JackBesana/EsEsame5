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

    public ThSomma(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        int somma = 0;
        datiC.chiediPermesso1();
        for (int i = 0; i < datiC.v.size(); i++) {
            
            somma = somma + datiC.v.get(i);
        }
        System.out.println("La somma è: " + somma);
        datiC.daiPermesso2();
    }
}
