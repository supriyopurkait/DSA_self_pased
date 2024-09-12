

 abstract class hello{
    abstract void narrow();
 }
 
 public class test_abstract extends hello{
    void narrow()
        {
            System.out.println("hello world");
        }
    public static void main(String[] args) {
        {
             test_abstract ob1 = new test_abstract();
            ob1.narrow();

        }
        
    }
 }