public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        double a = 234;
        boolean b = true;
        String c = "Takie";
        long d = 546461646;
        float e = 1354.24f;
        System.out.println("zmienna double = " + a);
        System.out.println("zmienna Bool = " + b);
        System.out.println("zmienna String = " + c);
        System.out.println("zmienna long = " + d);
        System.out.println("zmienna float = " + e + "\n\n");

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        int liczbaA = 52;
        int liczbaB = 12;

        double liczbaX = 1.5;
        double liczbaY = 54.2;

        System.out.println("Dodawanie liczbaA + liczbaB = " + (liczbaA + liczbaB));
        System.out.println("Odejmowanie liczbaA + liczbaB = " + (liczbaA - liczbaB));
        System.out.println("Mnożenie liczbaA + liczbaB = " + (liczbaA * liczbaB));
        System.out.println("Dzielenie liczbaA + liczbaB = " + (liczbaA / liczbaB));
        System.out.println("Modulo liczbaA + liczbaB = " + (liczbaA % liczbaB) + "\n");

        System.out.println("Dodawanie liczbaX + liczbaY = " + (liczbaX + liczbaY));
        System.out.println("Odejmowanie liczbaX + liczbaY = " + (liczbaX - liczbaY));
        System.out.println("Mnożenie liczbaX + liczbaY = " + (liczbaX * liczbaY));
        System.out.println("Dzielenie liczbaX + liczbaY = " + (liczbaX / liczbaY));
        System.out.println("Modulo liczbaX + liczbaY = " + (liczbaX % liczbaY));

    }
}
