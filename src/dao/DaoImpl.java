package dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        /*
        * Se connecter a la base de donnees pour recuperer la temperature
        * */
        System.out.println("Version DB");
        double temp = Math.random()*40;
        return temp;
    }
}
