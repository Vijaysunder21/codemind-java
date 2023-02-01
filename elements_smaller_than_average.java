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
        c=c+arr[i];
    }
    int m=c/k;
    int s=0;
    for(int i=0;i<k;i++)
    {
       if(arr[i]<=m)
       {
          s=s+1; 
       }
    }
    System.out.println(s);
    }
}