import java.util.ArrayList;
import java.util.Scanner;

public class deneme {
 public static void main(String[]args) {

     Scanner sc = new Scanner(System.in);
     ArrayList<String> ad = new ArrayList<>();
     ArrayList<Byte> vn = new ArrayList<>();
     ArrayList<Byte> fn = new ArrayList<>();
     byte menu;

     System.out.println("Kişi sayısını giriniz: ");
     byte ks = sc.nextByte();

     for (int i = 0; i < ks; i++) {
         System.out.println((i+1)+". kişinin ismini giriniz: ");
         ad.add(sc.next());
         System.out.println((i+1)+ ". kişinin vize notunu giriniz: ");
         vn.add(sc.nextByte());
         System.out.println((i+1)+ ". kişinin final notunu giriniz: ");
         fn.add(sc.nextByte());
     }
    do {
        System.out.println("1- Yeni Kayıt Girişi \n 2-Listeleme \n 3-İsim Arama \n 4-Ortalama \n 5-En küçük başarı notu \n 6-En büyük başarı notu" +
                "\n 7-Çıkış"
        );
         menu = sc.nextByte();
        switch (menu){
            case 1:
                System.out.println("Yeni kişinin ismini giriniz: ");
                ad.add(sc.next());
                System.out.println("Yeni kişinin vize notunu giriniz: ");
                vn.add(sc.nextByte());
                System.out.println("Yeni kişinin final notunu giriniz: ");
                fn.add(sc.nextByte());
                System.out.println("Yeni kayıt başarıyla oluşturuldu");
                break;

            case 2:
                for (int i = 0; i < ks; i++){
                    System.out.println("İsmi: "+ ad.get(i));
                    System.out.println("Vize notu: "+ vn.get(i));
                    System.out.println("Final notu: "+ fn.get(i));
                    System.out.println("Başarı notu: "+ ( (vn.get(i)+fn.get(i)) /2 ));
                    break;
                }
            case 3:
                System.out.println("Aranacak ismi giriniz: ");
                String arananAd= sc.next();
                boolean bulundu = false;

            for (int i = 0; i < ad.size(); i++) {
                if (ad.get(i).equalsIgnoreCase(arananAd)) {
                    bulundu = true;
                    System.out.println("İsmi: "+ ad.get(i));
                    System.out.println("Vize notu: "+ vn.get(i));
                    System.out.println("Final notu: "+ fn.get(i));
                    System.out.println("Başarı notu: "+ ( (vn.get(i)+fn.get(i)) /2 ));

                }
            }
                    if (!bulundu){
                        System.out.println("Böyle birisi bulunmamaktadır.");
                    }
                break;
            case 4:
                double toplamPuan = 0;
                for (int i = 0; i < ad.size();i++) {
                    toplamPuan += (vn.get(i) + fn.get(i)) / 2.0;
                }
                double ortalama = ad.size() > 0 ? toplamPuan / ad.size() : 0;
                System.out.println("Sınıfın başarı ortalaması: "+ ortalama);
                break;

            case 5:
                if (!ad.isEmpty()) { // Listede öğrenci varsa
                    double enKucukBasariNotu = Double.MAX_VALUE; // En küçük notu tutacak değişkeni maksimum değerle başlat
                    String ogrenciAdi = "";
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
                if(!ad.isEmpty()){
                    double enBuyukBasariNotu = Double.MIN_VALUE;
                    String ogrenciAdi= "";
                    for (int i = 0; i < ad.size(); i++){
                        double basariNotu = ((vn.get(i) + fn.get(i)) / 2);
                        if (basariNotu > enBuyukBasariNotu) {
                            enBuyukBasariNotu = basariNotu;
                            ogrenciAdi = ad.get(i);
                        }
                    }
                    System.out.println("En büyük başarı notu: " + enBuyukBasariNotu);
                    System.out.println("Bu notu alan öğrenci: " + ogrenciAdi);
                }
                else {
                    System.out.println("Listede öğrenci bulunmamaktadır.");
                }
                break;

            case 7:
                System.out.println("Programdan çıkış yapılıyor.");
                break;
            default:
                System.out.println("Yanlış seçim.");


        }
    } while (menu!= 7);
    sc.close();

 }
}
