import java.util.Scanner;
class Main {
    public static void main(String[] args)  {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    int l=n.nextInt();
    int c=0;
    for(int i=k;i<=l;i++)
    {
        c=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
            c=c+1;
            }
        }
        if(c==2)
        {
            System.out.println(i);
        }
    }
    }
}