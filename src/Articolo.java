
public class Articolo {
    private int codice;
    private String descrizione;
    private double prezzo;
    private int quantitaDisponibile;

    public Articolo(int codice, String descrizione, double prezzo, int quantitaDisponibile) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }
}



