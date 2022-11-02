import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    float s=0,t=0;
    for(double i=1;i<=k;i++)
    {
        t+=(1/i);
    }
    System.out.format("%.2f",t);
  }
}