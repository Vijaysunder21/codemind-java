import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    int c=0;
    int[] arr=new int[k];
    for(int i=0;i<k;i++)
    {
        arr[i]=n.nextInt();
    }
    int l=n.nextInt();
    for(int i=0;i<k;i++)
    {
        if(arr[i]==l)
        {
            c=1;
        }
    }
    if(c==0)
    {
        System.out.println("False");
    }
    else
    {
        System.out.println("True");
    }
  }
}