                                    //INTERFACCE
//a differenza delle classi astratte la keyword e implements
public class Leone implements Predatore{

    @Override
    public void caccia() {
        System.out.println("Il leone parte all'attacco");
    }
}
