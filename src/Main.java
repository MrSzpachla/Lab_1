import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println("!((a && !c) || (!a || b) && (c || !b))) : " + !((a && !c) || (!a || b) && (c || !b)));
        System.out.println("((a && !b) && (!c || !b)) : " + ((a && !b) && (!c || !b)));

        System.out.println("\n");

        int x = 3;
        int y = 14;
        int z = 32;

        System.out.println("((x >= y) || (y != z)) : " + ((x >= y) || (y != z)));
        System.out.println("((y == z) || (y < z) && (x != z)) : " + ((y == z) || (y < z) && (x != z)));
        System.out.println("((y != x) && (!a || c) && (!c || !b) && (x < z)) : " + ((y != x) && (!a || c) && (!c || !b) && (x < z)));
    }
}
