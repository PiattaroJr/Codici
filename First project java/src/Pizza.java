public class Pizza {
    String impasto;
    String salsa;
    String formaggio;
    String extra;
    String extra2;

    //Esempio di overloaded constructors
    Pizza(String impasto){
        this.impasto = impasto;
        System.out.println("Ingredienti: "+this.impasto);
    }
    Pizza(String impasto, String salsa){
        this.impasto = impasto;
        this.salsa = salsa;
        System.out.println("Ingredienti: "+this.impasto+", "+this.salsa);
    }
    Pizza(String impasto, String salsa, String formaggio){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        System.out.println("Ingredienti: "+this.impasto+", "+this.salsa+", "+this.formaggio);
    }
    Pizza(String impasto, String salsa, String formaggio, String extra){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        System.out.println("Ingredienti: "+this.impasto+", "+this.salsa+", "+this.formaggio+", "+this.extra);
    }
    Pizza(String impasto, String salsa, String formaggio, String extra, String extra2){
        this.impasto = impasto;
        this.salsa = salsa;
        this.formaggio = formaggio;
        this.extra = extra;
        this.extra2 = extra2;
        System.out.println("Ingredienti: "+this.impasto+", "+this.salsa+", "+this.formaggio+", "+this.extra+", "+this.extra2);
    }
}