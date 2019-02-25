
package polymorphicarguments;


public class PolymorphicArguments {

    
    public static void main(String[] args) {
        NewClass newclass = new NewClass();
        NewClass3 fo = new NewClass3();
        NewClass3 po = new NewClass1();
        newclass.digest(fo); 
        newclass.digest(po);
    }
    
}
