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
public class ThMedia extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThMedia(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        int somma = 0;
        float media = 0;
        datiC.chiediPermesso2();
        for (int i = 0; i < datiC.v.size(); i++) {
             somma = somma + datiC.v.get(i);
        }
        media = somma / datiC.v.size();
        System.out.println("La media è: " + media);
        datiC.daiPermesso3();
    }
}
