import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {
        Scanner myszka = new Scanner(System.in);

        System.out.println("Podaj liczbę przejechanych kilometrów:");
        double przejechaneKilometry = myszka.nextDouble();

        System.out.println("Podaj liczbę zużytych litrów paliwa:");
        double ZuzyteLitrPaliwa = myszka.nextDouble();

        double kilometrNaLitrze = przejechaneKilometry / ZuzyteLitrPaliwa;
        System.out.println("Liczba kilometrów przejechanych na litrze paliwa wynosi: " + kilometrNaLitrze);

    }
}








