package presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        * Injection of dependencies via static instantiation.
        * */
        MetierImpl metier = new MetierImpl();
        metier.setDao(new DaoImpl()); // here is the line we need always to change if we wanna change version of DaoImpl
        System.out.println(metier.calcul());
        // we did really avoid couplage fort in dao and metier layers, bot we still witness it in presentation leayer
        // because we still use stuff like "new MetierImpl() & new DaoImpl". Now if i want to use another version
        // DaoImpl2, we need to change the source code of 1 class which is presentation, so it still not good enough.
        // So, instead of Injecting dependencies via static instantiation, we can do via dynamic instantiation.
    }
}
