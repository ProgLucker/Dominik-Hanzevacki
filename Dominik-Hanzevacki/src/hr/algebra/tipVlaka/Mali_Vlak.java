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
    
    private int suma;

    public Mali_Vlak(List<Vozila> broj_Automobila, List<Vozila> broj_Kombija) {
        this.broj_Automobila = broj_Automobila;
        this.broj_Kombija = broj_Kombija;
        this.suma = broj_Automobila.size() * automobil.ispisiCijenu() + broj_Kombija.size() * kombij.ispisiCijenu();
    }
    @Override
    public void Ispisi_Prihod() {
       if (broj_Automobila.size() + broj_Kombija.size() <= 8) {
            System.out.println(
                    "Ukupan prihod karata malog vlaka: " + suma + "kn"
            );
        } else {
            System.out.println("Mali vlak može imati mjesta samo za 8 malih vozila");
        }
    }

    @Override
    public int getSuma() {
        return suma;
    }

}
