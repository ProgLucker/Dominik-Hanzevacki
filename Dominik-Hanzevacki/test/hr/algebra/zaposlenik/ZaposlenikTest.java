/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.zaposlenik;

import hr.algebra.interfaces.Vlak;
import hr.algebra.interfaces.Vozila;
import hr.algebra.tipVlaka.Mali_Vlak;
import hr.algebra.tipVlaka.Veliki_Vlak;
import hr.algebra.tipVozila.Automobil;
import hr.algebra.tipVozila.Kombij;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Domi
 */
public class ZaposlenikTest {

    public ZaposlenikTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ispisi_Prihod_Malog_Vlaka method, of class Zaposlenik.
     */
    @Test
    public void testIspisi_Prihod_Malog_Vlaka() {
        System.out.println("ispisi_Prihod_Malog_Vlaka");
        System.out.println("ispisi_Prihod_Malog_Vlaka");
        List<Vozila> list_Automobila = new ArrayList<>();
        Automobil automobil1 = new Automobil("Automobil1");
        Automobil automobil2 = new Automobil("Automobil2");

        list_Automobila.add(automobil1);
        list_Automobila.add(automobil2);
        List<Vozila> list_Kombija = new ArrayList<>();
        Kombij kombij1 = new Kombij("Kombij1");
        Kombij kombij2 = new Kombij("Kombij2");

        list_Kombija.add(kombij1);
        list_Kombija.add(kombij2);

        Vlak mali_Vlak = new Mali_Vlak(list_Automobila, list_Kombija);

        Zaposlenik zaposlenik1 = new Zaposlenik(10);

        double expResult = 0.26;
        double result = mali_Vlak.getSuma() * zaposlenik1.getPostotak_Place() / 100;
        assertEquals(expResult, result,0);
        System.out.println("Prihod mora biti: " + expResult + ", Rezultat testa je: " + result);

    }

    /**
     * Test of ispisi_Prihod_Velikog_Vlaka method, of class Zaposlenik.
     */
    @Test
    public void testIspisi_Prihod_Velikog_Vlaka() {
        System.out.println("ispisi_Prihod_Velikog_Vlaka");

        System.out.println("ispisi_Prihod_Velikog_Vlaka");
        List<Vozila> list_Automobila = new ArrayList<>();
        Automobil automobil1 = new Automobil("Automobil1");
        Automobil automobil2 = new Automobil("Automobil2");

        list_Automobila.add(automobil1);
        list_Automobila.add(automobil2);
        List<Vozila> list_Kombija = new ArrayList<>();
        Kombij kombij1 = new Kombij("Kombij1");
        Kombij kombij2 = new Kombij("Kombij2");

        list_Kombija.add(kombij1);
        list_Kombija.add(kombij2);

        Vlak veliki_Vlak = new Veliki_Vlak(list_Automobila, list_Kombija);

        Zaposlenik zaposlenik1 = new Zaposlenik(10);
        zaposlenik1.ispisi_Prihod_Malog_Vlaka(veliki_Vlak);

        double expResult = 0.32;
        double result = veliki_Vlak.getSuma() * zaposlenik1.getPostotak_Place() / 100;

        assertEquals(expResult, result,0);

        System.out.println("Prihod mora biti: " + expResult + ", Rezultat testa je: " + result);
    }

    /**
     * Test of provjera_Plin method, of class Zaposlenik.
     */
    @Test
    public void testProvjera_Plin() {
        System.out.println("provjera_Plin");
        List<Vozila> list_Automobila = new ArrayList<>();
        Automobil automobil1 = new Automobil("Automobil1");
        Automobil automobil2 = new Automobil("Automobil2");

        list_Automobila.add(automobil1);
        list_Automobila.add(automobil2);

        Zaposlenik zaposlenik1 = new Zaposlenik(10);
        zaposlenik1.provjera_Plin(list_Automobila);
        System.out.println("Postotak plina je: " + zaposlenik1.get_Postotak_Plina());
    }

    /**
     * Test of getPostotak_Place method, of class Zaposlenik.
     */
    @Test
    public void testGetPostotak_Place() {
        System.out.println("getPostotak_Place");
        Zaposlenik zaposlenik1 = new Zaposlenik(10);
        System.out.println("Postotak plina je: " + zaposlenik1.getPostotak_Place());
    }

    /**
     * Test of provjera_Baterije method, of class Zaposlenik.
     */
    @Test
    public void testProvjera_Baterije() {
        List<Vozila> list_Automobila = new ArrayList<>();
        Automobil automobil1 = new Automobil("Automobil1");
        Automobil automobil2 = new Automobil("Automobil2");

        list_Automobila.add(automobil1);
        list_Automobila.add(automobil2);

        Zaposlenik zaposlenik1 = new Zaposlenik(10);
        zaposlenik1.provjera_Baterije(list_Automobila);
        System.out.println("Postotak plina je: " + zaposlenik1.getNapunjenost_Baterije());
    }

}
