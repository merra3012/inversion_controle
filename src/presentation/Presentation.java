package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        metier.setDao(new DaoImpl());
        System.out.println(metier.calcul());
    }
}
