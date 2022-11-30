import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    int s=0;
    int[] arr=new int[k];
    for(int i=0;i<k;i++)
    {
        arr[i]=n.nextInt();
        s=s+arr[i];
    }
    float m=s/(float)k;
    System.out.printf("%.2f",m);
  }
}