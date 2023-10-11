import package1.ClassA;
import package1.ClassB;
//import package2.ClassB;
public class Main{
    public static void main(String [] args){
        ClassA a = new ClassA();
        package2.ClassB b = new package2.ClassB();
        ClassB m = new ClassB();
        a.displayA();
        b.displayB();
        m.displayB();
    }
} 