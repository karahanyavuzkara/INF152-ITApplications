import java.util.ArrayList;
import java.util.Scanner;

public class vizeFinal2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> ad = new ArrayList<>();
        ArrayList<Byte> vn = new ArrayList<>();
        ArrayList<Byte> fn =new ArrayList<>();
        byte menu;

        System.out.println("Kişi sayısını giriniz: ");
        byte ks = sc.nextByte();

        for (int i = 0; i < ks; i++) {
            System.out.println((i+1)+". kişinin ismini giriniz: ");
            ad.add(sc.next());
            System.out.println((i+1)+". kişinin vize notunu giriniz: ");
            vn.add(sc.nextByte());
            System.out.println((i+1)+ ". kişinin final notunu giriniz: ");
            fn.add(sc.nextByte());
            System.out.println("Kişi başarıyla oluşturuldu!");

        }

        do {
            System.out.println("1- Yeni kayıt girişi \n 2- Listeleme \n 3- Ortalama \n 4- İsim sorgulama" +
                    "\n 5- En yüksek başarı notu \n 6- En düşük başarı notu \n7- Çıkış");
            menu = sc.nextByte();
            switch (menu){
                case 1:
                    System.out.println("Yeni kişinin adı: ");
                    ad.add(sc.next());
                    System.out.println("Yeni kişinin vize notu: ");
                    vn.add(sc.nextByte());
                    System.out.println("Yeni kişinin final notu: ");
                    fn.add(sc.nextByte());
                    System.out.println("Yeni kişi başarıyla oluşturuldu!");
                    break;
                case 2:
                    for (int i = 0; i < ks; i++ ) {
                        System.out.println((i+1)+". kişinin ismi: " + ad.get(i));
                        System.out.println((i+1)+". kişinin vize notu: " + vn.get(i));
                        System.out.println((i+1)+ ". kişinin final notu: " + fn.get(i));
                        System.out.println((i+1)+". kişinin başarı notu: "+ ((vn.get(i)+ fn.get(i)) / 2));
                        System.out.println("----------------------------------------");
                    }
                    break;
                case 3:
                    double toplam = 0;
                    double ortalama = 0;
                    for (int i = 0; i < ks; i++){
                        toplam +=  ((vn.get(i)+ fn.get(i)) / 2);

                    }
                    ortalama = toplam / ks;
                    System.out.println("Ortalama başarı notu: "+ ortalama);
                    break;
                case 4:
                    System.out.println("Sorgulamak istediğiniz ismi giriniz: ");
                    String arananAdam = sc.next();
                    boolean bulundu = false;
                    for (int i = 0; i < ks; i++){
                        if (ad.get(i).equalsIgnoreCase(arananAdam)){
                            System.out.println("İsmi: " + ad.get(i) );
                            System.out.println("Final notu: "+ fn.get(i));
                            System.out.println("Vize notu: " + vn.get(i) );
                            System.out.println("Başarı puanı: "+ ((vn.get(i)+ fn.get(i)) / 2) );
                        }
                    }
                    if (!bulundu) {
                        System.out.println(arananAdam + " isimli kişi bulunamadı.");
                    }
                    break;


            }
        }while (menu !=7);



    }
}
