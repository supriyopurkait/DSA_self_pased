public class method_overriding extends child{
    public static void main(String []args)
    {
        method_overriding ob1 = new method_overriding();
        String hold = ob1.hello();
    }
    String hello()
    {
        System.out.println("Hello world this is child class");
        return "k";
    }
    
}
class child{
    Object hello()
    {
        System.out.println("Hello world this is parent class");
        return "";
    }
}
