public class FonksiyonKullanim {
    public static void main(String[] args) {
        Merhaba();
        Merhaba();
        String ad="Ali";
        MerhabaParametreli(ad);
        MerhabaParametreli("Veli");
        int ortalama=OrtalamaHesap(5,8);
        int sayi=OrtalamaHesap(2,6,10);
        double sayi2=OrtalamaHesap(2.4,6.8);
    }
    private static double OrtalamaHesap(double d, double e) {
        // TODO Auto-generated method stub
        return 0;
    }
    private static int OrtalamaHesap(int i, int j, int k) {
        // TODO Auto-generated method stub
        return (i+j+k)/3;
    }
    //parametreli ve geri dönüşlü
    private static int OrtalamaHesap(int i, int j) {
        int ort=(i+j)/2;
        return ort;
    }
    //parametreli
    private static void MerhabaParametreli(String ad) {
        System.out.println("MErhaba "+ad+" NE haber");
    }
    //parametresiz
    private static void Merhaba() {
        System.out.println("Merhaba Ne haber");

    }
}
