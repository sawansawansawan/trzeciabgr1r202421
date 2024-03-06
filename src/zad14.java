import java.util.Scanner;
public class zad14 {
    public static void main(String[] args) {
        Scanner myszka = new Scanner(System.in);

        System.out.println("Wprowadź wyniki z trzech testów: ");

        System.out.print("Wynik z pierwszego testu: ");
        double test1 = myszka.nextDouble();
        System.out.print("Wynik z drugiego testu: ");
        double test2 = myszka.nextDouble();
        System.out.print("Wynik z trzeciego testu: ");
        double test3 = myszka.nextDouble();

        double srednia = (test1 + test2 + test3) / 3;

        System.out.println("Wynik z pierwszego testu: " + test1);
        System.out.println("Wynik z drugiego testu: " + test2);
        System.out.println("Wynik z trzeciego testu: " + test3);
        System.out.println("Średnia: " + srednia);

        }
    }
