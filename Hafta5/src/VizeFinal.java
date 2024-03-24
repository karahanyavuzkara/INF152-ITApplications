import java.util.Scanner;

public class VizeFinal {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        byte vn, fn, bn;
        String harf, durum;
        System.out.println("Vize notu Giriniz : ");
        vn = giris.nextByte();
        System.out.println("Final notu giriniz : ");
        fn = giris.nextByte();
        bn = (byte) (vn * 0.4 + fn * 0.6);
        if (bn < 30) {
            harf = "ff";
            durum = "Kaldı";
        } else if (bn < 40) {
            harf = "dd";
            durum = "Koşullu geçti";
        }else if (bn < 50) {
            harf = "dc";
            durum = "Koşullu geçti";
        }else if (bn < 60) {
            harf = "cc";
            durum = "geçti";
        }else if (bn < 70) {
            harf = "cb";
            durum = "geçti";
        }else if (bn < 80) {
            harf = "bb";
            durum = "geçti";
        }else if (bn < 90) {
            harf = "ba";
            durum = "geçti";
        } else {
            harf = "aa";
            durum = "geçti";
        }
        System.out.println("Başarı notun : "+bn+"\nHarf karşılığı : "+harf+"\nDurumun : "+durum);
    }

}
