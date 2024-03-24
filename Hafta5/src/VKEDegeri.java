import java.util.Scanner;

public class VKEDegeri {
    public static void main(String[] args) {
        float boy, kilo, vke, boyToplam = 0, kiloToplam = 0;
        String durum = "";
        Scanner giris = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Boy değeri giriniz : ");
            boy = giris.nextFloat();
            System.out.println("Kilo değeri giriniz : ");
            kilo = giris.nextFloat();
            boyToplam += boy;
            kiloToplam += kilo;
            vke = kilo / (boy * boy);
            if (vke < 18.5)
                durum = "Zayıf";
            else if (vke < 25)
                durum = "Normal";
            else if (vke < 30)
                durum = "Normalin üstü";
            else if (vke < 40)
                durum = "Obez";
            else
                durum = "morbid obez";
            System.out.println("Vke değerin : " + vke + "\nDurumun : " + durum);
        }//döngü sonu
        System.out.println("Boy Ortalaması : "+(boyToplam/5));
        System.out.println("Kilo ortalaması : "+(kiloToplam/5));
    }
}