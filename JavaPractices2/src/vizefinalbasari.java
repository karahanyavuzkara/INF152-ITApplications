import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vizefinalbasari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> isim = new ArrayList<String>();
        List<String> soyisim = new ArrayList<String>();
        List<Integer> vizeNotu = new ArrayList<Integer>();
        List<Integer> finalNotu = new ArrayList<Integer>();
        List<Double> ortalama= new ArrayList<Double>();
        byte menu;
        for (;;){
            Metotlar.Menu();
            menu = scanner.nextByte();
            switch (menu){
                case 1:
                    Metotlar.veriGir(scanner, isim,soyisim,vizeNotu,finalNotu);
                    break;
                case 2:
                    Metotlar.Listeleme(isim, soyisim, vizeNotu, finalNotu);
                    break;
                case 3:
                    Metotlar.arama(scanner,isim,soyisim,vizeNotu,finalNotu);
                    break;
                case 4:
                    Metotlar.ortalama(isim, vizeNotu, finalNotu, ortalama); // Bu satırı güncelleyin
                    break;

                case 5:
                    Metotlar.enKucuk(isim,ortalama);
                    break;

            }
        }

    }
}