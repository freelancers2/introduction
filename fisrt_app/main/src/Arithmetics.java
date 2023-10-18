public class Arithmetics {

  private int x ; // private field x
  private int y;  // private field y

  public void setX(int x) {
      this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  // instance methods needs to be invoked by instance
  public  int sum(){
    return this.x+ this.y;
  }

}
