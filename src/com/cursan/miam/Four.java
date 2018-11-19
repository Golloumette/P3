package com.cursan.miam;

public class Four {
    private int puissance;
    private int capacite;

    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment) {
        System.out.println("Je cuis un aliment:" + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.estCuit=true;
        maintenir();
    }
    private void maintenir(){}

    public int getPuissance(){
        return puissance;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public void setPuissance(int puiissance){
        System.out.println("la puissance est modifiée ");
        this.puissance = puissance;
    }
}

