

import java.util.List;
import java.util.Scanner;

public class Metotlar {

    public static void Menu() {

    }

    public static void  VeriGir(Scanner sc, List<String> kitapAdi, List<String> yazarAdi, List<String> yayinEviAdi,
                               List<Integer> sayfaSayisi, List<Integer> fiyat) {

        System.out.print("Kitap adı giriniz: ");
        kitapAdi.add(sc.nextLine());
        sc.nextLine();
        System.out.print("Yazar adı giriniz: ");
        yazarAdi.add(sc.nextLine());
        sc.nextLine();
        System.out.print("Yayın evi adı giriniz: ");
        yayinEviAdi.add(sc.nextLine());
        sc.nextLine();
        System.out.print("Sayfa sayısı giriniz: ");
        sayfaSayisi.add(sc.nextInt());
        System.out.print("Fiyat giriniz: ");
        fiyat.add(sc.nextInt());
        System.out.print(kitapAdi.getLast() + " eklendi");

    }

    public static void Listele(List<String> kitapAdi, List<String> yazarAdi, List<String> yayinEviAdi,
                               List<Integer> sayfaSayisi, List<Integer> fiyat) {

        for (int i = 0; i < kitapAdi.size(); i++) {
            yazdir(i, kitapAdi.get(i), yazarAdi.get(i), yayinEviAdi.get(i), sayfaSayisi.get(i), fiyat.get(i));
        }
    }

    private static void yazdir(int i, String kAdi, String yAdi, String yayinEviAdi, Integer sayfaSayisi,
                               Integer fiyat) {
        System.out.println("Sırası: " + i);
        System.out.println("Kitap adı: " + kAdi);
        System.out.println("Yazar adı: " + yAdi);
        System.out.println("Yayın evi adı: " + yayinEviAdi);
        System.out.println("Sayfa Sayısı: " + sayfaSayisi);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("\n");
    }

    public static void AdArama(String arananAd, List<String> kitapAdi, List<String> yayinEviAdi, List<String> yazarAdi,
                               List<Integer> sayfaSayisi, List<Integer> fiyat) {

        for (int i = 0; i < kitapAdi.size(); i++) {
            if (kitapAdi.get(i).equalsIgnoreCase(arananAd)) {
                yazdir(i, kitapAdi.get(i), yazarAdi.get(i), yayinEviAdi.get(i), sayfaSayisi.get(i), fiyat.get(i));
            }
        }
    }

    public static int Toplam(List<Integer> sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam += sayilar.get(i);
        }
        return toplam;
    }

    public static void AdSilme(Scanner sc, String silinenAd, List<String> kitapAdi, List<String> yayinEviAdi,
                               List<String> yazarAdi, List<Integer> sayfaSayisi, List<Integer> fiyat) {
        AdArama(silinenAd, kitapAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
        System.out.println("Hangi sıradaki isim silinecek");
        int index = sc.nextInt();
        String silinen = kitapAdi.remove(index);
        yazarAdi.remove(index);
        yayinEviAdi.remove(index);
        sayfaSayisi.remove(index);
        fiyat.remove(index);
        System.out.println(silinen + " kitabı silindi");
    }

    public static void AdDüzeltme(Scanner sc, String duzeltilenAd, List<String> kitapAdi, List<String> yayinEviAdi,
                                  List<String> yazarAdi, List<Integer> sayfaSayisi, List<Integer> fiyat) {

        AdArama(duzeltilenAd, kitapAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
        System.out.println("Hangi sıradaki isim düzeltilecek");
        int index = sc.nextInt();
        System.out.println("Yeni kitap adı");
        String kAd = sc.next();
        if (!kAd.isEmpty())
            kitapAdi.set(index, kAd);
        System.out.println("Yeni yazar adı: ");
        String yAd = sc.next();
        if (!yAd.isEmpty())
            yazarAdi.set(index, yAd);
        System.out.println("Yeni yayın evi adı");
        String yYayinAd = sc.next();
        if (!yYayinAd.isEmpty())
            yayinEviAdi.set(index, yYayinAd);
        System.out.println("Yeni sayfa sayısı");
        String sSayisi = sc.next();
        if (!sSayisi.isEmpty())sayfaSayisi.set(index, Integer.parseInt(sSayisi));
        System.out.println("Yeni fiyat");
        String sFiyat = sc.next();
        if (!sFiyat.isEmpty())fiyat.set(index, Integer.parseInt(sFiyat));

    }
}