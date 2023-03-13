import java.util.*;

public class Main { // Tester code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter your choice to update the details");
        System.out.println("1: SBI\n2: ICICI\n3: PNB");
        x = sc.nextInt();
        System.out.println("For any Invalid input Default RBI Guidelines will be considered.");
        System.out.println("Enter minimum balance, maximum withdraw limit and minimum Interest rate");
        int a, b;
        double c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        RBI bank;
        switch (x) {
            case 1:
                bank = new SBI(a, b, c);
                bank.printInfo();
                break;
            case 2:
                bank = new ICICI(a, b, c);
                bank.printInfo();
                break;
            case 3:
                bank = new PNB(a, b, c);
                bank.printInfo();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}