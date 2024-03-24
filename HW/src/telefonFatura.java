import java.util.Scanner;

public class telefonFatura {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kişi sayısı giriniz: ");
        byte ks = sc.nextByte();
        String ad[] = new String[ks];
        int dk[] = new int[ks];
        int sms[] = new int[ks];
        int net[] = new int[ks];
        byte menu;

        for (int i = 0; i < ks; i++) {
            System.out.print((i + 1) + ": ismi giriniz: ");
            ad[i] = sc.next();
            System.out.print((i + 1) + ": Kaç dakika kullanıldı: ");
            dk[i] = sc.nextInt();
            System.out.print((i + 1) + ": Kaç SMS kullanıldı: ");
            sms[i] = sc.nextInt();
            System.out.print((i+1)+": Kaç GB internet kullanıldı: ");
            net[i] = sc.nextInt();

        }


        for (; ;) {
            System.out.println("1-Listeleme:  \n 2-İsim Arama: \n " +
                    "3-Fatura ortalamaları: \n 4-En küçük fatura \n " +
                    "5-Dakika/SMS/Arama en büyükler: \n 6-Çıkış ");
            menu = sc.nextByte();

            switch (menu) {

                case 1:
                    for (int i = 0; i < ks; i++) {
                        System.out.println("Adı: " + ad[i]);
                        System.out.println("Dakika borcu: " + (dk[i] * .7 ) + "TL");
                        System.out.println("SMS borcu: " + (sms[i] * .55 ) + "TL" );
                        System.out.println("İnternet borcu: " + ( net[i] * 15 ) + "TL");

                    }
                    break;

                case 2:
                    System.out.println("Aranacak adı giriniz: ");
                    String isim = sc.next();
                    for (int i = 0; i < ks; i++) {
                        System.out.println("Adı: " + ad[i]);
                        System.out.println("Dakika borcu: " + (dk[i] * .7 ) + "TL");
                        System.out.println("SMS borcu: " + (sms[i] * .55 ) + "TL" );
                        System.out.println("İnternet borcu: " + ( net[i] * 15 ) + "TL");

                    }
                    break;

                case 3:
                    double toplamDk = 0, toplamSms = 0, toplamNet = 0, toplamFatura = 0;
                    for (int i = 0; i < ks; i++) {
                        toplamDk += dk[i];
                        toplamSms += sms[i];
                        toplamNet += net[i];
                        toplamFatura += (dk[i] * .7) + (sms[i] * .55) + (net[i] * 15);
                    }
                    double ortDk = toplamDk / ks;
                    double ortSms = toplamSms / ks;
                    double ortNet = toplamNet / ks;
                    double ortFatura = toplamFatura / ks;

                    System.out.println("Ortalama dakika: " + ortDk);
                    System.out.println("Ortalama SMS: " + ortSms);
                    System.out.println("Ortalama GB: " + ortNet);
                    System.out.println("Ortalama fatura: " + ortFatura + "TL");
                    break;

                case 4:
                    if (ks > 0) { // Kullanıcı sayısı 0'dan büyük olduğu durumda işlem yapılır.
                        double enKucukFatura = (dk[0] * .7) + (sms[0] * .55) + (net[0] * 15); // İlk kullanıcının faturası başlangıç değeri olarak atanır.
                        int enKucukIndex = 0; // En küçük faturanın indeksi.

                        for (int i = 1; i < ks; i++) { // İlk kullanıcı zaten değerlendirildiği için 1'den başlatılır.
                            double fatura = (dk[i] * .7) + (sms[i] * .55) + (net[i] * 15); // Her bir kullanıcının faturası hesaplanır.
                            if (fatura < enKucukFatura) { // Eğer hesaplanan fatura, şu ana kadar bulunan en küçük faturadan daha küçükse
                                enKucukFatura = fatura; // En küçük fatura güncellenir.
                                enKucukIndex = i; // En küçük faturanın indeksi güncellenir.
                            }
                        }

                        // En küçük fatura ve bu faturaya sahip kullanıcının bilgileri yazdırılır.
                        System.out.println("En küçük fatura sahibi: " + ad[enKucukIndex]);
                        System.out.println("Dakika borcu: " + (dk[enKucukIndex] * .7 ) + "TL");
                        System.out.println("SMS borcu: " + (sms[enKucukIndex] * .55 ) + "TL" );
                        System.out.println("İnternet borcu: " + ( net[enKucukIndex] * 15 ) + "TL");
                        System.out.println("Toplam fatura: " + enKucukFatura + "TL");
                    } else {
                        System.out.println("Hiç kullanıcı girilmemiş.");
                    }
                    break;

                case 5:
                    int maxDkIndex = 0, maxSmsIndex = 0, maxNetIndex = 0; // En yüksek kullanımların indekslerini tutacak değişkenler.

                    // Başlangıç değerleri olarak ilk kullanıcının indeksleri atanır.
                    int maxDk = dk[0];
                    int maxSms = sms[0];
                    int maxNet = net[0];

                    for (int i = 1; i < ks; i++) {
                        if (dk[i] > maxDk) {
                            maxDk = dk[i];
                            maxDkIndex = i;
                        }
                        if (sms[i] > maxSms) {
                            maxSms = sms[i];
                            maxSmsIndex = i;
                        }
                        if (net[i] > maxNet) {
                            maxNet = net[i];
                            maxNetIndex = i;
                        }
                    }

                    // En yüksek dakika kullanımına sahip kullanıcı bilgileri
                    System.out.println("En fazla dakika kullanan: " + ad[maxDkIndex] + ", Dakika: " + maxDk);
                    // En yüksek SMS kullanımına sahip kullanıcı bilgileri
                    System.out.println("En fazla SMS kullanan: " + ad[maxSmsIndex] + ", SMS: " + maxSms);
                    // En yüksek internet kullanımına sahip kullanıcı bilgileri
                    System.out.println("En fazla internet kullanan: " + ad[maxNetIndex] + ", GB: " + maxNet);
                    break;
                case 7:
                    return;
            }

        }
    }
}