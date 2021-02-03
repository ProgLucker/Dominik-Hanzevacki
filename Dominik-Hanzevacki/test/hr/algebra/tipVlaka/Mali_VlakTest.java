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
public class Mali_VlakTest {

    public Mali_VlakTest() {
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
     * Test of Ispisi_Prihod method, of class Mali_Vlak.
     */
    @Test
    public void testIspisi_Prihod() {
        System.out.println("Ispisi_Prihod");
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

        int expResult = 260;
        int result = mali_Vlak.getSuma();
        assertFalse("Prihod mora biti jedna rezultatu testa!", false);
        assertEquals(expResult, result, 0);
        System.out.println("Prihod mora biti: " + expResult + ", Rezultat testa je: " + result);

    }

    /**
     * Test of getSuma method, of class Mali_Vlak.
     */
    @Test
    public void testGetSuma() {
        System.out.println("Ispisi Sumu");
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
        int expResult = 260;
        int result = mali_Vlak.getSuma();

        assertFalse("Prihod mora biti jedna rezultatu testa!", false);
        assertEquals(expResult, result, 0);
        System.out.println("Prihod mora biti: " + expResult + ", Rezultat testa je: " + result);
    }

}
