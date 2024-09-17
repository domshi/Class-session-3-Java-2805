public class ClassC extends ClassB{
  
  public int c1 = 7;
  public int c2 = 8;

  public ClassC(int a, int b, int c,int d, int e, int f) {
    super(a,b,c,d);
    c1 = e;
    c2 = f;
  }

  public String toString() {
    return "\nThis is ClassC\n c1 is" + c1 + " and c2 is " + c2 + " and b1 is " + b1 + " and b2 is" + b2 + " and a1 is " + a1 + " and a2 is " + a2;
  }
}