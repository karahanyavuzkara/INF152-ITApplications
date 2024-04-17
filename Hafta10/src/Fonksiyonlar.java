import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void VeriGiris(Scanner giris, List<Ogrenci> ogrenciler) {
		System.out.println("İsim Giriniz : ");
		String ad1=giris.next();
		System.out.println("Vize notu Giriniz : ");
		int vn1=giris.nextInt();
		System.out.println("Final notu Giriniz : ");
		int fn1=giris.nextInt();
		Ogrenci ogrenci=new Ogrenci(ad1,vn1,fn1);
		ogrenciler.add(ogrenci);
		System.out.println(ad1+" Kaydı yapıldı");
	}

	public static void Listele(List<Ogrenci> ogrenciler) {
		System.out.println("Ad\tVize\tFinal\tBaşarı");
		for (Ogrenci ogrenci : ogrenciler) {
			System.out.println(ogrenci.toString());
		}
		
	}

	public static void AdArama(String arananAd, List<Ogrenci> ogrenciler) {
		for (Ogrenci ogrenci : ogrenciler) {
			if(ogrenci.getAd().equalsIgnoreCase(arananAd)) {
				ogrenci.Yazdir();
			}
		}
		
	}

	public static void Ortalama(List<Ogrenci> ogrenciler) {
		int vnt=0,fnt=0,bnt=0;
		for (Ogrenci ogrenci : ogrenciler) {
			vnt+=ogrenci.getVn();
			fnt+=ogrenci.getFn();
			bnt+=ogrenci.getBn();
		}
		System.out.println("Vize Not Ortalaması : "+vnt/ogrenciler.size());
		System.out.println("Final Not Ortalaması : "+fnt/ogrenciler.size());
		System.out.println("Başarı Not Ortalaması : "+bnt/ogrenciler.size());
	}
}
