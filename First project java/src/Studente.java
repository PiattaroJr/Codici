/*----------------------------------------------------------
per sfruttare l'ereditarietà di java
dobbiamo aggiungere la keyward extends ad un altra classe
----------------------------------------------------------*/
public class Studente extends Persona{

    private String materiaPreferita;

    Studente(String nome, String cognome, String materiaPreferita){
        super(nome, cognome);
        this.materiaPreferita = materiaPreferita;
    }

    //altro esempio di getters
    public String getMateriaPreferita(){
        return materiaPreferita;
    }

    void studia(){
        System.out.println("Sto studiando...");
    }

    @Override
    void saluta(){
        System.out.println("Buongiorno prof!");
    }
}