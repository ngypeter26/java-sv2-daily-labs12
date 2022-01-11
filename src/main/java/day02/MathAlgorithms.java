package day02;

public class MathAlgorithms {

    public int getGreatestDivider(int a, int b){
        int gcd =1;
        for(int i =1; i <= Math.min(a,b);i++){
            if (a%i==0 & b%i==0){
                gcd =i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        MathAlgorithms ma = new MathAlgorithms();

        System.out.println(ma.getGreatestDivider(6,12));

    }

}
