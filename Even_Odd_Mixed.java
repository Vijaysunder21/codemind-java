import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int l=n.nextInt();
    int d=0,c=0,m=0,k=0;
    while(l!=0)
    {
        d=l%10;
        if(d%2==0)
        {
        c=c+1;
        }
        else
        {
        m=m+1;
        }
        l=l/10;
        k=k+1;
    }
    if(c==k)
    {
        System.out.println("Even");
    }
    else if(m==k)
    {
        System.out.println("Odd");
    }
    else
    {
        System.out.println("Mixed");
    }
    }
}