import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Merce merce = new Merce();

        //inserimento dei parametri
        System.out.println("Inserisci il codice merce: ");
        merce.setCodiceMerce(scanner.nextLine());

        System.out.println("Inserisci la descrizione della merce: ");
        merce.setDescrizione(scanner.nextLine());

        System.out.println("Inserisci la quantità della merce: ");
        merce.setQuantita(scanner.nextInt());

        System.out.println("Inserisci il prezzo unitario della merce: ");
        merce.setPrezzoUnitario(scanner.nextDouble());

        System.out.println("Inserisci il tipo di pagamento della merce: \ncontanti = false / rateale = true");
        merce.setTipoPagamento(scanner.nextBoolean());

        //gestione del pagamento

        merce.setPrezzoQ(merce.getPrezzoUnitario(), merce.getQuantita());

        merce.setPrezzoTotale(merce.getPrezzoQ(), merce.getTipoPagamento());

        //stampa
        System.out.println(merce);
        //scrivere merce o merce.toString e la stessa cosa 

        scanner.close();
    }
}