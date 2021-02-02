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
public class Autobus implements Vozila {

    private String tip_Autobusa;
    private double kolicina_Goriva = generiraj_Kolicinu_Plina();

    public Autobus() {
    }

    public Autobus(String tip_Autobusa) {
        this.tip_Autobusa = tip_Autobusa;
    }

    @Override
    public int ispisiCijenu() {
        return 70;
    }

    @Override
    public double generiraj_Kolicinu_Plina() {
        Random r = new Random();
        int game = r.nextInt(100);
        return game;
    }

}
