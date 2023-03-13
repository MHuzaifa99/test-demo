// A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
// Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 
// 'getBalance' which returns the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.



public class Bank {
    int balance = 0;
    Bank(){}

    public int getBalance(){
        return this.balance;
    }


    public static void main(String[] args){
        BankA b1 = new BankA(1000);
        System.out.println(b1.getBalance());

        BankB b2 = new BankB(1500);
        System.out.println(b2.getBalance());

        BankC b3 = new BankC(2000);
        System.out.println(b3.getBalance());
    }
}

