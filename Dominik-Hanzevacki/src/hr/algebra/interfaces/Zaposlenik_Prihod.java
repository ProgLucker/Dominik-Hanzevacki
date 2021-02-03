/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.interfaces;

import java.util.List;

/**
 *
 * @author Domi
 */
public interface Zaposlenik_Prihod {

    void ispisi_Prihod_Malog_Vlaka(Vlak maliVlak);

    void ispisi_Prihod_Velikog_Vlaka(Vlak velikiVlak);

    void provjera_Plin(List<Vozila> vozilo);

    void provjera_Baterije(List<Vozila> vozilo);

    double getPostotak_Place();

    double getNapunjenost_Baterije();

    double get_Postotak_Plina();
}
