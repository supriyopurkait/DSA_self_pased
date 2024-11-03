class Exp{
    public static void main(String args[]){
        System.out.println("hello world");
        Excep ob = new Excep();
        ob.check();
    }
}
class Excep
{
    void check(){
        try {
            int a=0,b=9,c;
            c=b/a;
            System.out.println("this is the result: "+c);
            
        } catch (Exception e) {
            System.out.println("here in catch");
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
/*
 *1.Exception name
 * 2.Except Descprition
 * 3.Stack Trace or the line no.
 */