import java.util.*;
public class Functions {
  public static void printFactorial(int n) {
    if(n < 0) {
      System.out.println("Invalid number");
      return;
      int factorial = 1;
      for(int i = n; i >= n; i--) {
        factorial = factorial * i;
      }
      System.out.println(factorial);
      return;
    }
    public static void main(STring args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printFactorial(n);
    }
  }
