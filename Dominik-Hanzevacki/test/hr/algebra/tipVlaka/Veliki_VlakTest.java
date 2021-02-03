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
public class Veliki_VlakTest {
    
    public Veliki_VlakTest() {
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
     * Test of Ispisi_Prihod method, of class Veliki_Vlak.
     */
    @Test
    public void testIspisi_Prihod() {
        System.out.println("Ispisi_Prihod");
       List<Vozila> list_Autobus = new ArrayList<>();
        Autobus autobus1 = new Autobus("Autobus1");
        Autobus autobus2 = new Autobus("Autobus2");

        list_Autobus.add(autobus1);
        list_Autobus.add(autobus2);
        List<Vozila> list_Kamiona = new ArrayList<>();
        Kamion kamion1 = new Kamion("Kamion1");
        Kamion kamion2 = new Kamion("Kamion2");
        
        list_Kamiona.add(kamion1);
        list_Kamiona.add(kamion2);
        
        Vlak veliki_Vlak = new Veliki_Vlak(list_Autobus,list_Kamiona);
        
        int expResult = 320;
        int result = veliki_Vlak.getSuma();
        assertEquals(expResult, result);
        
         System.out.println("Prihod mora biti: " + expResult + ", Rezultat testa je: " + result);
    }

    /**
     * Test of getSuma method, of class Veliki_Vlak.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        List<Vozila> list_Autobus = new ArrayList<>();
        Autobus autobus1 = new Autobus("Autobus1");
        Autobus autobus2 = new Autobus("Autobus2");

        list_Autobus.add(autobus1);
        list_Autobus.add(autobus2);
        List<Vozila> list_Kamiona = new ArrayList<>();
        Kamion kamion1 = new Kamion("Kamion1");
        Kamion kamion2 = new Kamion("Kamion2");
        
        list_Kamiona.add(kamion1);
        list_Kamiona.add(kamion2);
        
        Vlak veliki_Vlak = new Veliki_Vlak(list_Autobus,list_Kamiona);
        
        int expResult = 320;
        int result = veliki_Vlak.getSuma();
        assertEquals(expResult, result);
        
         System.out.println("Prihod mora biti: " + expResult + ", Rezultat testa je: " + result);
    }
    
}
