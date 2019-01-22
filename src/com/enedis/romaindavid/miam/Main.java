package com.enedis.romaindavid.miam;

public class Main {
    public static void main(String[] args) {
        Four petitFour = new Four();
        petitFour.capacite = 30;
        petitFour.puissance = 180;

        Four grandFour = new Four();
        grandFour.capacite = 55;
        grandFour.puissance = 260;

        petitFour.cuire();
        System.out.println("");
        grandFour.cuire();
    }
}
