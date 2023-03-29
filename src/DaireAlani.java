import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        int r;
        double pi = 3.14,alan,çevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dairenin yarı çapı değerini giriniz: ");
        r = input.nextInt();
        alan = pi * r * r;
        çevre = 2 * pi * r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + çevre);
    }
}
