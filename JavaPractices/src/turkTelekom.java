import java.util.ArrayList;
import java.util.Scanner;

public class turkTelekom {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kişi sayısını giriniz: ");
        byte ks = sc.nextByte();

        ArrayList<String> ad = new ArrayList<>();
        ArrayList<Byte> gb = new ArrayList<>();
        ArrayList<Integer> sms = new ArrayList<>();
        ArrayList<Integer> dk = new ArrayList<>();
        byte menu;

        for (int i = 0; i < ks; i++) {
            System.out.println((i + 1) + ". kişinin ismini giriniz:");
            ad.add(sc.next());
            System.out.println((i + 1) + ". kişinin GB harcamasını giriniz:");
            gb.add(sc.nextByte());
            System.out.println((i + 1) + ". kişinin SMS harcamasını giriniz:");
            sms.add(sc.nextInt());
            System.out.println((i+1) + ". kişinin dakika harcamasını giriniz: ");
            dk.add(sc.nextInt());
            System.out.println("Kişi başarıyla oluşturuldu.");
        }



        do {
            System.out.println("1- Yeni Kayıt \n 2- Listeleme \n 3-İsim arama \n 4- Ortalama Fatura" +
                    "\n 5- En yüksek fatura \n 6- En düşük fatura \n 7- Çıkış");
            menu = sc.nextByte();


            switch (menu) {
                case 1:
                    System.out.println("Yeni kişinin ismini giriniz: ");
                    ad.add(sc.next());
                    System.out.println("Yeni kişi kaç GB internet harcadı: ");
                    gb.add(sc.nextByte());
                    System.out.println("Yeni kişi kaç SMS harcadı: ");
                    sms.add(sc.nextInt());
                    System.out.println("Yeni kişi kaç DK harcadı: ");
                    dk.add(sc.nextInt());
                    System.out.println("Yeni kayıt başarıyla oluşturuldu.");
                    break;

                case 2:
                    for (int i = 0; i < ks; i++){
                        System.out.println("Adı: "+ ad.get(i));
                        System.out.println("GB harcaması: "+ gb.get(i));
                        System.out.println("Dakika harcaması: "+ dk.get(i));
                        System.out.println("SMS harcaması: "+ sms.get(i));
                        System.out.println("Fatura miktarı: "+ ((dk.get(i)*.5) + (sms.get(i)*.4) + (gb.get(i)*12)) +" TL");

                    }
                    break;
                case 3:
                    System.out.println("Bulunacak ismi giriniz: ");
                    String arananAd = sc.next();
                    boolean bulundu = false;

                    for (int i = 0; i < ad.size(); i++){
                        if (ad.get(i).equalsIgnoreCase(arananAd)){
                            System.out.println("Adı: "+ ad.get(i));
                            System.out.println("GB harcaması: "+ gb.get(i));
                            System.out.println("Dakika harcaması: "+ dk.get(i));
                            System.out.println("SMS harcaması: "+ sms.get(i));
                            System.out.println("Fatura miktarı: "+ ((dk.get(i)*.5) + (sms.get(i)*.4) + (gb.get(i)*12)) +" TL");
                        }
                    }
                    if (!bulundu){
                        System.out.println("Böyle bir kişi bulunmamaktadır.");
                    }break;

                case 4:
                    double toplam = 0;
                    for (int i = 0; i < ad.size(); i++) {
                        toplam += ((dk.get(i)*.5) + (sms.get(i)*.4) + (gb.get(i)*12));

                    }
                    double oF = toplam / ad.size();
                    System.out.println("Ortalama fatura miktarı: " + oF + " TL");
                    break;
                case 5:
                    double enBFatura = Integer.MIN_VALUE;
                    for (int i = 0; i < ad.size(); i++) {
                        if ()

                    }
            }
        }while (menu!=7);
            sc.close();

    }
}
