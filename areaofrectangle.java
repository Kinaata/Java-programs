import java.util.Scanner;
public class areaofrectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length, breadth, area;
        System.out.println("enter length:");
        length=sc.nextInt();
        System.out.println("enter breadth:");
        breadth=sc.nextInt();
        area=length*breadth;
        System.out.println("area of rectangle is "+area);
    }
}
