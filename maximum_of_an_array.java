import java.util.Scanner;
import java.util.*;
class Main {
    public static void main(String[] args)  {
    Scanner n=new Scanner(System.in);
    int k=n.nextInt();
    int[] arr=new int[k];
    for(int i=0;i<k;i++)
    {
        arr[i]=n.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[k-1]);
    }
}