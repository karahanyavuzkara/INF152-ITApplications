import java.util.List;
import java.util.Scanner;

public class Metotlar {

    public static void Menu() {
        System.out.println("1-Veri giriş.....7-Çıkış");

    }

    public static void VeriGir(Scanner sc, List<String> kitapAdi, List<String> yayinEviAdi, List<String> yazarAdi,
                               List<Integer> sayfaSayisi, List<Integer> fiyat) {
        System.out.print("Kitap adı giriniz");
        kitapAdi.add(sc.next());
        System.out.print("Yazar adı giriniz");
        yazarAdi.add(sc.next());
        System.out.print("Yayın Evi adı giriniz");
        yayinEviAdi.add(sc.next());
        System.out.print("Sayfa sayısı giriniz");
        sayfaSayisi.add(sc.nextInt());
        System.out.print("Fiyatı giriniz");
        fiyat.add(sc.nextInt());
        System.out.println(kitapAdi.getLast()+" eklendi ");
    }

    public static void Listele(List<String> kitapAdi, List<String> yayinEviAdi, List<String> yazarAdi,
                               List<Integer> sayfaSayisi, List<Integer> fiyat) {
        for (int i = 0; i < kitapAdi.size(); i++) {
            yazdir(i,kitapAdi.get(i),yazarAdi.get(i),yayinEviAdi.get(i),sayfaSayisi.get(i),fiyat.get(i));
        }

    }

    private static void yazdir(int i, String kAdi, String yAdi, String yEviAdi, Integer sSayisi, Integer tekFiyat) {
        System.out.println("Sırası : "+i);
        System.out.println("Kitap adı : "+kAdi);
        System.out.println("yazar adı : "+yAdi);
        System.out.println("yayınevi adı : "+yEviAdi);
        System.out.println("Sayfa sayısı : "+sSayisi);
        System.out.println("Fiyatı : "+tekFiyat);
        System.out.println("--------------------------");

    }

    public static void AdArama(String arananAd, List<String> kitapAdi, List<String> yayinEviAdi, List<String> yazarAdi,
                               List<Integer> sayfaSayisi, List<Integer> fiyat) {
        for (int i = 0; i < kitapAdi.size(); i++) {
            if(kitapAdi.get(i).equalsIgnoreCase(arananAd)) {
                yazdir(i,kitapAdi.get(i),yazarAdi.get(i),yayinEviAdi.get(i),sayfaSayisi.get(i),fiyat.get(i));
            }
        }
    }
    static int Toplam(List<Integer> sayilar) {
        int toplam=0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);
        }
        return toplam;
    }

    public static void AdSilme(Scanner sc, String silinenAd, List<String> kitapAdi, List<String> yayinEviAdi, List<String> yazarAdi,
                               List<Integer> sayfaSayisi, List<Integer> fiyat) {
        AdArama(silinenAd,kitapAdi,yayinEviAdi,yazarAdi,sayfaSayisi,fiyat);
        System.out.println("Hangi sıradaki isim silinecek");
        int index=sc.nextInt();
        String silinen=kitapAdi.remove(index);
        yazarAdi.remove(index);
        yayinEviAdi.remove(index);
        sayfaSayisi.remove(index);
        fiyat.remove(index);
        System.out.println(silinen+" kitabı silindi");
    }

    public static void AdDuzeltme(Scanner sc, String duzeltilenAd, List<String> kitapAdi, List<String> yayinEviAdi,
                                  List<String> yazarAdi, List<Integer> sayfaSayisi, List<Integer> fiyat) {
        AdArama(duzeltilenAd,kitapAdi,yayinEviAdi,yazarAdi,sayfaSayisi,fiyat);
        System.out.println("Hangi sıradaki isim Düzeltilecek");
        int index=sc.nextInt();
        System.out.println("Yeni kitap adı");
        String kAd=sc.next();
        if(!kAd.isEmpty()) kitapAdi.set(index, kAd);
        System.out.println("Yeni Yazar adı");
        String yAd=sc.next();
        if(!yAd.isEmpty()) yazarAdi.set(index, yAd);
        System.out.println("Yeni Yayın Evi adı");
        String yYayinAd=sc.next();
        if(!yYayinAd.isEmpty()) yayinEviAdi.set(index, yYayinAd);
        System.out.println("Yeni Sayfa sayısı");
        String sSayisi=sc.next();
        if(!sSayisi.isEmpty()) sayfaSayisi.set(index, Integer.parseInt(sSayisi));
        System.out.println("Yeni Fiyat");
        String sFiyat=sc.next();
        if(!sFiyat.isEmpty()) fiyat.set(index, Integer.parseInt(sFiyat));

    }
}

