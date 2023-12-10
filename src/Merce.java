public class Merce {
//-------------------------------------------------------------------------------
    //ATTRIBUTI
    private String codiceMerce;
    private String descrizione;
    private int quantita;
    private double prezzoUnitario;
    private boolean tipoPagamento;
    private double prezzoQ;
    private double prezzoTotale;
//-------------------------------------------------------------------------------
    //SETTERS
    public void setCodiceMerce(String codiceMerce) {
        this.codiceMerce = codiceMerce;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public void setTipoPagamento(boolean tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setPrezzoQ(double prezzoUnitario, int quantita) {
        this.prezzoQ = prezzoUnitario*quantita;
    }

    public void setPrezzoTotale(double prezzoQ, boolean tipoPagamento){
        if(tipoPagamento){
            this.prezzoTotale = Percentuali.aumentaDiPercentuale(this.prezzoQ, 15);
        }else{
            this.prezzoTotale = Percentuali.riduciDiPercentuale(this.prezzoQ,10);
        }
    }
//-------------------------------------------------------------------------------
    //GETTERS
    public String getCodiceMerce() {
        return codiceMerce;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }
    public boolean getTipoPagamento() {
        return tipoPagamento;
    }

    public double getPrezzoQ() {
        return prezzoQ;
    }

    public double getPrezzoTotale() {
        return prezzoTotale;
    }
    //-------------------------------------------------------------------------------
    //Override del metodo toString per stampare gli attributi della merce
    @Override
    public String toString(){
        String stringa = "Codice merce: "+this.getCodiceMerce()+"\nDescrizione merce: "+this.getDescrizione()+"\nQuantita merce: "+this.getQuantita()+"\nPrezzo unitario merce: "+this.getPrezzoUnitario()+"\nTipo di pagamento: "+this.getTipoPagamento()+"\nPrezzo totale: "+this.getPrezzoTotale();
        return stringa;
    }
}
