import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    for(int i=0;i<=k;i++)
    {
        int a=n.nextInt();
        int b=n.nextInt();
        int c=0;
        for(int j=a;j<=b;j++)
        {
            int l=j%10;
            if(l==2 || l==3 || l==9)
            {
                c=c+1;
            }
        }
        System.out.println(c);
    }
  }
}