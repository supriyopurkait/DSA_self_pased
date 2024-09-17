public class sample {
    public static void main(String args[]){
        samele_implement ob1 = new samele_implement();
        ob1.data();  // Calling instance method

        // Accessing static method from the interface directly
        smaple1.spti();  // Correct way to access static method in interface
    }
}

interface smaple1 {
    public void data();  // JVM adds public abstract to this method
    int value = 0;       // JVM adds public static final to this variable

    // Default method in interface
    default void prin() {
        System.out.println("hello this is inside of sample 1 default method");
    }

    // Static method in interface
    static void spti() { // By default public added to static methods
        System.out.println("hello this is inside of sample 1 static");
    }
}

class samele_implement implements smaple1 {
    public void data() {
        System.out.println(value + "");  // Accessing the static final variable
    }
}
