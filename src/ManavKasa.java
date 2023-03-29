import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut'un kilosunu giriniz : ");
        armut = input.nextDouble();
        System.out.print("Elma'nın kilosunu giriniz : ");
        elma = input.nextDouble();
        System.out.print("Domates'in kilosunu giriniz : ");
        domates = input.nextDouble();
        System.out.print("Muz'un kilosunu giriniz : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan'ın kilosunu giriniz : ");
        patlican = input.nextDouble();
        toplam = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat);
        System.out.println("Toplam tutar : " + toplam);

    }
}
