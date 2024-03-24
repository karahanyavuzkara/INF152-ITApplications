import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {
        float boy, kilo ,vke , boyToplam= 0, kiloToplam =0;
        String durum ="";

        Scanner giris= new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Boy değerini giriniz");
            boy = giris.nextFloat();
            System.out.println("Kilo değerini giriniz");
            kilo = giris.nextFloat();
            boyToplam += boy;
            kiloToplam += kilo;

            vke = kilo /(boy*boy);

            if (vke < 15)
                durum= "zayıf";
            else if (vke <25)
                durum = "normal";
            else if (vke <30)
                durum = "normal üstünde";
            else if (vke <35)
                durum = "obez";
            else if (vke <45)
                durum = "aşırı obez";

            System.out.println("Vke değerin: " + vke + "\n durumun: " +durum );

        }
        System.out.println("boy ortalaması: " + (boyToplam/5));
        System.out.println("kilo ortalaması: " + (kiloToplam/5));
    }

}
