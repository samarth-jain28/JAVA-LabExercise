import java.util.Scanner;
public class Exercise8{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius of circle: ");
    int r = sc.nextInt();
    System.out.println("Area: "+(r*r*3.14)+" Circumference: "+(2*3.14*r));
    }
}