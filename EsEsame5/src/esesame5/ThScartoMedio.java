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
public class ThScartoMedio extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThScartoMedio(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        int somma = 0;
        float media = 0,scartoMedio = 0, scarto = 0;
        datiC.chiediPermesso4();
        for (int i = 0; i < datiC.v.size(); i++) {

            somma = somma + datiC.v.get(i);
        }
        media = somma / datiC.v.size();
        for (int i = 0; i < datiC.v.size(); i++) {
            scarto+=Math.abs(media - datiC.v.get(i));
        }
        scartoMedio = scarto / datiC.v.size();
        System.out.println("Lo scarto medio è: " + scartoMedio);
    }
}
