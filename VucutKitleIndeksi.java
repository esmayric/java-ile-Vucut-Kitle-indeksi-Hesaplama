import java.util.Scanner;
public class VucutKutleIndeksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Double boy = sc.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        Double kilo = sc.nextDouble();

        Double vki = kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz: " +vki);
    }
}
