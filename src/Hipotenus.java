import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Dik Üçgenin a kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen Dik Üçgenin b kenar uzunluğunu giriniz: ");
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Dik Üçgenin Hipotenüsü: " + c);
    }
}
