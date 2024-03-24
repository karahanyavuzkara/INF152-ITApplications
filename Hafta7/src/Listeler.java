import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Listeler {
    public static void main(String[] args) {
	/*	List<String> adlar = new ArrayList<String>();
		adlar.add("Ali");
		System.out.println(adlar);
		adlar.add("Ayşe");
		System.out.println(adlar);
		adlar.add("Mehmet");
		System.out.println(adlar);//listenin tümü
		System.out.println(adlar.get(1));//belirtilen indisteki
		System.out.println(adlar.getFirst());//ilk eleman
		System.out.println(adlar.getLast());//son eleman
		adlar.add(1, "Nurşen");//belirtilen indise ekler
		System.out.println(adlar);//listenin tümü
		adlar.set(1, "Nurten");
		/*
		 * System.out.println(adlar);//indistekini düzeltir String
		 * silinen=adlar.remove(1);
		 * System.out.println("Silinen : "+silinen+" Liste "+adlar); boolean durum
		 * =adlar.remove("Ali"); System.out.println("Durum : "+durum+" Liste "+adlar);
		 * adlar.clear();//tüm listeyi siler System.out.println(" Liste "+adlar);
		 */
		/*System.out.println(" Liste "+adlar);
		System.out.println("adlar.contains(Nurten) : "+adlar.contains("Nurten"));//arananın var olup olmadığını
		System.out.println("adlar.contains(Ayten) : "+adlar.contains("Ayten"));
		System.out.println("adlar.indexOf(Nurten) : "+adlar.indexOf("Nurten"));//indisi döndürür
		System.out.println("adlar.lastIndexOf(Nurten) : "+adlar.lastIndexOf("nurten"));
		System.out.println("adlar.indexOf(Nurten) : "+adlar.indexOf("nurten"));
		System.out.println(adlar.size());
		System.out.println(adlar.toString());
		System.out.println("-----------------");
		for (String ad : adlar) {
			System.out.println(ad);
		}
		System.out.println("-----------------");
		for (int i = 0; i < adlar.size(); i++) {
			System.out.println(adlar.get(i));
		}
		System.out.println("-----------------");
		adlar.sort(null);
		System.out.println(adlar);
		System.out.println("-----------------");
		adlar.sort(Comparator.reverseOrder());
		System.out.println(adlar);*/
        List<Integer> sayilar = Arrays.asList(10,1,-20,40,5,-23,0);
        System.out.println(sayilar);
        System.out.println(sayilar.get(4));
        System.out.println(sayilar.size());
        sayilar.sort(null);
        System.out.println(sayilar);
        int toplam=OrtalamaAl(sayilar);
        for (int i = 0; i < sayilar.size()-1; i++) {
            System.out.print(sayilar.get(i)+ " + ");
        }
        System.out.println(sayilar.get(sayilar.indexOf(sayilar.get(sayilar.size()-1)))+" = "+toplam);
        System.out.println("Ortalaması : "+(toplam/sayilar.size()));
    }

    private static int OrtalamaAl(List<Integer> sayilar) {
        int toplam=0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);
        }
        return toplam;
    }
}