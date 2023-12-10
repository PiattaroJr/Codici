public class Persona {
//--------------------------------------------------------------------------------------------------------------
                                        //ATTRIBUTI

    //questi sono gli attributi della classe persona

    private String nome;
    private String cognome;
    private static int numeroPersone = 0;

//--------------------------------------------------------------------------------------------------------------
                                        //COSTRUTTORE
    // Questo e un costruttore
    Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        numeroPersone++;
    }

//--------------------------------------------------------------------------------------------------------------

                                        //INCAPSULAMENTO
                                           //getters
    /*----------------------------------------------------------------
    questi metodi di seguito si chiamano getters
    e servono per ritornare al main gli attributi private altrimenti
    bloccati/invisibili alle altre classi come il main
    -----------------------------------------------------------------*/
    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public static int getNumeroPersone(){
        return numeroPersone;
    }

//--------------------------------------------------------------------------------------------------------------

                                        //INCAPSULAMENTO
                                           //setters
    /*-------------------------------------------------------------------------
    questi altri di seguito sono i setters e come i getters servono
    ad avere un codice piu sicuro e servono a modificare un attributo
    private altrimenti inmodificabile in un'altra classe(ES. la classe main)
    -------------------------------------------------------------------------*/

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

//--------------------------------------------------------------------------------------------------------------

                                        //OVERLOAD

    //esempi di overload di metodi

    void saluta(){
        System.out.println("ciao io sono "+this.nome);
    }

    //in questo modo ho passato un oggetto come parametro nel metodo saluta
    void saluta(Persona personaDaSalutare){
        System.out.println("ciao " +personaDaSalutare.nome+" io sono "+this.nome);
    }

    /*--------------------------------------------------------------
    con l'overload dei metodi e possibile richiamare un metodo
    con lo stesso nome di un altro pero facendogli svolgere
    azioni diverse semplicemente cambiando i parametri che riceve
    --------------------------------------------------------------*/

//--------------------------------------------------------------------------------------------------------------

                                            //OVERRIDE
    //esempio di override di un metodo

    //per stampare gli attributi abbiamo bisogno di sovrascrivere il metodo toString()
    //per sovrascriverlo si fa cosi...
    @Override
    public String toString(){
        String stringa = this.nome +"\n"+ this.cognome;
        return stringa;
    }
    //cosi ho eseguito l'override

//--------------------------------------------------------------------------------------------------------------

                                        //COPIARE UN OGGETTO
                //cioe copiare in un oggetto tutti i dati e incollarli in un altro

    //inizialmente creiamo un metodo copy e poi lo inseriamo in un costruttore
    public void copy(Persona persona){
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }

    Persona(Persona persona){
        this.copy(persona);
    }

//--------------------------------------------------------------------------------------------------------------
}
