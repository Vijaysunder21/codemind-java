import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int l=n.nextInt();
    int r=n.nextInt();
    int k=n.nextInt();
    int c=0;
    for(int i=l;i<=r;i++)
    {
        if(i%k==0)
        {
            c=c+1;
        }
    }
    System.out.println(c);
    }
}