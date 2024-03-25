import java.util.List;
import java.util.Scanner;

public class Metotlar {
    public static void Menu() {
        System.out.println("1-Veri Gir/ 2-Listeleme / 3-Arama / 4-Ortalama / 5- En Küçük / 6- En Büyük");
    }

    public static void veriGir(Scanner scanner, List<String> isim, List<String> soyisim, List<Integer> vizeNotu, List<Integer> finalNotu) {
        System.out.println("İsim Giriniz: ");
        isim.add(scanner.next());
        System.out.println("Soyisim Giriniz: ");
        soyisim.add(scanner.next());
        System.out.println("Vize Notu Giriniz: ");
        vizeNotu.add(scanner.nextInt());
        System.out.println("Final Notu Giriniz: ");
        finalNotu.add(scanner.nextInt());
        System.out.println();
    }

    public static void Listeleme(List<String> isim, List<String> soyisim, List<Integer> vizeNotu, List<Integer> finalNotu) {
        for (int i = 0; i < isim.size(); i++) {
            yazdir(i, isim.get(i), soyisim.get(i), vizeNotu.get(i), finalNotu.get(i));
        }
    }

    private static void yazdir(int i, String isim1, String soyisim2, Integer vizenotu, Integer finalnotu) {
        System.out.println("Sırası: " + (i + 1));
        System.out.println("İsim: " + isim1);
        System.out.println("Soyisim: " + soyisim2);
        System.out.println("Vize Notu: " + vizenotu);
        System.out.println("Final Notu: " + finalnotu);
        System.out.println("---------------------");
    }

    public static void arama(Scanner scanner, List<String> isim, List<String> soyisim, List<Integer> vizeNotu, List<Integer> finalNotu) {
        System.out.println("Aranacak ismi giriniz: ");
        String arananIsim = scanner.next();
        boolean bulundu = false;
        for (int i = 0; i < isim.size(); i++) {
            if (isim.get(i).equalsIgnoreCase(arananIsim)) {
                System.out.println("İsim: " + isim.get(i));
                System.out.println("Soyisim: " + soyisim.get(i));
                System.out.println("Vize Notu: " + vizeNotu.get(i));
                System.out.println("Final Notu: " + finalNotu.get(i));
                bulundu = true;
                break;
            }
        }
        if (!bulundu) {
            System.out.println("Aranan isim bulunamadı!");
        }

    }
    public static void ortalama(List<String> isim, List<Integer> vizeNotu, List<Integer> finalNotu, List<Double> ortalama) {
        ortalama.clear(); // Mevcut ortalamaları temizle, her çağrıda yeniden hesapla.
        for (int i = 0; i < isim.size(); i++) {
            double ort = ((vizeNotu.get(i) * 40 / 100) + (finalNotu.get(i) * 60 / 100));
            ortalama.add(ort); // Hesaplanan ortalamayı listeye ekle
            String durum = (ort >= 50) ? "Geçti" : "Kaldı";
            System.out.println(isim.get(i) + " isimli öğrencinin başarı durumu: " + durum + " Notu: " + ort);
        }
    }

    public static void enKucuk(List<String> isim, List<Double> ortalama) {
        // Listenin boş olup olmadığını kontrol et
        if (ortalama.isEmpty()) {
            System.out.println("Ortalama listesi boş. En düşük ortalamayı hesaplamak mümkün değil.");
            return; // List boşsa, metodun geri kalanını çalıştırmadan çık
        }

        double enKucukOrtalama = Double.MAX_VALUE;
        String enKucukIsim = "";

        // Döngü kullanarak tüm ortalamaları kontrol etme
        for (int i = 0; i < ortalama.size(); i++) {
            if (ortalama.get(i) < enKucukOrtalama) {
                enKucukOrtalama = ortalama.get(i);
                enKucukIsim = isim.get(i);
            }
        }

        // En küçük ortalamayı ve ismi yazdırma
        System.out.println("En düşük ortalamaya sahip öğrenci: " + enKucukIsim);
        System.out.println("Ortalaması: " + enKucukOrtalama);
    }
}


