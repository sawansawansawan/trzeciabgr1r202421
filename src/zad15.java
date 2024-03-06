import java.util.Scanner;
public class zad15 {
    public static void main(String[] args) {
        Scanner plytka = new Scanner(System.in);

        System.out.print("Podaj cenę detaliczną płytki: ");
        double Cenadetaliczna = plytka.nextDouble();
        double zysk = Cenadetaliczna * 0.4;

        System.out.println("Zysk ze sprzedaży wynosi: " + zysk);

    }
}
