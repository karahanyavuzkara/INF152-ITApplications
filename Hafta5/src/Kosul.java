public class Kosul {

    public static void main(String[] args) {
        int bn = 55;
        String sonuc, sonuc1;
        if (bn < 50)
            sonuc="Kaldı";
        else
            sonuc="Geçti";
        System.out.println(sonuc);
        sonuc1=(bn<50)?"Kaldı":"Geçti";
        System.out.println(sonuc1);

    }

}