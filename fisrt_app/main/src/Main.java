public class Main {

  public static void main(String[] args) {
    // Main x = new Main(); // instantiation
    System.out.println(greeting("Abu Hamzah"));
  }
  // static method is a method can be invoked by the class
  // inside the class we can invoke it without anything
  public static String greeting(String name){

    return "Hello , " + name;
  }
}
