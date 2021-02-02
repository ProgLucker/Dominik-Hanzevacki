package hr.algebra;

import hr.algebra.tipVlaka.Mali_Vlak;
import hr.algebra.tipVlaka.Veliki_Vlak;
import hr.algebra.tipVozila.Autobus;
import hr.algebra.tipVozila.Automobil;
import hr.algebra.tipVozila.Kamion;
import hr.algebra.tipVozila.Kombij;
import hr.algebra.zaposlenik.Zaposlenik;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Domi
 */
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Automobil> list_Automobila = new ArrayList<>();
        Automobil automobil1 = new Automobil("Automobil1");
        Automobil automobil2 = new Automobil("Automobil2");

        list_Automobila.add(automobil1);
        list_Automobila.add(automobil2);
        List<Kombij> list_Kombija = new ArrayList<>();
        Kombij kombij1 = new Kombij("Kombij1");
        Kombij kombij2 = new Kombij("Kombij2");
        
        list_Kombija.add(kombij1);
        list_Kombija.add(kombij2);
        
        Mali_Vlak mali_Vlak = new Mali_Vlak(list_Automobila,list_Kombija);
        mali_Vlak.ispisi_Cijenu_Malog_Vlaka(mali_Vlak);

        List<Autobus> list_Autobus = new ArrayList<>();
        Autobus autobus1 = new Autobus("Autobus1");
        Autobus autobus2 = new Autobus("Autobus2");

        list_Autobus.add(autobus1);
        list_Autobus.add(autobus2);
        List<Kamion> list_Kamiona = new ArrayList<>();
        Kamion kamion1 = new Kamion("Kamion1");
        Kamion kamion2 = new Kamion("Kamion2");
        
        list_Kamiona.add(kamion1);
        list_Kamiona.add(kamion2);
        
        Veliki_Vlak veliki_Vlak = new Veliki_Vlak(list_Autobus,list_Kamiona);
        veliki_Vlak.ispisi_Cijenu_Malog_Vlaka(veliki_Vlak);

        Zaposlenik zaposlenik = new Zaposlenik();
        zaposlenik.ispisi_Prihod_Malog_Vlaka(mali_Vlak);
        zaposlenik.ispisi_Prihod_Velikog_Vlaka(veliki_Vlak);

    }

}
