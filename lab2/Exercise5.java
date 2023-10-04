public class Exercise5{
    public static void main(String [] args){
        int a = 5 , b = 6;
        System.out.println("a: "+a+"\n"+"b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: "+a+"\n"+"b: "+b);
    }
}