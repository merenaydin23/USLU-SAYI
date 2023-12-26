import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    System.out.println("Üslü sayı hesaplama programına hoş geldiniz");
    System.out.println("Taban değerini girin");
    Scanner klavye=new Scanner(System.in);
    int taban= klavye.nextInt();
    System.out.println("Üs değerini girin");
    int us= klavye.nextInt();
    System.out.println("Sonuç = "+ushesap(taban,us));
    }
    public static int ushesap(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * ushesap(taban, --us);
        }
    }
}
