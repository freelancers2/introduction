public class Main {

  public static void main(String[] args) {
    // Main x = new Main(); // instantiation
    System.out.println(greeting("Abu Hamzah"));

   Arithmetics obj = new Arithmetics();
   Arithmetics obj2 = new Arithmetics();

   obj.setX(5);
   obj.setY(6);
    int result =  obj.sum();

   obj2.setX(25);
   obj2.setY(50);
    System.out.println(result);
    System.out.println(obj2.sum());
  }
  // static method is a method can be invoked by the class
  // example Main.greeting("Talal"); if invoked out of the Main class
  // and greeting("Talal"); if invoked inside Main class
  // inside the class we can invoke it without anything
  public static String greeting(String name){

    return "Hello , " + name;
  }
}
