import java.util.ArrayList;
import java.util.Scanner;

public class evlendirmeDairesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> isim = new ArrayList<>();
        ArrayList<Boolean> mDurum = new ArrayList<>();
        ArrayList<Integer> maas = new ArrayList<>();
        ArrayList<Byte> cSayisi = new ArrayList<>();

        System.out.println("Kişi sayısını giriniz: ");
        int ks = sc.nextInt(); // byte yerine int, çünkü byte ile alakalı sorunlar olabilir ve daha geniş kullanım için int daha uygun.

        for (int i = 0; i < ks; i++) {
            System.out.println((i + 1) + ". kişinin ismini giriniz: ");
            sc.nextLine(); // nextInt'ten sonra nextLine çağırılınca gereken satır sonunu temizleme
            isim.add(sc.nextLine());

            System.out.println((i + 1) + ". kişinin maaşını giriniz: ");
            maas.add(sc.nextInt());

            sc.nextLine(); // nextInt'ten sonra
            System.out.println((i + 1) + ". kişinin medeni durumunu giriniz (Evli/Bekar): ");
            String durum = sc.nextLine();
            mDurum.add(durum.equalsIgnoreCase("Evli")); // Evli ise true, değilse false

            System.out.println((i+1)+ ". kişinin çocuk sayısını giriniz.");
            cSayisi.add(sc.nextByte());
        }

        byte menu;
        do {
            System.out.println("1- Yeni Kayıt \n2- Listeleme \n3- İsim Sorgulama \n4- Ortalama maaş \n5- En büyük maaş \n6- En küçük maaş \n7- Çıkış ");
            menu = sc.nextByte();
            sc.nextLine(); // nextByte'dan sonra

            switch (menu) {
                case 1:
                    sc.nextLine(); // Önceki nextInt'ten sonra kalan newline'ı temizlemek için
                    System.out.println("Yeni kişinin ismini giriniz: ");
                    isim.add(sc.nextLine());

                    System.out.println("Yeni kişinin maaşını giriniz: ");
                    maas.add(sc.nextInt());

                    sc.nextLine(); // nextInt'ten sonra
                    System.out.println("Yeni kişinin medeni durumunu giriniz (Evli/Bekar): ");
                    String durum = sc.nextLine();
                    mDurum.add(durum.equalsIgnoreCase("Evli")); // Evli ise true, değilse false

                    System.out.println("Yeni kişinin çocuk sayısını giriniz: ");
                    cSayisi.add(sc.nextByte()); // Çocuk sayısını alıp listeye ekle

                    System.out.println("Yeni kayıt başarıyla oluşturulmuştur");
                    break;

                case 2:
                    for (int i = 0; i < isim.size(); i++){
                        int guncelMaas = maas.get(i);
                        guncelMaas += 500 * cSayisi.get(i); // Her çocuk için 500 ekstra
                        if (mDurum.get(i)) {
                            guncelMaas += 1000; // Eğer evliyse ekstra 1000
                        }

                        System.out.println("İsmi: " + isim.get(i));
                        System.out.println("Güncel Maaşı: " + guncelMaas);
                        System.out.println("Çocuk Sayısı: "+ cSayisi.get(i));
                        System.out.println("Medeni Durumu: "+ (mDurum.get(i) ? "Evli" : "Bekar"));
                    }
                    break;

                case 3:
                    System.out.println("Aranacak ismi giriniz: ");
                    String arananAd = sc.next();
                    boolean bulundu = false;

                    for (int i = 0; i < isim.size(); i++){
                        if (isim.get(i).equalsIgnoreCase(arananAd)){
                            bulundu = true;
                            System.out.println("İsmi= " + isim.get(i));
                            System.out.println("Maaşı= " + maas.get(i));
                            System.out.println("Cocuk sayısı= "+ cSayisi.get(i));
                            System.out.println("Medeni Durumu= "+ mDurum.get(i));
                        }
                    }
                    if (!bulundu){
                        System.out.println("Böyle birisi bulunamadı.");
                    }break;

                case 4:
                    double toplamMaas = 0;
                    for (int i = 0; i < isim.size(); i++) {
                        int guncelMaas = maas.get(i);
                        guncelMaas += 500 * cSayisi.get(i); // Her çocuk için 500 ekstra
                        if (mDurum.get(i)) {
                            guncelMaas += 1000; // Eğer evliyse ekstra 1000
                        }
                        toplamMaas += guncelMaas; // Güncellenen maaşı toplam maaşa ekle
                    }
                    double ortalamaMaas = isim.size() > 0 ? toplamMaas / isim.size() : 0;
                    System.out.println("Ortalama maaş: " + ortalamaMaas);
                    break;

                case 5:
                    if(!isim.isEmpty()){
                        double enBuyukMaas = Double.MIN_VALUE;
                        String enBMaasKisi = "";

                        for (int i = 0; i < isim.size(); i++) {
                            if (maas.get(i) > enBuyukMaas ){
                                enBuyukMaas = maas.get(i);
                                enBMaasKisi = isim.get(i);
                            }
                            System.out.println("En büyük maaş= "+ enBuyukMaas);
                            System.out.println("En büyük maaslı kisi= "+ enBMaasKisi);
                        }
                    }else {
                        System.out.println("Listede kimse bulunmamaktadır.");
                    }
                    break;
                case 6:
                    if(!isim.isEmpty()){
                        double enKucukMaas = Double.MIN_VALUE;
                        String enKMaasKisi = "";

                        for (int i = 0; i < isim.size(); i++) {
                            if (maas.get(i) < enKucukMaas ){
                                enKucukMaas = maas.get(i);
                                enKMaasKisi = isim.get(i);
                            }
                            System.out.println("En küçük maaş= "+ enKucukMaas);
                            System.out.println("En küçük maaslı kisi= "+ enKMaasKisi);
                        }
                    }else {
                        System.out.println("Listede kimse bulunmamaktadır.");
                    }
                    break;
                case 7:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }
        } while (menu != 7);

        sc.close();
    }
}
