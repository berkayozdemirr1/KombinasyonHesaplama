import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, fakt1 = 1, fakt2 = 1, z, fakt3 = 1, comb;

        do {
            Scanner girdi1 = new Scanner(System.in);

            System.out.print("C(a,b) kombinasyonunda 'a' sayisini giriniz : ");
            a = girdi1.nextInt();

            Scanner girdi2 = new Scanner(System.in);
            System.out.print("C(a,b) kombinasyonunda 'b' sayisini giriniz : ");
            b = girdi2.nextInt();
            if (b > a) {
                System.out.println("Lutfen a degerini b degerinden buyuk olacak sekilde giriniz.");
            }

        } while (a < b);

        for (int x = 1; x <= a; x++) {
            fakt1 *= x;
        }
        for (int y = 1; y <= b; y++) {
            fakt2 *= y;
        }
        z = a - b;
        for (int d = 1; d <= z; d++) {
            fakt3 *= d;
        }
        comb = (fakt1 / (fakt2 * fakt3));
        System.out.println("Kombinasyonu : " + comb);
    }
}