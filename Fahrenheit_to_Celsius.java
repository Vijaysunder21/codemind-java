import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    double f=n.nextDouble();
    double c=(f-32)*(5/9.0);
    System.out.printf("%.2f",c);
  }
}