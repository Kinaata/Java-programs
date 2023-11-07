import java.util.Scanner;
public class cmpr2strcis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string:");
        String q1=sc.nextLine();
        System.out.println("Enter the 2nd String:");
        String q2=sc.nextLine();
        if(q1.equalsIgnoreCase(q2)){
            System.out.println("2 string r equal");
        }else{
            System.out.println("2 strings r not equal");
        }
    }
}