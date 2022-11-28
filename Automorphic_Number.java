import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    int c=1,temp=k;
    int m=k*k;
    while(k!=0)
    {
        c=c*10;
        k=k/10;
    }
    if(m%c==temp)
    {
        System.out.println("Automorphic Number");
    }
    else
    {
        System.out.println("Not an Automorphic Number");
    }
  }
}