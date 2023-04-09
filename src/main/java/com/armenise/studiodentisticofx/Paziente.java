package com.armenise.studiodentisticofx;

public class Paziente {

    private String cognome;
    private String nome;
    private String informazioni;

    public Paziente(String cognome, String nome, String informazioni) {
        this.cognome = cognome;
        this.nome = nome;
        this.informazioni = informazioni;
    }

    @Override
    public String toString() {
        return "Paziente {" + "cognome='" + cognome + '\'' + ", nome='" + nome + '\'' + ", informazioni='" + informazioni + '\'' + '}';
    }

}
