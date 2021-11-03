import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Poodaj swoje Imie: ");
        String imie = scan.next();
        System.out.print("Poodaj swoje Nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj swój wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj swój nr indeksu: ");
        int nr = scan.nextInt();

        System.out.println(imie + " " + nazwisko);
        System.out.print("Wiek: " + wiek);
        System.out.println(" Nr. indeksu: " + nr);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        System.out.print("Wpisz pierwszą liczbę: ");
        int a = scan.nextInt();
        System.out.print("Wpisz drugą liczbę: ");
        int b = scan.nextInt();

        System.out.println("Dodawanie  = " + (a + b));
        System.out.println("Odejmowanie = " + (a - b));
        System.out.println("Mnożenie = " + (a * b));
        System.out.println("Dzielenie = " + (a / b));
        System.out.println("Modulo = " + (a % b) + "\n");
    }
}
