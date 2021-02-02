/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.zaposlenik;

import hr.algebra.interfaces.Zaposlenik_Prihod;
import hr.algebra.tipVlaka.Mali_Vlak;
import hr.algebra.tipVlaka.Veliki_Vlak;

/**
 *
 * @author Domi
 */
public class Zaposlenik implements Zaposlenik_Prihod{

    @Override
    public void ispisi_Prihod_Malog_Vlaka(Mali_Vlak maliVlak) {
        System.out.println("Zaposlenikov prihod od malog vlaka: " + maliVlak.Ispisi_Prihod()*10/100+"kn"); 
    }

    @Override
    public void ispisi_Prihod_Velikog_Vlaka(Veliki_Vlak velikiVlak) {
       System.out.println("Zaposlenikov prihod od velikog vlaka: " + velikiVlak.Ispisi_Prihod()*10/100+"kn"); 
    }
}
