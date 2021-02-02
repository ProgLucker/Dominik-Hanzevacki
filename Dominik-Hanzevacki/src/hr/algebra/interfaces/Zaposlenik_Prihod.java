/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.interfaces;

import hr.algebra.tipVlaka.Mali_Vlak;
import hr.algebra.tipVlaka.Veliki_Vlak;
import java.util.List;

/**
 *
 * @author Domi
 */
public interface Zaposlenik_Prihod {

    void ispisi_Prihod_Malog_Vlaka(Mali_Vlak maliVlak);

    void ispisi_Prihod_Velikog_Vlaka(Veliki_Vlak velikiVlak);

    void provjera_Plin(List<Vozila> vozilo);

    void provjera_Baterije(List<Vozila> vozilo);
}
