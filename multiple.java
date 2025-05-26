interface A{
    void methodA();
}
interface B{
    void methodB();
}
class C implements A,B{
    public void methodA(){
        System.out.println("this dog eats food");
    }
    public void methodB(){
        System.out.println("this dog barks");
 
    }
}
public class multiple{
    public static void main(String[] args) {
        C  obj=new C();
        obj.methodA();
        obj.methodB();
    }
}
