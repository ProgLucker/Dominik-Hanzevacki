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
public class Kombij implements Vozila {

    private String tip_Kombij;
    private double kolicina_Goriva = generiraj_Kolicinu_Plina();

    public Kombij() {
    }

    public Kombij(String tip_Kombij) {
        this.tip_Kombij = tip_Kombij;
    }

    @Override
    public int ispisiCijenu() {
        return 80;
    }

    @Override
    public double generiraj_Kolicinu_Plina() {
        Random r = new Random();
        int game = r.nextInt(100);
        return game;
    }

}
