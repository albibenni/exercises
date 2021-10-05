package Aerodromo;
//Esercizio 11 In un'aerodromo si vuol mantenere informazioni sugli aeromobili.
// Di ogni aeromobile si vuole sapere la sigla (string) che lo identifica.
// Gli alianti sono aeromobili caratterizzati da un numero (int) che ne descrive l'efficienza aereodinamica.
// Degli aerei a motore si vuole sapere la potenza in CV del motopropulsore (double).

public class Aeromobile {
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    private String sigla;
}
