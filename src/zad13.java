import java.util.Scanner;
public class zad13 {
    public static void main(String[] args) {
        Scanner myszka = new Scanner(System.in);
        int Liczbaciasteczek;
        int ilosc;
        int Porcja = 300;
        int LiczbaCiasteczek = 40;
        System.out.println("Jedna porcja zawiera 4 ciasteczka i ma 300kcal");
        System.out.print("Podaj liczbę zjedzonych porcji: ");
        ilosc = myszka.nextInt();
        int SkonsumowaneKalorie = (ilosc * Porcja);

        System.out.println("Skonsumowane kalorie: " + SkonsumowaneKalorie);
    }
}






