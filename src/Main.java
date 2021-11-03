import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        int wiek = 24;
        if (wiek % 3 == 0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int index = 49750;
        int parz = (index % 2 == 0) ? 0 : 1;
        if (parz == 0) System.out.println("Index jest parzysty\n");
        if (parz == 1) System.out.println("Index nie jest parzysty\n");

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj ile masz kilometrów do celu: ");
        int samochod = scan.nextInt();
        if (samochod > 100) System.out.println("Musisz zatankować! Nie starczy Ci paliwa aby dojechać do celu!\n");
        else if (samochod == 100) System.out.println("Masz odpowiednią ilość paliwa jak na tą trasę!\n");
        else if (samochod < 100) System.out.println("Możesz spokojnie jechać, paliwa jest w nadmiarze! \n");
    }
}
