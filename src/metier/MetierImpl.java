package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    IDao dao;  // couplage faible

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*30/Math.cos(Math.PI);
        return res;
    }

    //maintenant on aura besoin d'une maniere pour remplir l'attr dao par un objet, cet objet peut etre n'importe quelle classe qui implemente IDao. (btw here we did polymorphisme Idao dao = new DaoIml)
    // Pour ce faire, on genere une methode setDao


    public void setDao(IDao dao) {  // On peut passer comme argument un objet d'une classe qui implemente IDao
        this.dao = dao;
    }
}
