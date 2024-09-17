interface Innersample2 {
    void sample1();  // Method from the first interface
}

interface Innersample3 extends Innersample2 {
    void sampl();  // Method from the second interface
}

public class sample2 implements Innersample3 {
    public static void main(String[] args) {
        sample2 ob = new sample2();
        ob.sample1();  // Calling the method from Innersample2
        ob.sampl();    // Calling the method from Innersample3
    }

    
    public void sample1() {
        System.out.println("This is the body of sample1 method from Innersample2");
    }

    
    public void sampl() {
        System.out.println("This is the body of sampl method from Innersample3");
    }
}
