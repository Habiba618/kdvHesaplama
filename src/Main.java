import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Para değerini giriniz: ");
        double alinanPara = sc.nextDouble();

        // KDV oranını belirle
        double kdvOrani = (alinanPara < 1000) ? 0.18 : 0.08;

        // KDV'li fiyatı hesapla
        double kdvliFiyat = alinanPara * (1 + kdvOrani);

        // KDV tutarını hesapla
        double kdvTutari = alinanPara * kdvOrani;

        System.out.println("KDV'siz Fiyat = " + alinanPara);
        System.out.println("KDV'li Fiyat = " + kdvliFiyat);
        System.out.println("KDV tutarı = " + kdvTutari);
    }
}
