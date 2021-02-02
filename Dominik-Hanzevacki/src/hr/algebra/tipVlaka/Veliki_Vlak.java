/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.tipVlaka;

import hr.algebra.interfaces.Vlak;
import hr.algebra.tipVozila.Autobus;
import hr.algebra.tipVozila.Kamion;
import java.util.List;

/**
 *
 * @author Domi
 */
public class Veliki_Vlak implements Vlak {

    private List<Autobus> broj_Autobusa;
    private List<Kamion> broj_Kamiona;

    private Autobus autobus = new Autobus();
    private Kamion kamion = new Kamion();

    public Veliki_Vlak(List<Autobus> broj_Autobusa, List<Kamion> broj_Kamiona) {
        this.broj_Autobusa = broj_Autobusa;
        this.broj_Kamiona = broj_Kamiona;
    }

    public void ispisi_Cijenu_Malog_Vlaka(Veliki_Vlak veliki_Vlak) {
        if (veliki_Vlak.broj_Autobusa.size() + veliki_Vlak.broj_Kamiona.size() <= 6) {
            System.out.println(
                    "Ukupan prihod karata velikog vlaka: " + Ispisi_Prihod() + "kn"
            );
        } else {
            System.out.println("Mali vlak može imati mjesta samo za 6 velikih vozila");
        }
    }

    @Override
    public int Ispisi_Prihod() {
        return broj_Autobusa.size() * autobus.ispisiCijenu() + broj_Kamiona.size() * kamion.ispisiCijenu();
    }

}
