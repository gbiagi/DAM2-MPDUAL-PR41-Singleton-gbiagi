public class PR431Objecte {
    private static PR431Objecte instance;
    private String _nom;
    private String _cognom;
    private int _edat;
    private PR431Objecte (String nom, String cognom, int edat) {
        this._nom = nom;
        this._cognom = cognom;
        this._edat = edat;
    }

    public static PR431Objecte getInstance(String nom, String cognom, int edat) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (instance == null) {
            instance = new PR431Objecte(nom, cognom, edat);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Nom: " + _nom + "     Cognom: " + _cognom + "     Edat: " + _edat;
    }
}