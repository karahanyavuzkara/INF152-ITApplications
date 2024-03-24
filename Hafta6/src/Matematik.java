

public class Matematik {

    public static void main(StringSinif[] args) {
        System.out.println(Math.sqrt(25));
        //System.out.println(23.7%1);
        System.out.println(Math.PI);
        System.out.println("Math.ceil(23.3) : "+Math.ceil(23.3));
        System.out.println("Math.floor(23.7) : "+Math.floor(23.7));
        System.out.println("Math.round(23.3) : "+Math.round(23.3));
        System.out.println("Math.round(23.7) : "+Math.round(23.7));
        System.out.println("Math.min(5, 3) : "+Math.min(5, 3));
        System.out.println("Math.max(5, 3) : "+Math.max(5, 3));
        System.out.println("Math.random() : "+Math.random());
        System.out.println("benimCeil(23.3) : "+benimCeil(23.3));
        System.out.println("benimFloor(23.7) : "+benimFloor(23.7));
        System.out.println("benimRound(23.3) : "+benimRound(23.3));
        System.out.println("benimRound(23.7) : "+benimRound(23.7));
        System.out.println("benimMin(5, 3) : "+benimMin(5, 3));
        System.out.println("benimMax(5, 3) : "+benimMax(5, 3));
    }

    private static int benimMax(int i, int j) {
        int max;
        if(i>j)max=i; else
            max=j;
        return max;
    }

    private static int benimMin(int i, int j) {
        int min;
        if(i<j)min=i;
        else min=j;
        return min;
    }

    private static double benimRound(double d) {
        double kalan=d-(int)d;
        //double kalan=d%1;
        if(kalan<0.5) return(int)d;
        else return (int)++d;
    }

    private static double benimFloor(double d) {
        return (int)d;
    }

    private static double benimCeil(double d) {
        return (int)++d;
    }

}