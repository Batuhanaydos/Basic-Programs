import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args) {
        double kdvlifiyat, kdvsizfiyat, kdvoran = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün KDV'siz fiyatı giriniz:");
        kdvsizfiyat = input.nextInt();
        kdvlifiyat = kdvsizfiyat * kdvoran + kdvsizfiyat;

        System.out.println("Ürünün KDV'siz fiyatı: " + kdvsizfiyat);
        System.out.println("KDV Oranı: " + kdvoran);
        System.out.print("Ürünün KDV'li fiyatı: " + kdvlifiyat);
    }
}