public class PR430Main {

    public static void main(String[] args) {
        System.out.println("Iniciant 0");
        PR430Objecte sglt1 = PR430Objecte.getInstance("David", "Sanchez", 35);
        System.out.println("Iniciant 1");
        PR430Objecte sglt2 = PR430Objecte.getInstance("Gean", "Biagi", 20);
        System.out.println("Iniciant 2");
        PR430Objecte sglt3 = PR430Objecte.getInstance("Pepe", "Garcia", 80);

        System.out.println(sglt1);
        System.out.println(sglt2);
        System.out.println(sglt3);
    }
}
