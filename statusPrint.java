public class statusPrint {
    public static void main(String[] args){
        classA a = new classA();
        classB b = new classB();
        classA c = new classB();

        a.printStatus();
        b.printStatus();
        c.printStatus();
    }
}
