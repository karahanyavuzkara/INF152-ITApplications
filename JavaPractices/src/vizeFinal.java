import java.util.ArrayList;
import java.util.Scanner;

public class vizeFinal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> ad = new ArrayList<>();
        ArrayList<Byte> vn = new ArrayList<>();
        ArrayList<Byte> fn = new ArrayList<>();
        byte menu;

        System.out.println("Kişi sayısını giriniz: ");
        int ks = sc.nextInt();

        for (int i = 0; i < ks; i++) {
            System.out.println((i + 1) + ". kişinin ismini giriniz:");
            ad.add(sc.next());
            System.out.println((i + 1) + ". kişinin vize notunu giriniz:");
            vn.add(sc.nextByte());
            System.out.println((i + 1) + ". kişinin final notunu giriniz:");
            fn.add(sc.nextByte());
        }

        do {
            System.out.println("1- Yeni kayıt girişi \n2-Listeleme \n3-İsim Arama \n4-Ortalama Hesaplama \n5-En küçük başarı notu \n6-En büyük başarı notu \n7-Çıkış");
            menu = sc.nextByte();

            switch (menu) {
                case 1:
                    System.out.println("Yeni kişinin ismini giriniz:");
                    ad.add(sc.next());
                    System.out.println("Yeni kişinin vize notunu giriniz:");
                    vn.add(sc.nextByte());
                    System.out.println("Yeni kişinin final notunu giriniz:");
                    fn.add(sc.nextByte());
                    System.out.println("Yeni kayıt başarıyla eklendi.");
                    break;
                case 2:
                    for (int i = 0; i < ad.size(); i++) {
                        System.out.println("İsmi: " + ad.get(i));
                        System.out.println("Vize Notu: " + vn.get(i));
                        System.out.println("Final Notu: " + fn.get(i));
                        System.out.println("Başarı Puanı: " + ((vn.get(i) + fn.get(i)) / 2));
                    }
                    break;

                case 3:
                    System.out.println("Aranacak ismi giriniz:");
                    String arananIsim = sc.next();
                    boolean bulundu = false;

                    for (int i = 0; i < ad.size(); i++) {
                        if (ad.get(i).equalsIgnoreCase(arananIsim)) { // Büyük/küçük harf duyarlılığı olmadan karşılaştırma
                            bulundu = true;
                            System.out.println("İsmi: " + ad.get(i));
                            System.out.println("Vize Notu: " + vn.get(i));
                            System.out.println("Final Notu: " + fn.get(i));
                            System.out.println("Başarı Puanı: " + ((vn.get(i) + fn.get(i)) / 2));
                        }
                    }

                    if (!bulundu) {
                        System.out.println(arananIsim + " isimli kişi bulunamadı.");
                    }
                    break;

                case 4:
                    double toplamPuan = 0;
                    for (int i = 0; i < ad.size(); i++) {
                        // Her öğrencinin başarı puanı (vize ve finalin ortalaması) hesaplanır ve toplam puana eklenir.
                        toplamPuan += (vn.get(i) + fn.get(i)) / 2.0;
                    }
                    double ortalama = ad.size() > 0 ? toplamPuan / ad.size() : 0; // Ortalama hesapla. Eğer ad.size() 0 ise, bölme hatası önlenir.

                    System.out.println("Sınıfın genel başarı ortalaması: " + ortalama);
                    break;


                case 5:
                    if (!ad.isEmpty()) { // Listede öğrenci varsa
                        double enKucukBasariNotu = Double.MAX_VALUE; // En küçük notu tutacak değişkeni maksimum değerle başlat
                        String ogrenciAdi = ""; // En düşük notu alan öğrencinin adını saklamak için

                        for (int i = 0; i < ad.size(); i++) {
                            double basariNotu = (vn.get(i) + fn.get(i)) / 2.0; // Her öğrencinin başarı notunu hesapla
                            if (basariNotu < enKucukBasariNotu) { // Eğer hesaplanan not, şu ana kadarki en küçük nottan daha küçükse
                                enKucukBasariNotu = basariNotu; // En küçük notu güncelle
                                ogrenciAdi = ad.get(i); // Ve bu notu alan öğrencinin adını kaydet
                            }
                        }

                        // En küçük notu ve bu notu alan öğrencinin bilgilerini yazdır
                        System.out.println("En düşük başarı notu: " + enKucukBasariNotu);
                        System.out.println("Bu notu alan öğrenci: " + ogrenciAdi);
                    } else {
                        System.out.println("Listede öğrenci bulunmamaktadır.");
                    }
                    break;

                case 6:
                    if (!ad.isEmpty()) { // Listede öğrenci varsa
                        double enBuyukBasariNotu = Double.MIN_VALUE; // En büyük notu tutacak değişkeni minimum değerle başlat
                        String ogrenciAdi = ""; // En düşük notu alan öğrencinin adını saklamak için

                        for (int i = 0; i < ad.size(); i++) {
                            double basariNotu = (vn.get(i) + fn.get(i)) / 2.0; // Her öğrencinin başarı notunu hesapla
                            if (basariNotu > enBuyukBasariNotu) { // Eğer hesaplanan not, şu ana kadarki en küçük nottan daha küçükse
                                enBuyukBasariNotu = basariNotu; // En küçük notu güncelle
                                ogrenciAdi = ad.get(i); // Ve bu notu alan öğrencinin adını kaydet
                            }
                        }

                        // En küçük notu ve bu notu alan öğrencinin bilgilerini yazdır
                        System.out.println("En düşük başarı notu: " + enBuyukBasariNotu);
                        System.out.println("Bu notu alan öğrenci: " + ogrenciAdi);
                    } else {
                        System.out.println("Listede öğrenci bulunmamaktadır.");
                    }
                    break;

                case 7:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        } while (menu != 7);

        sc.close();
    }
}
