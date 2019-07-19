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
    
    DatiCondivisi datiC=new DatiCondivisi();
    
    public ThGenera(DatiCondivisi ptrDati){
        datiC=ptrDati;
    }
   
    @Override
    public void run(){
        Random rand=new Random();
        for(int i=0;i<11;i++){
            datiC.v.add(rand.nextInt(10));
            System.out.println(datiC.v.get(i));
        }
        
        datiC.daiPermesso1();
        
    }
}
