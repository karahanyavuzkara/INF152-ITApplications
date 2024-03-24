import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kutuphane {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> kitapAdi = new ArrayList<String>();
        List<String> yazarAdi = new ArrayList<String>();
        List<String> yayinEviAdi = new ArrayList<String>();
        List<Integer> sayfaSayisi = new ArrayList<Integer>();
        List<Integer> fiyat = new ArrayList<Integer>();
        byte menu;
        for (;;) {
            Metotlar.Menu();
            menu = sc.nextByte();
            switch (menu) {
                case 1:
                    Metotlar.VeriGir(sc, kitapAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
                    break;
                case 2:
                    Metotlar.Listele(kitapAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
                    break;
                case 3:
                    System.out.println("Aranacak ismi giriniz : ");
                    String arananAd = sc.next();
                    Metotlar.AdArama(arananAd, kitapAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
                    break;
                case 4:
                    System.out.println("Sayfa sayısı ortalaması : " + (Metotlar.Toplam(sayfaSayisi) / sayfaSayisi.size()));
                    System.out.println("Fiyat ortalaması : " + (Metotlar.Toplam(fiyat) / fiyat.size()));
                    break;
                case 5:
                    System.out.println("Silinecek ismi giriniz : ");
                    String silinenAd = sc.next();
                    Metotlar.AdSilme(sc, silinenAd, kitapAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
                    break;
                case 6:
                    System.out.println("Düzeltilecek ismi giriniz : ");
                    String duzeltilenAd = sc.next();
                    Metotlar.AdDuzeltme(sc, duzeltilenAd, kitapAdi, yayinEviAdi, yazarAdi, sayfaSayisi, fiyat);
                    break;
                case 7:
                    System.out.println("Program bitti");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış Menü Değeri");
            }
        }
    }
}
