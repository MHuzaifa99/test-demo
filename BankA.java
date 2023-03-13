public class BankA extends Bank {

    int balance;
    
    BankA(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

}