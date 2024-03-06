import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner myszka = new Scanner(System.in);

        System.out.println("Podaj długość pokoju nr 1: ");
        int dlugoscPokoj1 = myszka.nextInt();
        System.out.println("Podaj szerokość pokoju nr 1: ");
        int szerokoscPokoj1 = myszka.nextInt();

        System.out.println("Podaj długość pokoju nr 2: ");
        int dlugoscPokoj2 = myszka.nextInt();
        System.out.println("Podaj szerokość pokoju nr 2: ");
        int szerokoscPokoj2 = myszka.nextInt();

        System.out.println("Podaj długość pokoju nr 3: ");
        int dlugoscPokoj3 = myszka.nextInt();
        System.out.println("Podaj szerokość pokoju nr 3: ");
        int szerokoscPokoj3 = myszka.nextInt();

        System.out.println("Podaj długość pokoju nr 4: ");
        int dlugoscPokoj4 = myszka.nextInt();
        System.out.println("Podaj szerokość pokoju nr 4: ");
        int szerokoscPokoj4 = myszka.nextInt();

        int powierzchniaPokoj1 = dlugoscPokoj1 * szerokoscPokoj1;
        int powierzchniaPokoj2 = dlugoscPokoj2 * szerokoscPokoj2;
        int powierzchniaPokoj3 = dlugoscPokoj3 * szerokoscPokoj3;
        int powierzchniaPokoj4 = dlugoscPokoj4 * szerokoscPokoj4;

        int sumaPowierzchni = powierzchniaPokoj1 + powierzchniaPokoj2 + powierzchniaPokoj3 + powierzchniaPokoj4;
        int powierzchniaNaOsobe = sumaPowierzchni / 4;

        System.out.println("Suma w m2 dla wszystkich pokojów: " + sumaPowierzchni + "m2");
        System.out.println("Powierzchnia na osobę dla 4 osób: " + powierzchniaNaOsobe + "m2");

    }
}
