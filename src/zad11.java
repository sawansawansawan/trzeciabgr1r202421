import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner myszka = new Scanner(System.in);

        System.out.print("Podaj wartość produktu: ");
        double cenaProduktu = myszka.nextDouble();
        double podatekStanowy = cenaProduktu * 0.04;
        double podatekLokalny = cenaProduktu * 0.02;
        double cenaSprzedazy = cenaProduktu + podatekStanowy + podatekLokalny;

        System.out.printf("Wartość produktu: " + cenaProduktu);
        System.out.println("Podatek Stanowy: " + podatekStanowy);
        System.out.println("Podatek Lokalny : " + podatekLokalny);
        System.out.println("Cena sprzedaży: " + cenaSprzedazy);

    }
}