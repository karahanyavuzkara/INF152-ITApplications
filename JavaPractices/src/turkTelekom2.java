import java.util.ArrayList;
import java.util.Scanner;

public class turkTelekom2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kişi sayısını giriniz: ");
        byte ks = sc.nextByte();

        ArrayList<String> isim = new ArrayList<>();
        ArrayList<Integer> dk = new ArrayList<>();
        ArrayList<Integer> sms = new ArrayList<>();
        ArrayList<Byte> gb = new ArrayList<>();
        byte menu;

        for (int i = 0; i < ks; i++){
            System.out.println((i+1)+ ". kişinin ismini giriniz: ");
            isim.add(sc.next());
            System.out.println((i+1) + ". kişinin dakika harcamasını giriniz: ");
            dk.add(sc.nextInt());
            System.out.println((i+1) +". kişinin SMS harcamasını giriniz: ");
            sms.add(sc.nextInt());
            System.out.println((i+1)+ ". kişinin GB harcamasını giriniz: ");
            gb.add(sc.nextByte());
            System.out.println("Yeni kişi başarıyla oluşturuldu...");
        }

        do {
            System.out.println("1- Yeni Kayıt Oluştur \n 2- Listeleme \n 3- Ortalama \n 4- İsim sorgulama" +
                    "\n 5- ");

            menu = sc.nextByte();
            switch (menu) {
                case 1:
                        System.out.println("Yeni kişinin ismi: ");
                        isim.add(sc.next());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }

        }while (menu != 7);
    }
}
