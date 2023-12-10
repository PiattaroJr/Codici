                                    //INTERFACCE
//a differenza delle classi astratte la keyword e implements
public class Pesce implements Predatore, Preda {

    @Override
    public void scappa() {
        System.out.println("Il pesce piccolo scappa da quelli più grossi");
    }
    @Override
    public void caccia() {
        System.out.println("Il pesce grosso caccia quelli più piccoli");
    }
}
