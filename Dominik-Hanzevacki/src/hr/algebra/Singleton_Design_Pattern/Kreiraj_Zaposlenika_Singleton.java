/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.Singleton_Design_Pattern;

/**
 *
 * @author Domi
 */
public class Kreiraj_Zaposlenika_Singleton {
    private static Kreiraj_Zaposlenika_Singleton zaposlenik;

    private Kreiraj_Zaposlenika_Singleton() {
    }

    public static Kreiraj_Zaposlenika_Singleton getZaposlenik() {
       if (zaposlenik == null) {
            zaposlenik = new Kreiraj_Zaposlenika_Singleton();
            System.out.println("Prvi put pozvana metoda, napravio sam novog zaposlenika!");
        } else {
            System.out.println("Vracam postojeceg zaposlenika!");
        }
        return zaposlenik;
    }
}
