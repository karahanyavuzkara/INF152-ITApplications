import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kişi sayısı kaç :");
        byte ks = scanner.nextByte();


        String isim[] = new String[ks];
        int maas[] = new int[ks];
        String medeniDurumu[] = new String[ks];
        byte[] cocukSayisi = new byte[ks];
        int[] elineGecen = new int[ks];
        byte menu;


        for (int i = 0; i < ks; i++) {
            System.out.print((i + 1) + ": ismi giriniz: ");
            isim[i] = scanner.next();

            System.out.print((i + 1) + ": maaş kaç lira: ");
            maas[i] = scanner.nextInt();

            System.out.print((i + 1) + ": Medeni durum giriniz: ");
            medeniDurumu[i] = scanner.next();

            System.out.print((i + 1) + ": Çocuk sayısı var: ");
            cocukSayisi[i] = scanner.nextByte();


            elineGecen[i] = maas[i];
            if (medeniDurumu[i].equalsIgnoreCase("evli") || medeniDurumu[i].equalsIgnoreCase("E"))
                elineGecen[i] += 500 ;

            if (cocukSayisi[i] > 3)
                cocukSayisi[i] =3;
            elineGecen[i] = elineGecen[i] + (cocukSayisi[i] * 250);

        }


        for (; ; ) {
            System.out.println("1-Listeleme:  \n 2-İsim Arama: \n " +
                    "3-Maaş ortalamaları: \n 4-En büyük maaş: \n " +
                    "5-En küçük maaş: \n 6-Çıkış ");
            menu = scanner.nextByte();

            switch (menu) {

                case 1:
                    for (int i = 0; i < ks; i++) {
                        System.out.println("Adı: " + isim[i]);
                        System.out.println(" Medeni durumu: " + (medeniDurumu[i]));
                        System.out.println("Çocuk sayısı: " + (cocukSayisi[i]));
                        System.out.println("Maaşı: " + (maas[i]));
                        System.out.println("Maaşı: " + (elineGecen[i]));

                    }
                    break;

                case 2:
                    System.out.println("Aranacak adı giriniz: ");
                    String ad = scanner.next();
                    for (int i = 0; i < ks; i++) {
                        System.out.println("Adı: " + isim[i]);
                        System.out.println(" Medeni durumu: " + (medeniDurumu[i]));
                        System.out.println("Çocuk sayısı: " + (cocukSayisi[i]));
                        System.out.println("Maaşı: " + (maas[i]));
                        System.out.println("Eline Geçen Maaşı: " + (elineGecen[i]));

                    }
                    break;

                case 3: int ort = 0;
                    for (int i = 0; i < ks; i++) {
                        ort+= maas[i];
                    }
                    int ortalama = ort / ks;
                    System.out.println("Ortalama: "+ ortalama);

                    break;

                case 4:
                    int enb = (int) elineGecen[0];
                    for (int i = 1; i < ks; i++) {
                        if (elineGecen[i] > enb) enb = (int) elineGecen[i];
                    }
                    System.out.println("En büyük maaş  : " + enb);

                    break;

                case 5:
                    int enk = (int) elineGecen[0];
                    for (int i = 1; i < ks; i++) {
                        if (elineGecen[i] < enk)
                            enk = elineGecen[i];
                    }
                    System.out.println(
                            "En küçük maaş : " + enk);

                    break;

                case 6: //cıkıs
                    return;

            }

        }
    }
}
