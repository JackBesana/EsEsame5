/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class EsEsame5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DatiCondivisi datiC = new DatiCondivisi();

            ThGenera th1 = new ThGenera(datiC);
            ThSomma th2 = new ThSomma(datiC);
            ThMedia th3 = new ThMedia(datiC);
            ThMassimoEMinimo th4 = new ThMassimoEMinimo(datiC);
            ThScartoMedio th5 = new ThScartoMedio(datiC);

            th1.start();
            th2.start();
            th3.start();
            th4.start();
            th5.start();

            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EsEsame5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
