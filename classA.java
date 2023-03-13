// uppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static method with the same name to print "Child". 
// Now call this method by the objects of the two classes. Also, call this method by an object of the parent class refering to the child 
// class i.e. A obj = new B()

public class classA {
    classA() {
    }

    public void printStatus() {
        System.out.println("Parent");
    }
}
