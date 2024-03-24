public class Fonksiyonlar {
    public static void Menu() {
        System.out.println("1-Listeleme\n2-İsim arama\n3-ORtalamalar\n4-Enb\5-Enk\n6-Çıkış");
    }

    public static void Listeleme(String[] ad, byte[] cs, String[] medenidurum, int[] maas, int[] elineGecen) {
        for (int i = 0; i < elineGecen.length; i++) {
            KisiGoruntule(ad[i], medenidurum[i], cs[i], maas[i], elineGecen[i]);
        }
    }

        private static void KisiGoruntule (String ad, String medenidurum,byte cs, int maas, int elineGecen){
            System.out.println("İsim  : " + ad);
            if (medenidurum.equalsIgnoreCase("E")) System.out.println("Medeni durum : Evli");
            else System.out.println("Medeni durum : Bekar");
            System.out.println("Çocuk sayısı : " + cs);
            System.out.println("MAaşı : " + maas);
            System.out.println("Eline Geçen : " + elineGecen);
        }

        public static void Arama (String[]ad,byte[] cs, String[] medenidurum,int[] maas, int[] elineGecen,
        String arananAd){
            for (int i = 0; i < elineGecen.length; i++) {
                if (arananAd.equalsIgnoreCase(ad[i])) {
                    KisiGoruntule(ad[i], medenidurum[i], cs[i], maas[i], elineGecen[i]);
                }
            }

        }

}
