/*-----------------------------------------------------
la classe macchina e costretta ad implementare
i metodi astratti ereditati della classe Veicolo
-----------------------------------------------------*/
public class Macchina extends Veicolo{

    @Override
    void muovi() {
        System.out.println("la macchina è in marcia");
    }

    @Override
    void frena() {
        System.out.println("la macchina frena");
    }
}