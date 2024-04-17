import java.util.Scanner;

public class Calisan {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Ogrenci ogr=new Ogrenci();
		ogr.setAd("Ali");
		ogr.setVn(70);
		ogr.setFn(80);
		ogr.BasariNotHesapla();
		ogr.Yazdir();
		System.out.println(ogr.getAd());
		Ogrenci ogr1=new Ogrenci("Ayşe",65,89);
		ogr1.Yazdir();
		System.out.println(ogr1.toString());
	}

}
