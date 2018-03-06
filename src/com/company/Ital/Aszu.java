package com.company.Ital;

public class Aszu extends Bor{
    private int puttony;
    static String fajta = "aszu";

    public Aszu(int evjarat, int puttony) {
        super(fajta, evjarat); //az ősre hivatkozik
        this.puttony = puttony;
    }

    public int getPuttony() {
        return puttony;
    }

    public int setPuttony(int puttony) {
        this.puttony = puttony;
        System.out.println(puttony);
        if (puttony < 0) {
            System.out.println("Pozitív számot adj meg.");
        }
        return puttony;
    }

    @Override
    public String toString() {
        return "Ez egy aszú, melynek évjárata: " + getEvjarat() + " és " + puttony + " puttonyos.";
    }
}
