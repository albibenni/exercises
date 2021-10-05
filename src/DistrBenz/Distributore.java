package DistrBenz;

import java.util.Comparator;

//Esercizio 9 Scrivi un programma che sia in grado di istanziare degli oggetti 'distributori di benzina'
// di cui sia nota la città, il proprietario, la capacità e la benzina attualmente contenuta nel distributore.
// Dell'oggetto Distributore, deve essere possibile simulare le operazioni di erogazione del carburante e
// dei corrispondenti incassi. Implementa una interfaccia Comparable,
// in modo da consentire il confronto tra 2 distributori in base alla capacità del serbatoio di carburante.
public class Distributore {
    private String citta, proprietario;
    private double capacita, benzContenuta;
    private double incassi = 0.0;
    //statico: new crea una nuova var statica o no?

    public Distributore(String citta, String proprietario, Double capacita, Double benzContenuta){
        this.citta = citta;
        this.proprietario = proprietario;
        this.capacita = capacita;
        this.benzContenuta = benzContenuta;
    }

    public void erogazione(Double liters){
        setBenzContenuta(benzContenuta-liters);
        setIncassi(incassi+liters);
    }

    public void rifornimento(Double liters){
        setBenzContenuta(benzContenuta+liters);
    }
    public double getIncassi() {
        return incassi;
    }

    public void setIncassi(double incassi) {
        this.incassi = incassi;
    }
    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Double getCapacita() {
        return capacita;
    }

    public void setCapacita(Double capacita) {
        this.capacita = capacita;
    }

    public Double getBenzContenuta() {
        return benzContenuta;
    }

    public void setBenzContenuta(Double benzContenuta) {
        this.benzContenuta = benzContenuta;
    }


}
