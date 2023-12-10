public class Percentuali {

    // Calcola la percentuale di un determinato valore
    public static double calcolaPercentuale(double valore, double percentuale) {
        return valore * (percentuale / 100.0);
    }

    // Aumenta un valore del dato incremento percentuale
    public static double aumentaDiPercentuale(double valore, double incrementoPercentuale) {
        return valore + calcolaPercentuale(valore, incrementoPercentuale);
    }

    // Riduci un valore del dato decremento percentuale
    public static double riduciDiPercentuale(double valore, double decrementoPercentuale) {
        return valore - calcolaPercentuale(valore, decrementoPercentuale);
    }

}
