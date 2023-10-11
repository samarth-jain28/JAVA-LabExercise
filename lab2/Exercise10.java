import java.util.Scanner;
public class Exercise10{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Enter a No: ");
        n = sc.nextInt();
        if (n%2==0){
            System.out.println("No. is even");
        }else{
            System.out.println("No. is odd");
        }
    }
}