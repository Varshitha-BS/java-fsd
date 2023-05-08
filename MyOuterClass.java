public class MyOuterClass {
  public class MyInnerClass {
    public void display() {
      System.out.println("Inside the inner class");
    }
  }
  public static void main(String[] args) {
    MyOuterClass objOuterClass = new MyOuterClass();
    MyOuterClass.MyInnerClass objInnerClass = objOuterClass.new MyInnerClass();
    objInnerClass.display();
  }
}