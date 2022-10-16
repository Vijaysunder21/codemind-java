import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        int c= n.nextInt();
        double f=((c*9)/5.0)+32;
        System.out.format("%.2f",f);
    }
}