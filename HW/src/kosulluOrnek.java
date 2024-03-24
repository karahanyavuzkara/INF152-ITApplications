import java.util.Scanner;

public class kosulluOrnek {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notunu giriniz: ");
        int vn = scanner.nextInt();
        System.out.println("Final notunu giriniz: ");
        int fn = scanner.nextInt();

        String harfNotu;
        String gecme;

        int bn = (int) ((vn*.4 + fn*.6) / 2);

        if (bn <= 28) {
            harfNotu = "FF";
            gecme = "KALDI";
            if ( bn <= 39 ) {
                harfNotu = "DD";
                gecme = "Koşullu Geçti";
            }else if ( bn <= 49){
                harfNotu = "DC";
                gecme = "Koşullu Geçti";
            }
            else if ( bn <= 59){
                harfNotu = "CC";
                gecme = "Geçti";
            }
            else if (bn <= 69){
                harfNotu = "BC";
                gecme = "Geçti";
            }
            else if (bn <= 79){
                harfNotu = "BB";
                gecme = "Geçti";
            }
            else if (bn <= 89){
                harfNotu = "BA";
                gecme = "Koşullu Geçti";
            }
            else if (bn <= 100){
                harfNotu = "DD";
                gecme = "Geçti";
            }
            System.out.println(harfNotu);
            System.out.println(gecme);
        }

    }
}
