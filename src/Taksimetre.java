import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km,eachkm = 2.20,tutar = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Gidilicek kilometreyi giriniz: ");
        km = input.nextInt();
        tutar += (km * eachkm);

        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Toplam tutar: " + tutar);
    }
}
