import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        int a= n.nextInt();
        int b= n.nextInt();
        int c= n.nextInt();
        double s=(a+b+c)/2.0;
        double k= (s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",Math.sqrt(k));
    }
}