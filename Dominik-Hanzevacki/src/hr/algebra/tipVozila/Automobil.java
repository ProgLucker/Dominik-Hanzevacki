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
public class Automobil implements Vozila {

    private String tip_Automobila;
    private double kolicina_Goriva = generiraj_Kolicinu_Plina();

    public Automobil() {
    }

    public Automobil(String tip_Automobila) {
        this.tip_Automobila = tip_Automobila;
    }

    @Override
    public int ispisiCijenu() {
        return 50;
    }

    @Override
    public double generiraj_Kolicinu_Plina() {
        Random r = new Random();
        int game = r.nextInt(100);
        return game;
    }

}
