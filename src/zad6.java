public class zad6 {
    public static void main(String[] args) {
        int mieszkania = (3 + 4) * 2;
        int mieszkanie1 = 3 + 4;
        int mieszkanie2 = 2 * 3;
        int mieszkanie3 = 2 * 2;
        int mieszkanie4 = 3 * 4;
        int sumaMieszkan = mieszkanie1 + mieszkanie2 + mieszkanie3 + mieszkanie4;

        int powierzchniaNaOsobe = sumaMieszkan / 4;

        System.out.println("Powierzchnia mieszkań w m2: ");
        System.out.println("Mieszkanie 1: " + mieszkanie1 + " m2 na osobę: " + (mieszkanie1 / 4) + "m2");
        System.out.println("Mieszkanie 2: " + mieszkanie2 + " m2 na osobę: " + (mieszkanie2 / 4) + "m2");
        System.out.println("Mieszkanie 3: " + mieszkanie3 + " m2 na osobę: " + (mieszkanie3 / 4) + "m2");
        System.out.println("Mieszkanie 4: " + mieszkanie4 + " m2 na osobę: " + (mieszkanie4 / 4) + "m2");
        System.out.println("Suma w m2 dla wszystkich mieszkań: " + sumaMieszkan + "m2");
        System.out.println("Powierzchnia na osobę dla 4 osób: " + powierzchniaNaOsobe + "m2");

        }
    }
