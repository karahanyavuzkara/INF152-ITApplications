import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Kişi sayısı girin");
        byte ks = scn.nextByte();
        String ad[] = new String[ks];
        String medenidurum[] = new String[ks];
        byte cs[] = new byte[ks];
        int maas[] = new int[ks];
        int elineGecen[] = new int[ks];
        byte menu;
        for (int i = 0; i < ks; i++) {
            System.out.print("İsim giriniz");
            ad[i] = scn.next();
            System.out.print("Medeni durumu giriniz");
            medenidurum[i] = scn.next();
            System.out.print("Çocuk sayısı giriniz");
            cs[i] = scn.nextByte();
            System.out.print("Maaşı giriniz");
            maas[i] = scn.nextInt();
            elineGecen[i] = maas[i];
            if (medenidurum[i].equalsIgnoreCase("e") || medenidurum[i].equalsIgnoreCase("E"))
                elineGecen[i] = +500;
            if (cs[i] > 3)
                cs[i] = 3;
            elineGecen[i] = elineGecen[i] + (cs[i] * 250);
        } // veri giriş sonu
        while (true) {
            Fonksiyonlar.Menu();
            menu = scn.nextByte();
            switch (menu) {
                case 1:Fonksiyonlar.Listeleme(ad,cs,medenidurum,maas,elineGecen);
                    break;
                case 2:System.out.println("Aranacak İsmi Giriniz : ");
                    String arananAd=scn.next();
                    Fonksiyonlar.Arama(ad,cs,medenidurum,maas,elineGecen,arananAd);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Program bitti");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış Menü değeri");
                    break;
            }
        }
    }

}