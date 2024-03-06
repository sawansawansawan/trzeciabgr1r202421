import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        Scanner myszka = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String PierwszeImie = myszka.nextLine();

        System.out.println("Podaj drugie imię: ");
        String DrugieImie = myszka.nextLine();

        System.out.println("Podaj nazwisko: ");
        String Nazwisko = myszka.nextLine();

        char PierwszyInicjal = PierwszeImie.charAt(0);
        char DrugiInicjal = DrugieImie.charAt(0);
        char Nazwiskoo = Nazwisko.charAt(0);

        System.out.println("Imię: " + PierwszeImie);
        System.out.println("Drugie imię: " + DrugieImie);
        System.out.println("Nazwisko: " + Nazwisko);

        System.out.println("Inicjał pierwszego imienia: " + PierwszeImie);
        System.out.println("Inicjał drugiego imienia: " + DrugieImie);
        System.out.println("Inicjał nazwiska: " + Nazwisko);


    }


}
