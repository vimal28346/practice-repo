import java.util.*;
class Main{
    public static void main(String x[]){
        System.out.println("Enter two numbers:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        obj.close();
    }
}