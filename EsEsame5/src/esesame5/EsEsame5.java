/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame5;

import java.util.Scanner;
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
            Scanner input = new Scanner(System.in);

            DatiCondivisi datiC = new DatiCondivisi();

            System.out.println("Digitate quanti numeri inserire");
            int n = input.nextInt();

            ThGenera th1 = new ThGenera(n, datiC);
            ThSomma th2 = new ThSomma(n, datiC);
            ThMedia th3 = new ThMedia(n, datiC);
            ThMassimoEMinimo th4 = new ThMassimoEMinimo(n, datiC);
            ThScartoMedio th5 = new ThScartoMedio(n, datiC);
            ThVisualizza th6 = new ThVisualizza(n, datiC);

            th1.start();
            th2.start();
            th3.start();
            th4.start();
            th5.start();
            th6.start();

            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
            th6.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EsEsame5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
