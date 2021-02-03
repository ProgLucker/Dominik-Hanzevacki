/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.zaposlenik;

import hr.algebra.interfaces.Vlak;
import hr.algebra.interfaces.Vozila;
import hr.algebra.interfaces.Zaposlenik_Prihod;
import java.util.List;

/**
 *
 * @author Domi
 */
public class Zaposlenik implements Zaposlenik_Prihod {

    private double postotak_Place;
    private double postotak_Plina;
    private double napunjenost_Baterije;

    public Zaposlenik(int postotak_Place) {
        this.postotak_Place = (double)postotak_Place/100;
    }

    @Override
    public void ispisi_Prihod_Malog_Vlaka(Vlak maliVlak) {
       System.out.println("Zaposlenikov prihod od malog vlaka: " + maliVlak.getSuma() * postotak_Place  + "kn");
    }

    @Override
    public void ispisi_Prihod_Velikog_Vlaka(Vlak velikiVlak) {
       System.out.println("Zaposlenikov prihod od velikog vlaka: " + velikiVlak.getSuma()  * postotak_Place  + "kn");
    }

    @Override
    public void provjera_Plin(List<Vozila> vozilo) {
        for (Vozila v : vozilo) {
            postotak_Plina = v.generiraj_Kolicinu_Plina();
            if (postotak_Plina < 10) {
                System.out.println("Vozilo sadrzi: " + postotak_Plina +"% plina, vozilo se mora napuniti");
            } else {
                System.out.println("Vozilo Sadrzi: " + postotak_Plina + "% plina");
            }
        };

    }


    @Override
    public void provjera_Baterije(List<Vozila> vozilo) {
        for (Vozila v : vozilo) {
            napunjenost_Baterije = v.generiraj_Napunjenost_Baterije();
            if (napunjenost_Baterije < 10) {
                System.out.println("Vozilo sadrzi: " + napunjenost_Baterije +"% napunjenosti baterije, vozilo se mora napuniti");
            } else {
                System.out.println("Vozilo Sadrzi: " + napunjenost_Baterije + "% napunjenosti baterije");
            }
        };
    }

    @Override
    public double getPostotak_Place() {
        return postotak_Place;
    }

    @Override
    public double getNapunjenost_Baterije() {
        return napunjenost_Baterije;
    }

    @Override
    public double get_Postotak_Plina() {
       return postotak_Plina;
    }
}
