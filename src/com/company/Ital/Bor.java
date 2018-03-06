package com.company.Ital;

public class Bor{
    private String fajta; //kisbetu
    private int evjarat;

    public Bor(String fajta, int evjarat) {
        this.fajta = fajta;
        this.evjarat = evjarat;
    }

    public String fajmod(String ujFajta) {
        fajta = ujFajta;
        return ujFajta;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        fajta = fajta;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public int setEvjarat(int evjarat) {
        evjarat = evjarat;
        if (evjarat < 0){
            System.out.println("Pozitív számot adj meg.");
        }
        return evjarat;
    }

    @Override
    public String toString() {
        return ("Ez egy bor, ami " + fajta + ", melynek évjárata: " + evjarat);
    }
}
