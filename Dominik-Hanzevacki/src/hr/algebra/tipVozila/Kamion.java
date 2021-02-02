/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.tipVozila;

import hr.algebra.interfaces.Vozila;
import java.util.Random;

/**
 *
 * @author Domi
 */
public class Kamion implements Vozila {

    private String tip_Kamiona;
    private double kolicina_Goriva;
    private double napunjenost_Baterije;

    public Kamion() {
    }

    public Kamion(String tip_Kamiona) {
        this.tip_Kamiona = tip_Kamiona;
    }

    public double getKolicina_Goriva() {
        return kolicina_Goriva;
    }

    @Override
    public int ispisiCijenu() {
        return 90;
    }

    @Override
    public double generiraj_Kolicinu_Plina() {
         Random r = new Random();
        int kolicina_Plina = r.nextInt(100);
        return kolicina_Plina;
    }
     @Override
    public double generiraj_Napunjenost_Baterije() {
        Random r = new Random();
        int postotak_Baterije = r.nextInt(100);
        return postotak_Baterije;
    }

}
