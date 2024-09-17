public class ClassB extends ClassA {

  public int b1 = 64;
  public int b2 = 13;

  public ClassB(int a, int b, int c, int d) {
    super(a,b);
    b1 = c;
    b2 = d;
  }

  public String toString() {
    return "\nThis is ClassA\n a1 is " + b1 + " and a2 is " + b2 + "\nand also, this is ClassA,where a1 is " + a1 + " and a2 is " + a2;
  }
}