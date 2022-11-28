import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    int f=0;
    for(int i=1;i<k/2;i++)
    {
        if((i*(i+1))==k)
        {
            f=1;
            break;
        }
    }
    if(f==1)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
  }
}