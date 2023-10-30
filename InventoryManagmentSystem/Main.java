import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        while(true){
            int i;
            System.out.println("Inventory Management System: Enter \n1 for Add Product\n2 for Display Inventory\n3 for Exit");
            i = sc.nextInt();
            switch (i){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Exited...");
                    return;
                default :
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}