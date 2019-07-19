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
public class ThMassimoEMinimo extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThMassimoEMinimo(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        int massimo = 0;
        int minimo = 11;
        datiC.chiediPermesso3();
        for (int i = 0; i < datiC.v.size(); i++) {
            
            if (massimo < datiC.v.get(i)) {
                massimo = datiC.v.get(i);
            }
            if (minimo > datiC.v.get(i)) {
                minimo = datiC.v.get(i);
            }
        }
        System.out.println("Il massimo è: " + massimo);
        System.out.println("Il minimo è: " + minimo);
        datiC.daiPermesso4();
    }
}
