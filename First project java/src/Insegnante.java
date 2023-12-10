/*----------------------------------------------------------
per sfruttare l'ereditarietà di java
dobbiamo aggiungere la keyward extends ad un altra classe
----------------------------------------------------------*/
public class Insegnante extends Persona{
    private String materia;
    Insegnante(String nome, String cognome, String materia){
        super(nome, cognome);
        this.materia = materia;
    }

    //altro esempio di getters
    public String getMateria() {
        return materia;
    }

    void Insegna(){
        System.out.println("sto insegnando...");
    }

    @Override
    void saluta(){
        System.out.println("Sarchiaponi buongiorno!");
    }
}