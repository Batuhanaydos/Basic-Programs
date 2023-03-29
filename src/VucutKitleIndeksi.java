import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo,boy,index;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        index = kilo /(boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + index);
    }
}
