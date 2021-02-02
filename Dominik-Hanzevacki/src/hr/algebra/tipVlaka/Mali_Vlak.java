/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.tipVlaka;

import hr.algebra.interfaces.Vlak;
import hr.algebra.interfaces.Vozila;
import hr.algebra.tipVozila.Automobil;
import hr.algebra.tipVozila.Kombij;
import java.util.List;

/**
 *
 * @author Domi
 */
public class Mali_Vlak implements Vlak{

    private List<Vozila> broj_Automobila;
    private List<Vozila> broj_Kombija;

    private Automobil automobil = new Automobil();
    private Kombij kombij = new Kombij();

    public Mali_Vlak(List<Vozila> broj_Automobila, List<Vozila> broj_Kombija) {
        this.broj_Automobila = broj_Automobila;
        this.broj_Kombija = broj_Kombija;
    }

    public void ispisi_Cijenu_Malog_Vlaka(Mali_Vlak mali_Vlak) {
        if (mali_Vlak.broj_Automobila.size() + mali_Vlak.broj_Kombija.size() <= 8) {
            System.out.println(
                    "Ukupan prihod karata malog vlaka: " + Ispisi_Prihod() + "kn"
            );
        } else {
            System.out.println("Mali vlak može imati mjesta samo za 8 malih vozila");
        }
    }

    @Override
    public int Ispisi_Prihod() {
       return broj_Automobila.size() * automobil.ispisiCijenu() + broj_Kombija.size() * kombij.ispisiCijenu();
    }

}
