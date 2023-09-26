import java.lang.reflect.Constructor;

public class PR431Main {
    public static void main(String[] args) {
        System.out.println("Iniciant 0");
        PR431Objecte sglt1 = PR431Objecte.getInstance("David", "Sanchez", 35);
        System.out.println("Iniciant 1");
        PR431Objecte sglt2 = getNewDestroyedInstance("Gean", "Biagi", 20);
        System.out.println("Iniciant 2");
        PR431Objecte sglt3 = getNewDestroyedInstance("Pepe", "Garcia", 80);

        System.out.println(sglt1);
        System.out.println(sglt2);
        System.out.println(sglt3);
    }
    static PR431Objecte getNewDestroyedInstance (String nom, String cognom, int edat) {

        PR431Objecte result = null;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            Constructor<?>[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                result = (PR431Objecte) constructor.newInstance(nom, cognom, edat);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
