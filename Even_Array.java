import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    int[] arr=new int[k];
    int c=0;
    for(int i=0;i<k;i++)
    {
        arr[i]=n.nextInt();
    }
    for(int i=0;i<k;i++)
    {
        if(arr[i]%2==0)
        {
            c=c+1;
        }
    }
    if(c==k)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
}