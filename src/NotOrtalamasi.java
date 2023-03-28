import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.println("Türkçe notunu giriniz:");
        turkce = input.nextInt();

        System.out.println("Tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.println("Müzik notunu giriniz:");
        muzik = input.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;
        System.out.println("Ortalama = " + ortalama );

        System.out.println(ortalama >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");


    }
}