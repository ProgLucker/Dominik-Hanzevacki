/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.tipVlaka;

import hr.algebra.interfaces.Vlak;
import hr.algebra.interfaces.Vozila;
import hr.algebra.tipVozila.Autobus;
import hr.algebra.tipVozila.Kamion;
import java.util.List;

/**
 *
 * @author Domi
 */
public class Veliki_Vlak implements Vlak {

    private List<Vozila> broj_Autobusa;
    private List<Vozila> broj_Kamiona;

    private Autobus autobus = new Autobus();
    private Kamion kamion = new Kamion();

    private int suma;

    public Veliki_Vlak(List<Vozila> broj_Autobusa, List<Vozila> broj_Kamiona) {
        this.broj_Autobusa = broj_Autobusa;
        this.broj_Kamiona = broj_Kamiona;
        this.suma = broj_Autobusa.size() * autobus.ispisiCijenu() + broj_Kamiona.size() * kamion.ispisiCijenu();
    }

    @Override
    public void Ispisi_Prihod() {
        if (broj_Autobusa.size() + broj_Kamiona.size() <= 6) {
            System.out.println(
                    "Ukupan prihod karata velikog vlaka: " + suma + "kn"
            );
        } else {
            System.out.println("Mali vlak može imati mjesta samo za 6 velikih vozila");
        }
    }

    @Override
    public int getSuma() {
        return suma;
    }


}
