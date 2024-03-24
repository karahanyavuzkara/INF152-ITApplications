import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Kişi sayısı giriniz: ");
        byte ks = giris.nextByte();
        String ad[] = new String[ks];
        byte vn[] = new byte[ks];
        byte fn[] = new byte[ks];
        byte bn[] = new byte[ks];
        byte menu;

        for (int i = 0; i < ks; i++) {
            System.out.print((i + 1) + ": ismi giriniz: ");
            ad[i] = giris.next();
            System.out.print((i + 1) + ": vize notu giriniz: ");
            vn[i] = giris.nextByte();
            System.out.print((i + 1) + ": Final notu giriniz: ");
            fn[i] = giris.nextByte();
            bn[i] = (byte) (vn[i] * .4 + fn[i] * 0.6);

        }
        for (; ; ) {
            System.out.print("1-Listeleme \n 2-İsim arama  \n 3-En büyük başarı notu: \n 4-En küçük başarı notu: \n 5-Ortalamalar \n6- Cıkıs");
            menu = giris.nextByte();
            switch (menu) {

                case 1:
                    for (int i = 0; i < ks; i++) {
                        System.out.println("Adı: " + ad[i]);
                        System.out.println("Vize notu: " + vn[i]);
                        System.out.println("Final notu: " + fn[i]);
                        System.out.println("Başarı notu: " + bn[i]);

                    }
                    break;

                case 2:
                    System.out.println("Aranacak adı giriniz: ");
                    String isim = giris.next();

                    for (int i = 0; i < ks; i++) {
                        if (isim.equals(ad[i])) {
                            System.out.println("Adı: " + ad[i]);
                            System.out.println("Vize notu: " + vn[i]);
                            System.out.println("Final notu: " + fn[i]);
                            System.out.println("Başarı notu: " + bn[i]);
                        }
                    }
                    break;
                case 3:
                    byte enb = bn[0];
                    for (int i = 1; i < ks; i++) {
                        if (bn[i] > enb) enb = bn[i];
                    }
                    System.out.println("En büyük  başarı notu : " + enb);
                    for (int i = 0; i < ks; i++) {

                        if (bn[i] == enb) {
                            System.out.println("Adı: " + ad[i]);
                            System.out.println("Vize notu:" + vn[i]);
                            System.out.println("Final notu:" + fn[i]);
                            System.out.println("Başarı notu:" + bn[i]);
                        }
                    }
                    break;
                case 4:
                    byte enk = bn[0];
                    for (int i = 1; i < ks; i++) {
                        if (bn[i] < enk)
                            enk = bn[i];
                    }
                    System.out.println("En küçük  başarı notu : " + enk);


                    break;

                case 5:

                    int bnt = 0;
                    for (int i = 0; i < ks; i++) {
                        bnt += bn[i];
                    }
                    int ortalama = bnt / ks;
                    System.out.println("Ortalama: "+ ortalama);

                    break;
                case 6:
                    return;


            }
        }
    }
}