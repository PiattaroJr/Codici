public class Main {
    public static void main(String[] args) {
        persone();
        //veicoli();
        //interfacce();
    }
    static void persone(){
//--------------------------------------------------------------------------------------------------------------

                                    //ISTANZIAMENTO (keyword new)

                     /*------------------------------------------------------------
                                un oggetto e l'istanza della classe
                     con questa dicitura noi stiamo andado a istanziare un oggetto
                     ------------------------------------------------------------*/

        Persona persona1 = new Persona("Luca","Rosso");
        Persona persona2 = new Persona("Marco","Verdi");
        Persona persona3 = new Persona("Anna","Neri");

//--------------------------------------------------------------------------------------------------------------

                                            //INCAPSULAMENTO
            /*----------------------------------------------------------------------------------
            processo in cui nascondiamo attributi di una classe all'esterno mettendoli private
            cosi diventano accessibili solo tramite dei metodi chiamati (GETTERS, SETTERS).
            ----------------------------------------------------------------------------------*/

        //semplice utilizzo del getters
        System.out.println(persona1.getCognome());

        //utilizzo di un setters
        persona1.setCognome("Rossi");
        System.out.println(persona1.getCognome());

        System.out.println("Sono state istanziate "+Persona.getNumeroPersone()+" persone");

//--------------------------------------------------------------------------------------------------------------

                                               //OVERLOAD

        //esempio di overload di metodi

        persona1.saluta();
        persona1.saluta(persona2);
        persona2.saluta(persona1);


        //Pizza pizza1 = new Pizza("integrale","pomodoro");

//--------------------------------------------------------------------------------------------------------------

                                            //ARRAY DI OGGETTI

        //creo un array di oggetti e inserisco le tre persone nell'array
        Persona[] persone = {persona1, persona2, persona3};

        /*-------------------------------------------------------------------------
                              SPIEGAZIONE DELL'OVERRIDE
        se usassimo "System.out.println(persona1);" senza aver fatto un override
        al posto di stamparci gli attributi della persona
        ci stampa l'indirizzo di memoria dove e collocato il nosto oggetto
        -------------------------------------------------------------------------*/


        //invece con l'override del metodo toString() ci stamperà quello che vogliamo
        System.out.println(persone[2]);
        //srivere nelle parentesi (persona1) e uguale a scrivere (persona1.toString())

//--------------------------------------------------------------------------------------------------------------

                                          //EREDITARIETA
        //esempio di ereditarietà

        Studente studente1 = new Studente("Luca", "Rossi", "Storia");
        System.out.println("Sono state istanziate "+Studente.getNumeroPersone()+" persone");
        System.out.println(studente1.getMateriaPreferita());
        studente1.studia();
        studente1.saluta();
        Insegnante insegnante1 = new Insegnante("Marco","Verdi","Matematica");
        insegnante1.Insegna();
        insegnante1.saluta();

//--------------------------------------------------------------------------------------------------------------

                                        //COPIARE UN OGGETTO
        /*------------------------------------------------------------------------------
        Normalmente, se noi volessimo copiare tutti i dati di un oggetto in un altro
        ci verrebbe spontaneo fare (persona2 = persona1), cioe inserire tutti i dati
        della prima persona nella seconda ma cosi facendo non copieremmo solo i dati
        ma anche la locazione di memoria dell'oggetto cosa che vogliamo assolutamente
        evitare dato che cosi facendo tutte le modifiche che apporteremmo in futuro
        avverranno in entrambe le persone.

        Per evitare questo inconveniente ci basta ricorrere ad un metodo da noi creato,
        nel mio caso il metodo "copy()" e poi inserirlo in un costruttore
        cosi da fare un semplice copia e incolla.

        Cosi quando vorremmo creare un oggetto uguale ad un altro ci bastera instanziare
        un nuovo oggetto e nei parametri inserire l'oggetto da copiare
        ------------------------------------------------------------------------------*/

        Persona copiaPersona1 = new Persona(persona1);
        /*----------------------------------------------------------------
        cosi abbiamo ottenuto una copia della persona1 da utilizzare
        come vogliamo senza andare ad intaccare la persona originale
        ----------------------------------------------------------------*/

        copiaPersona1.setNome("Orazio");
        System.out.println(copiaPersona1);
        System.out.println(persona1);

//--------------------------------------------------------------------------------------------------------------

                                            //POLIMORFISMO
        /*------------------------------------------------------------------------------------
        Il polimorfismo e la capacità di un oggetto di identificarsi con più tipi di dato,
        dal greco (Poli = Più / Morfismo = Forme)
        ------------------------------------------------------------------------------------*/

        //poniamo il caso che noi vogliamo mettere in un solo array un insegnante e uno studente
        //Insegnante[] classe = {insegnante1, studente1}
        /*------------------------------------------------------------------------------------------------
        Scriverlo cosi sarebbe a dir poco sbagliato. Allora come risolvere?
        E qui che il polimorfismo ci viene in soccorso dato che ognuno di loro estende
        la classe Persona quindi possono "Cambiare forma" ed identificarsi entrambi con il tipo Persona
        ------------------------------------------------------------------------------------------------*/

        Persona[] classe = {studente1, insegnante1};

        /*----------------------------------------------------------------
        adesso facendo il foreach andremo ad utilizzare il metodo Saluta
        che e un metodo della classe Persona esteso alle due classi
        Studente e Insegnante.
        ----------------------------------------------------------------*/

        for (Persona persona : classe){
            persona.saluta();
        }

//--------------------------------------------------------------------------------------------------------------
    }



    static void veicoli(){
//--------------------------------------------------------------------------------------------------------------

                                            // CLASSI ASTRATTE

        //esempi di classi astratte
        Macchina macchina = new Macchina();
        macchina.muovi();
        macchina.frena();
        macchina.muovi();

//--------------------------------------------------------------------------------------------------------------
    }



    static void interfacce(){
//--------------------------------------------------------------------------------------------------------------

                                            //INTERFACCE

        /*-------------------------------------------------------------------------------------------
        le interfacce possiamo vederle come delle classi astratte ma con la sostanziale differenza
        che a differenza di queste ultime le interfacce possone essere estese da piu classi figlie
        mentre una classe astratta viene ereditata
        -------------------------------------------------------------------------------------------*/

        Leone leone = new Leone();
        Gazzella gazzella = new Gazzella();
        Pesce pesce = new Pesce();

        leone.caccia();
        gazzella.scappa();
        pesce.caccia();
        pesce.scappa();


//--------------------------------------------------------------------------------------------------------------
    }
}