import java.util.Scanner;
public class sumof2nums{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("enter a number");
        num1=sc.nextInt();
        System.out.println("enter another number");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("sum is "+sum);
    }
}