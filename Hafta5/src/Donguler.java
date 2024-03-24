public class Donguler {
    public static void main(String[] args) {

        /*
         * for (int i = 0; i <10; i++) { //if(i==5) break; if(i==3||i==7) continue;
         * System.out.println(i); } System.out.println("-----------------------------");
         * int k=5; for (; k < 15; k++) { System.out.println(k); }
         * System.out.println("-------------------"); for (int i = 0,j=10; i < 10;
         * i++,j--) { if(i==5 && j==5) continue; System.out.println("i : "+i+" j : "+j);
         * //if(i==5 && j==5) break; }
         */
        int a = 10;
        do {
            System.out.println("artmadanm önceki a : "+a);
            a++;
            System.out.println("arttıktan sonraki a:" +a);

            // }while(a<5);
        } while (a < 15);
        System.out.println("------------------");
        a = 10;
        while (a < 15) {
            a++;
            System.out.println(a);

        }
        ;
        /*
         * do { System.out.println("Sonsuz döngü"); } while(true);
         *
         *
         * for(;;) { System.out.println("Sonsuz döngü"); }
         */
        // System.out.println("Program bitti "+k);
    }
}
