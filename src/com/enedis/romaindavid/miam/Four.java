package com.enedis.romaindavid.miam;


public class Four {
    int puissance;
    int capacite;
    private Resistance resistance;
    private Soufflerie soufflerie;
    /**
     *
     */

    public void cuire(Aliment aliment) {
        System.out.println("Je cuis un aliment : " + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.estCuit = true;
    }


    public void cuire(int temperature, int duree) {
    }

    private void maintenir(){

    }
    public Resistance getResistance() {
        return resistance;
    }
    public void setSoufflerie(Soufflerie soufflerie) {
        this.soufflerie = soufflerie;
    }


}
